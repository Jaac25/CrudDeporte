package crudTecnico;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import control.Control;
import vista.Acciones;

public class crudGrupoTecnico extends JPanel{
	private inicioCrudTecnico inicio=new inicioCrudTecnico();
	private agregarTecnico agregar;
	private modificarTecnico modificar;
	private eliminarTecnico eliminar;
	private verTecnico ver;
	
	public crudGrupoTecnico() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		agregar=new agregarTecnico();
		modificar=new modificarTecnico();
		eliminar=new eliminarTecnico();
		ver=new verTecnico();		
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
		if (seccion.equals("tecnico")) {
			inicio.setVisible(true);
			add(inicio);
		}
		if (seccion.equals("agregarTecnico")) {
			agregar.setVisible(true);
			add(agregar);
		}
		if(seccion.equals("modificarTecnico")) {
			modificar.setVisible(true);
			add(modificar);
		}
		if(seccion.equals("eliminarTecnico")) {
			eliminar.setVisible(true);
			add(eliminar);
		}
		if(seccion.equals("verTecnico")) {
			ver.setVisible(true);
			add(ver);
		}
	}	
	public void salir(String seccion) {
		if (seccion.equals("tecnico")) {
			inicio.setVisible(false);
			remove(inicio);
		}		
		if (seccion.equals("atrasTecnico")) {
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
		if (seccion.equals("verTecnico")) {
			for (int i = 0; i < entradas.length; i++) {
				ver.getModeloTabla().addRow(entradas[i]);
			}
		}
		if (seccion.equals("buscarTecnicoModificar")) {
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
		if (seccion.equals("buscarTecnicoEliminar")) {
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
		String[] datosTecnico = null;
		if (seccion.equals("guardarTecnico")) {
			datosTecnico = new String[5];
			datosTecnico[0] = agregar.getTxtDocumento().getText();
			datosTecnico[1] = agregar.getTxtNumeroLicencia().getText();
			datosTecnico[2] = agregar.getTxtNombre().getText();
			datosTecnico[3] = agregar.getTxtApellido().getText();
			datosTecnico[4] = String.valueOf(agregar.getjCbcargo().getSelectedItem());
		}
		if (seccion.equals("buscarTecnicoModificar")) {
			datosTecnico = new String[1];
			datosTecnico[0] = modificar.getTxtDocumento().getText();
		}
		if(seccion.equals("btnModificarTecnico")){
			datosTecnico = new String[5];
			datosTecnico[0] = modificar.getTxtDocumento().getText();
			datosTecnico[1] = modificar.getTxtNumeroLicencia().getText();
			datosTecnico[2] = modificar.getTxtNombre().getText();
			datosTecnico[3] = modificar.getTxtApellido().getText();
			datosTecnico[4] = String.valueOf(modificar.getjCbcargo().getSelectedItem());
		}
		if(seccion.equals("buscarTecnicoEliminar")) {
			datosTecnico = new String[1];
			datosTecnico[0] = eliminar.getTxtDocumento().getText();
		}
		if(seccion.equals("btnEliminarTecnico")) {
			datosTecnico=new String[1];
			datosTecnico[0]=eliminar.getTxtDocumento().getText();
		}
		return datosTecnico;
	}	
}
