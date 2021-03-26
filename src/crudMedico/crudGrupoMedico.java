package crudMedico;

import javax.swing.JPanel;

import control.Control;

public class crudGrupoMedico extends JPanel{
	private inicioCrudMedico inicio;
	private agregarMedico agregar; 
	private modificarMedico modificar;
	private eliminarMedico eliminar;
	private verMedico ver; 
	
	public crudGrupoMedico() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		inicio=new inicioCrudMedico();
		agregar=new agregarMedico();
		modificar=new modificarMedico();
		eliminar=new eliminarMedico();
		ver=new verMedico();
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
		if (seccion.equals("medico")) {
			inicio.setVisible(true);
			add(inicio);
		}
		if (seccion.equals("agregarMedico")) {
			agregar.setVisible(true);
			add(agregar);
		}
		if(seccion.equals("modificarMedico")) {
			modificar.setVisible(true);
			add(modificar);
		}
		if(seccion.equals("eliminarMedico")) {
			eliminar.setVisible(true);
			add(eliminar);
		}
		if(seccion.equals("verMedico")) {
			ver.setVisible(true);
			add(ver);
		}
	}
	public void salir(String seccion) {
		if (seccion.equals("medico")) {
			inicio.setVisible(false);
			remove(inicio);
		}
		if (seccion.equals("atrasMedico")) {
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
		if (seccion.equals("verMedico")) {
			for (int i = 0; i < entradas.length; i++) {
				ver.getModeloTabla().addRow(entradas[i]);
			}
		}
		if(seccion.equals("buscarMedicoModificar")) {
			if(entradas[0].equals("-1")) {
			}
			else {
				modificar.getTxtDocumento().setText(entradas[0][1]);
				modificar.getTxtNumeroLicencia().setText(entradas[0][2]);
				modificar.getTxtNombre().setText(entradas[0][3]);
				modificar.getTxtApellido().setText(entradas[0][4]);
				modificar.getjCbcargo().setSelectedItem(entradas[0][5]);
			}
		}
		if(seccion.equals("buscarMedicoEliminar")) {
			if(entradas[0].equals("-1")) {
			}
			else {
				eliminar.getTxtDocumento().setText(entradas[0][1]);
				eliminar.getTxtNumeroLicencia().setText(entradas[0][2]);
				eliminar.getTxtNombre().setText(entradas[0][3]);
				eliminar.getTxtApellido().setText(entradas[0][4]);
				eliminar.getjCbcargo().setSelectedItem(entradas[0][5]);
			}	
		}
	}

	public String[] leer(String seccion) {
		String[] datosMedico = null;
		if (seccion.equals("guardarMedico")) {
			datosMedico = new String[5];
			datosMedico[0] = agregar.getTxtDocumento().getText();
			datosMedico[1] = agregar.getTxtNumeroLicencia().getText();
			datosMedico[2] = agregar.getTxtNombre().getText();
			datosMedico[3] = agregar.getTxtApellido().getText();
			datosMedico[4] = String.valueOf(agregar.getjCbcargo().getSelectedItem());
		}
		if(seccion.equals("buscarMedicoModificar")) {
			datosMedico =new String[1];
			datosMedico[0]=modificar.getTxtDocumento().getText();
		}
		if(seccion.equals("btnModificarMedico")) {
			datosMedico = new String[5];
			datosMedico[0] = modificar.getTxtDocumento().getText();
			datosMedico[1] = modificar.getTxtNumeroLicencia().getText();
			datosMedico[2] = modificar.getTxtNombre().getText();
			datosMedico[3] = modificar.getTxtApellido().getText();
			datosMedico[4] = String.valueOf(modificar.getjCbcargo().getSelectedItem());
		}
		if(seccion.equals("buscarMedicoEliminar")) {
			datosMedico =new String[1];
			datosMedico[0]=eliminar.getTxtDocumento().getText();
		}
		if(seccion.equals("btnEliminarMedico")) {
			datosMedico =new String[1];
			datosMedico[0]=eliminar.getTxtDocumento().getText();
		}
		return datosMedico;
	}
	//Getters/Setters
		public inicioCrudMedico getInicio() {
			return inicio;
		}
		public agregarMedico getAgregar() {
			return agregar;
		}	
}
