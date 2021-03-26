package crudTecnico;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import vista.Acciones;

public class inicioCrudTecnico extends JPanel{
	private JLabel lblTitulo;
	private JButton btnAgregar;
	private JButton btnModificar;
	private JButton btnVer;
	private JButton btnEliminar;
	private JButton btnGuardarSalir;
	
	public inicioCrudTecnico() {
		setLayout(new GridLayout(6,1,100,10));
		inicializar();
		caracteristicas();
		agregar();
	}
	
	private void inicializar() {
		lblTitulo=new JLabel("   Grupo Técnico");
		btnAgregar=new JButton("Agregar Técnico");
		btnModificar=new JButton("Modificar Técnico");
		btnVer=new JButton("Ver Técnico");
		btnEliminar=new JButton("Eliminar Técnico");
		btnGuardarSalir=new JButton("Guardar y Salir"); 
	}
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 0, 36)); 
		lblTitulo.setForeground (Color.BLACK);
		
		btnAgregar.setBackground(Color.BLACK);
		btnAgregar.setForeground(Color.WHITE);
		btnAgregar.setActionCommand(Acciones.AGREGAR_TECNICO);
		
		btnModificar.setBackground(Color.BLACK);
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setActionCommand(Acciones.MODIFICAR_TECNICO);
		
		btnEliminar.setBackground(Color.BLACK);
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setActionCommand(Acciones.ELIMINAR_TECNICO);
		
		btnVer.setBackground(Color.BLACK);
		btnVer.setForeground(Color.WHITE);
		btnVer.setActionCommand(Acciones.VER_TECNICO);
		
		btnGuardarSalir.setBackground(Color.BLACK);
		btnGuardarSalir.setForeground(Color.WHITE);
		btnGuardarSalir.setActionCommand(Acciones.GUARDAR_SALIR_TECNICO);
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
