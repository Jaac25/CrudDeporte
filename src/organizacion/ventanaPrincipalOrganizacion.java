package organizacion;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import control.Control;

public class ventanaPrincipalOrganizacion extends JPanel{
	
	private inicioOrganizacion inicio;
	private escogerGrupoMedico escogerGrupoMed;
	private escogerGrupoTecnico escogerGrupoTec;
	private escogerGrupoDeportivo escogerGrupoDep;
	private formaciones formaciones;
	private VerEquipo verEquipo;
	
	public ventanaPrincipalOrganizacion() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		inicio=new inicioOrganizacion();
		escogerGrupoMed=new escogerGrupoMedico();
		escogerGrupoTec=new escogerGrupoTecnico();
		escogerGrupoDep=new escogerGrupoDeportivo();
		formaciones=new formaciones();
		verEquipo=new VerEquipo();
	}
	private void caracteristicas() {
		inicio.setBounds(0, 0, 600, 480);
		escogerGrupoMed.setBounds(0, 0, 600, 470);
		escogerGrupoTec.setBounds(0, 0, 600, 470);
		escogerGrupoDep.setBounds(0, 0, 600, 470);
		formaciones.setBounds(0, 0, 600, 470);
		verEquipo.setBounds(0, 0, 600, 470);
	}
	private void agregar() {
		add(inicio);	
	}	
	public void asignarControl(Control control) {
		inicio.getBtnOrganizarEquipo().addActionListener(control);
		inicio.getBtnGuardarSalir().addActionListener(control);
		
		escogerGrupoMed.getBtnAtras().addActionListener(control);
		escogerGrupoMed.getBtnSiguiente().addActionListener(control);
		escogerGrupoMed.getBtnAgregar().addActionListener(control);
		escogerGrupoMed.getBtnRemover().addActionListener(control);
		
		escogerGrupoTec.getBtnAtras().addActionListener(control);
		escogerGrupoTec.getBtnSiguiente().addActionListener(control);
		escogerGrupoTec.getBtnAgregar().addActionListener(control);
		escogerGrupoTec.getBtnRemover().addActionListener(control);
		
		escogerGrupoDep.getBtnAtras().addActionListener(control);
		escogerGrupoDep.getBtnSiguiente().addActionListener(control);
		escogerGrupoDep.getBtnAgregar().addActionListener(control);
		escogerGrupoDep.getBtnRemover().addActionListener(control);
		
		formaciones.getBtnMirar().addActionListener(control);
		formaciones.getBtnAtras().addActionListener(control);
		formaciones.getBtnGuardar().addActionListener(control);
		
		verEquipo.getBtnAtras().addActionListener(control);
		verEquipo.getBtnMenu().addActionListener(control);
		
	}
	public void limpiarTabla(String seccion){
		if(seccion.equals("escogerGrupoMed")) {
			escogerGrupoMed.getModelElegir().removeAllElements();
			escogerGrupoMed.getModelElegido().removeAllElements();
		}
		if(seccion.equals("escogerGrupoTec")) {
			escogerGrupoTec.getModelElegir().removeAllElements();
			escogerGrupoTec.getModelElegido().removeAllElements();
		}
		if(seccion.equals("escogerGrupoDep")) {
			escogerGrupoDep.getModelElegir().removeAllElements();
			escogerGrupoDep.getModelElegido().removeAllElements();
		}
	}
	private void limpiarTablaEquipo() {
		for (int i = 0; i < verEquipo.getModeloTabla().getRowCount(); i++) {
			verEquipo.getModeloTabla().removeRow(i);
			i--;
		}	
	}
	
	public void iniciar(String seccion) {
		if(seccion.equals("organizacion")) {
			inicio.setVisible(true);
			add(inicio);
		}
		if(seccion.equals("escogerGrupoMed")) {
			escogerGrupoMed.setVisible(true);
			add(escogerGrupoMed);
		}
		if(seccion.equals("escogerGrupoTec")) {
			escogerGrupoTec.setVisible(true);
			add(escogerGrupoTec);
		}
		if(seccion.equals("escogerGrupoDep")) {
			escogerGrupoDep.setVisible(true);
			add(escogerGrupoDep);
		}
		if(seccion.equals("formaciones")) {
			formaciones.setVisible(true);
			add(formaciones);
		}
		if(seccion.equals("verEquipo")) {
			verEquipo.setVisible(true);
			add(verEquipo);
		}
		if(seccion.equals("mirar")) {
			if(formaciones.getFormacion1().isSelected()==true) {
				formaciones.add(formaciones.getLblImagen1());
				formaciones.remove(formaciones.getLblImagen2());
				formaciones.remove(formaciones.getLblImagen3());
				formaciones.remove(formaciones.getLblImagen4());
				formaciones.remove(formaciones.getLblImagen5());
				formaciones.remove(formaciones.getLblImagen6());
			}
			else if(formaciones.getFormacion2().isSelected()==true) {
				formaciones.add(formaciones.getLblImagen2());
				formaciones.remove(formaciones.getLblImagen1());
				formaciones.remove(formaciones.getLblImagen3());
				formaciones.remove(formaciones.getLblImagen4());
				formaciones.remove(formaciones.getLblImagen5());
				formaciones.remove(formaciones.getLblImagen6());
			}
			else if(formaciones.getFormacion3().isSelected()==true) {
				formaciones.add(formaciones.getLblImagen3());
				formaciones.remove(formaciones.getLblImagen1());
				formaciones.remove(formaciones.getLblImagen2());
				formaciones.remove(formaciones.getLblImagen4());
				formaciones.remove(formaciones.getLblImagen5());
				formaciones.remove(formaciones.getLblImagen6());
			}
			else if(formaciones.getFormacion4().isSelected()==true) {
				formaciones.add(formaciones.getLblImagen4());
				formaciones.remove(formaciones.getLblImagen1());
				formaciones.remove(formaciones.getLblImagen3());
				formaciones.remove(formaciones.getLblImagen2());
				formaciones.remove(formaciones.getLblImagen5());
				formaciones.remove(formaciones.getLblImagen6());
			}
			else if(formaciones.getFormacion5().isSelected()==true) {
				formaciones.add(formaciones.getLblImagen5());
				formaciones.remove(formaciones.getLblImagen1());
				formaciones.remove(formaciones.getLblImagen3());
				formaciones.remove(formaciones.getLblImagen4());
				formaciones.remove(formaciones.getLblImagen2());
				formaciones.remove(formaciones.getLblImagen6());
			}
			else if(formaciones.getFormacion6().isSelected()==true) {
				formaciones.add(formaciones.getLblImagen6());
				formaciones.remove(formaciones.getLblImagen1());
				formaciones.remove(formaciones.getLblImagen3());
				formaciones.remove(formaciones.getLblImagen4());
				formaciones.remove(formaciones.getLblImagen5());
				formaciones.remove(formaciones.getLblImagen2());
			}
		}
	}	
	public void salir(String seccion) {
		if(seccion.equals("organizacion")) {
			inicio.setVisible(false);
			remove(inicio);
		}
		if(seccion.equals("salirMedico")) {
			escogerGrupoMed.setVisible(false);
			remove(escogerGrupoMed);
		}
		if(seccion.equals("salirTecnico")) {
			escogerGrupoTec.setVisible(false);
			remove(escogerGrupoTec);
		}
		if(seccion.equals("salirDeportivo")) {
			escogerGrupoDep.setVisible(false);
			remove(escogerGrupoDep);
		}
		if(seccion.equals("salirFormaciones")) {
			formaciones.setVisible(false);
			remove(formaciones);
		}
		if(seccion.equals("atrasEquipo")) {
			verEquipo.setVisible(false);
			remove(verEquipo);
		}
	}
	public String[] leer(String seccion) {
		String[]datosElegir=null;
		if(seccion.equals("agregarListaMedico")){
			datosElegir=new String[1];
			if(escogerGrupoMed.getModelElegir().size()>0) {
				datosElegir[0] = String.valueOf(escogerGrupoMed.getjListaElegir().getSelectedIndex());
			}
			else {
				JOptionPane.showMessageDialog(null,"La lista está vacia");
			}
		}
		if(seccion.equals("removerListaMedico")) {
			datosElegir=new String[1];
			if(escogerGrupoMed.getModelElegido().size()>0) {
				datosElegir[0] = String.valueOf(escogerGrupoMed.getjListaElegido().getSelectedIndex());
			}	
			else {
				JOptionPane.showMessageDialog(null,"La lista está vacia");
			}
		}
		if(seccion.equals("cargarMedico")) {
			datosElegir=new String[escogerGrupoMed.getModelElegido().size()];
			for(int i=0;i<escogerGrupoMed.getModelElegido().size();i++) {
				datosElegir[i] = String.valueOf(escogerGrupoMed.getjListaElegido().getSelectedIndex());
			}
		}
		if(seccion.equals("cargarTecnico")) {
			datosElegir=new String[escogerGrupoTec.getModelElegido().size()];
			for(int i=0;i<escogerGrupoTec.getModelElegido().size();i++) {
				datosElegir[i] = String.valueOf(escogerGrupoTec.getjListaElegido().getSelectedValue());
			}
		}
		if(seccion.equals("cargarJugador")) {
			datosElegir=new String[escogerGrupoDep.getModelElegido().size()];
			for(int i=0;i<escogerGrupoDep.getModelElegido().size();i++) {
				datosElegir[i] = String.valueOf(escogerGrupoDep.getjListaElegido().getSelectedValue());
			}
		}
		if(seccion.equals("agregarListaTecnico")) {
			datosElegir=new String[1];
			if(escogerGrupoTec.getModelElegir().size()>0) {
				datosElegir[0] = String.valueOf(escogerGrupoTec.getjListaElegir().getSelectedIndex());
			}	
			else {
				JOptionPane.showMessageDialog(null,"La lista está vacia");
			}
		}
		if(seccion.equals("removerListaTecnico")) {
			datosElegir=new String[1];
			if(escogerGrupoTec.getModelElegido().size()>0) {
				datosElegir[0] = String.valueOf(escogerGrupoTec.getjListaElegido().getSelectedIndex());
			}	
			else {
				JOptionPane.showMessageDialog(null,"La lista está vacia");
			}
		}
		if(seccion.equals("agregarListaDeportivo")) {
			datosElegir=new String[1];
			if(escogerGrupoDep.getModelElegir().size()>0) {
				datosElegir[0] = String.valueOf(escogerGrupoDep.getjListaElegir().getSelectedIndex());
			}	
			else {
				JOptionPane.showMessageDialog(null,"La lista está vacia");
			}
		}
		if(seccion.equals("removerListaDeportivo")) {
			datosElegir=new String[1];
			if(escogerGrupoDep.getModelElegido().size()>0) {
				datosElegir[0] = String.valueOf(escogerGrupoDep.getjListaElegido().getSelectedIndex());
			}	
			else {
				JOptionPane.showMessageDialog(null,"La lista está vacia");
			}
		}
		return datosElegir;
	}
	public void escribir(String[][] entradas, String seccion) {
		if(seccion.equals("escogerGrupoMed")) {
			limpiarTabla(seccion);
			for (int i = 0; i < entradas.length; i++) {
				escogerGrupoMed.getModelElegir().addElement(entradas[i][0]+" "+entradas[i][1]+" : "+entradas[i][2]);
			}
		}
		if(seccion.equals("verEquipo")) {
			limpiarTablaEquipo();
			if (seccion.equals("verMedico")) {
				for (int i = 0; i < entradas.length; i++) {
					verEquipo.getModeloTabla().addRow(entradas[i]);
				}
			}
		}
		if(seccion.equals("escogerGrupoTec")) {
			limpiarTabla(seccion);
			for (int i = 0; i < entradas.length; i++) {
				escogerGrupoTec.getModelElegir().addElement(entradas[i][0]+" "+entradas[i][1]+" : "+entradas[i][2]);
			}
		}
		if(seccion.equals("escogerGrupoDep")) {
			limpiarTabla(seccion);
			for (int i = 0; i < entradas.length; i++) {
				escogerGrupoDep.getModelElegir().addElement(entradas[i][0]+" "+entradas[i][1]+" : "+entradas[i][2]);
			}
		}
		if(seccion.equals("agregarListaMedico")) {
			limpiarTabla(seccion);
			if(escogerGrupoMed.getModelElegir().size()>0) {
				int h=escogerGrupoMed.getjListaElegir().getSelectedIndex();	
				escogerGrupoMed.getModelElegido().addElement(entradas[h][0]+" "+entradas[h][1]+" : "+entradas[h][2]);
				escogerGrupoMed.getjListaElegido().setSelectedIndex(h);
				escogerGrupoMed.getModelElegir().removeElementAt(h);
			}
		}
		if(seccion.equals("removerListaMedico")) {
			limpiarTabla(seccion);
			if(escogerGrupoMed.getModelElegido().size()>0) {
				int h=escogerGrupoMed.getjListaElegido().getSelectedIndex();	
				escogerGrupoMed.getModelElegir().addElement(entradas[h][0]+" "+entradas[h][1]+" : "+entradas[h][2]);
				escogerGrupoMed.getjListaElegir().setSelectedIndex(h);
				escogerGrupoMed.getModelElegido().removeElementAt(h);
			}
		}
		if(seccion.equals("agregarListaTecnico")) {
			limpiarTabla(seccion);
			if(escogerGrupoTec.getModelElegir().size()>0) {
				int h=escogerGrupoTec.getjListaElegir().getSelectedIndex();	
				escogerGrupoTec.getModelElegido().addElement(entradas[h][0]+" "+entradas[h][1]+" : "+entradas[h][2]);
				escogerGrupoTec.getjListaElegido().setSelectedIndex(h);
				escogerGrupoTec.getModelElegir().removeElementAt(h);
			}
		}
		if(seccion.equals("removerListaTecnico")) {
			limpiarTabla(seccion);
			if(escogerGrupoTec.getModelElegido().size()>0) {
				int h=escogerGrupoTec.getjListaElegido().getSelectedIndex();	
				escogerGrupoTec.getModelElegir().addElement(entradas[h][0]+" "+entradas[h][1]+" : "+entradas[h][2]);
				escogerGrupoTec.getjListaElegir().setSelectedIndex(h);
				escogerGrupoTec.getModelElegido().removeElementAt(h);
			}
		}
		if(seccion.equals("agregarListaDeportivo")) {
			limpiarTabla(seccion);
			if(escogerGrupoDep.getModelElegir().size()>0) {
				int h=escogerGrupoDep.getjListaElegir().getSelectedIndex();	
				escogerGrupoDep.getModelElegido().addElement(entradas[h][0]+" "+entradas[h][1]+" : "+entradas[h][2]);
				escogerGrupoDep.getjListaElegido().setSelectedIndex(h);
				escogerGrupoDep.getModelElegir().removeElementAt(h);
			}
		}
		if(seccion.equals("removerListaDeportivo")) {
			limpiarTabla(seccion);
			if(escogerGrupoDep.getModelElegido().size()>0) {
				int h=escogerGrupoDep.getjListaElegido().getSelectedIndex();	
				escogerGrupoDep.getModelElegir().addElement(entradas[h][0]+" "+entradas[h][1]+" : "+entradas[h][2]);
				escogerGrupoDep.getjListaElegir().setSelectedIndex(h);
				escogerGrupoDep.getModelElegido().removeElementAt(h);
			}
		}
	}
}
