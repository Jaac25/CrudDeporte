package crudDeportivo;

import javax.swing.JPanel;

import control.Control;

public class crudGrupoDeportivo extends JPanel{
	private inicioCrudDeportivo inicio;
	private agregarDeportivo agregar;
	private modificarDeportivo modificar;
	private eliminarDeportivo eliminar;
	private verJugador ver;
	
	public crudGrupoDeportivo() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		inicio=new inicioCrudDeportivo();
		agregar=new agregarDeportivo();
		modificar=new modificarDeportivo();
		eliminar = new eliminarDeportivo();
		ver =new verJugador();
	}
	private void caracteristicas() {
		inicio.setBounds(160, 0, 300, 350);
		agregar.setBounds(5, 15, 600, 480);
		modificar.setBounds(5, 15, 600, 480);
		eliminar.setBounds(5, 15, 600, 480);
		ver.setBounds(5, 15, 600, 480);
	}
	private void agregar() {
		add(inicio);	
	}	
	public void asignarControl(Control control) {
		inicio.getBtnAgregar().addActionListener(control);
		inicio.getBtnModificar().addActionListener(control);
		inicio.getBtnEliminar().addActionListener(control);
		inicio.getBtnVer().addActionListener(control);
		inicio.getBtnGuardarSalir().addActionListener(control);
		
		agregar.getBtnAtras().addActionListener(control);
		agregar.getBtnGuardar().addActionListener(control);
		
		modificar.getBtnAtras().addActionListener(control);
		modificar.getBtnBuscar().addActionListener(control);
		modificar.getBtnModificar().addActionListener(control);
		
		eliminar.getBtnAtras().addActionListener(control);
		eliminar.getBtnBuscar().addActionListener(control);
		eliminar.getBtnEliminar().addActionListener(control);
		
		ver.getBtnAtras().addActionListener(control);	
		}	
	public void iniciar(String seccion) {
		if (seccion.equals("deportivo")) {
			inicio.setVisible(true);
			add(inicio);
		}
		if (seccion.equals("agregarJugador")) {
			agregar.setVisible(true);
			add(agregar);
		}
		if(seccion.equals("modificarJugador")) {
			modificar.setVisible(true);
			add(modificar);
		}
		if(seccion.equals("eliminarJugador")) {
			eliminar.setVisible(true);
			add(eliminar);
		}
		if(seccion.equals("verJugador")) {
			ver.setVisible(true);
			add(ver);
		}
	}	
	public void salir(String seccion) {
		if (seccion.equals("deportivo")) {
			inicio.setVisible(false);
			remove(inicio);
		}
		if (seccion.equals("atrasDeportivo")) {
			agregar.setVisible(false);
			remove(agregar);
			modificar.setVisible(false);
			remove(modificar);
			eliminar.setVisible(false);
			remove(eliminar);
			ver.setVisible(false);
			remove(ver);
		}
	}
	public void limpiarTabla(){
		for (int i = 0; i < ver.getModeloTabla().getRowCount(); i++) {
			ver.getModeloTabla().removeRow(i);
			i--;
		}
	}
	public void escribir(String[][] entradas, String seccion) {
		limpiarTabla();
		if (seccion.equals("verJugador")) {
			for (int i = 0; i < entradas.length; i++) {
				ver.getModeloTabla().addRow(entradas[i]);
			}
		}
		if(seccion.equals("buscarDeportivoModificar")) {
			if(entradas[0].equals("-1")) {
			}
			else {
				modificar.getTxtDocumento().setText(entradas[0][1]);
				modificar.getTxtDorsal().setText(entradas[0][2]);
				modificar.getTxtNombre().setText(entradas[0][3]);
				modificar.getTxtApellido().setText(entradas[0][4]);
				modificar.getjCbPosicion().setSelectedItem(entradas[0][5]);
			}
		}
		if(seccion.equals("buscarDeportivoEliminar")) {
			if(entradas[0].equals("-1")) {
			}
			else {
				eliminar.getTxtDocumento().setText(entradas[0][1]);
				eliminar.getTxtDorsal().setText(entradas[0][2]);
				eliminar.getTxtNombre().setText(entradas[0][3]);
				eliminar.getTxtApellido().setText(entradas[0][4]);
				eliminar.getjCbPosicion().setSelectedItem(entradas[0][5]);
			}	
		}
	}	
	public String[] leer(String seccion) {
		String[] datosDeportivo = null;
		if (seccion.equals("guardarJugador")) {
			datosDeportivo = new String[5];
			datosDeportivo[0] = agregar.getTxtDocumento().getText();
			datosDeportivo[1] = agregar.getTxtDorsal().getText();
			datosDeportivo[2] = agregar.getTxtNombre().getText();
			datosDeportivo[3] = agregar.getTxtApellido().getText();
			datosDeportivo[4] = String.valueOf(agregar.getjCbPosicion().getSelectedItem());
		}
		if(seccion.equals("buscarDeportivoModificar")){
			datosDeportivo = new String[1];
			datosDeportivo[0] = modificar.getTxtDocumento().getText();
		}
		if(seccion.equals("buscarDeportivoEliminar")) {
			datosDeportivo=new String[1];
			datosDeportivo[0] = eliminar.getTxtDocumento().getText();
		}
		if(seccion.equals("btnModificarDeportivo")) {
			datosDeportivo = new String[5];
			datosDeportivo[0] = modificar.getTxtDocumento().getText();
			datosDeportivo[1] = modificar.getTxtDorsal().getText();
			datosDeportivo[2] = modificar.getTxtNombre().getText();
			datosDeportivo[3] = modificar.getTxtApellido().getText();
			datosDeportivo[4] = String.valueOf(modificar.getjCbPosicion().getSelectedItem());
		}
		if(seccion.equals("btnEliminarDeportivo")) {
			datosDeportivo=new String[1];
			datosDeportivo[0]=eliminar.getTxtDocumento().getText();
		}
		return datosDeportivo;
	}	
	//Getters/Setters
	public inicioCrudDeportivo getInicio() {
		return inicio;
	}
	public agregarDeportivo getAgregar() {
		return agregar;
	}
}
