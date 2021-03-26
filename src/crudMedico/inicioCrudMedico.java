package crudMedico;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import vista.Acciones;

public class inicioCrudMedico extends JPanel{
	private JLabel lblTitulo;
	private JButton btnAgregar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnVer;
	private JButton btnGuardarSalir;
	
	public inicioCrudMedico() {
		setLayout(new GridLayout(6,1,100,10));
		inicializar();
		caracteristicas();
		agregar();
	}
	
	private void inicializar() {
		lblTitulo=new JLabel("   Grupo Médico");
		btnAgregar=new JButton("Agregar Médico");
		btnModificar=new JButton("Modificar Médico");
		btnEliminar=new JButton("Eliminar Médico");
		btnVer=new JButton("Ver Médicos");
		btnGuardarSalir=new JButton("Guardar y Salir"); 
	}
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 0, 36)); 
		lblTitulo.setForeground (Color.BLACK);
		
		btnAgregar.setBackground(Color.BLACK);
		btnAgregar.setForeground(Color.WHITE);
		btnAgregar.setActionCommand(Acciones.AGREGAR_MEDICO);
		
		btnModificar.setBackground(Color.BLACK);
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setActionCommand(Acciones.MODIFICAR_MEDICO);
		
		btnEliminar.setBackground(Color.BLACK);
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setActionCommand(Acciones.ELIMINAR_MEDICO);
		
		btnVer.setBackground(Color.BLACK);
		btnVer.setForeground(Color.WHITE);
		btnVer.setActionCommand(Acciones.VER_MEDICO);
		
		btnGuardarSalir.setBackground(Color.BLACK);
		btnGuardarSalir.setForeground(Color.WHITE);
		btnGuardarSalir.setActionCommand(Acciones.GUARDAR_SALIR_MEDICO);
	}
	private void agregar() {
		add(lblTitulo);
		add(btnAgregar);
		add(btnModificar);
		add(btnEliminar);
		add(btnVer);
		add(btnGuardarSalir);
	}
	//Getters/Setters
	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public JButton getBtnVer() {
		return btnVer;
	}

	public void setBtnVer(JButton btnVer) {
		this.btnVer = btnVer;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JButton getBtnGuardarSalir() {
		return btnGuardarSalir;
	}
	
}
