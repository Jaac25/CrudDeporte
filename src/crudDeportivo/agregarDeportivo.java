package crudDeportivo;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logica.cargoMedico;
import logica.grupoMedico;
import logica.posicionJugador;
import vista.Acciones;

public class agregarDeportivo extends JPanel{
private JLabel lblTitulo;
	
	private JLabel lblDocumento;
	private JTextField txtDocumento;
	
	private JLabel lblDorsal;
	private TextField txtDorsal;
	
	private JLabel lblNombre;
	private TextField txtNombre;
	
	private JLabel lblApellido;
	private TextField txtApellido;
	
	private JLabel lblPosicion;
	private JComboBox<String> jCbPosicion;
	
	private JButton btnGuardar;
	private JButton btnAtras;
	
	public agregarDeportivo() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblTitulo=new JLabel("Agregar Jugador");
		
		lblDocumento=new JLabel("           Documento: ");
		txtDocumento=new JTextField();
		
		lblDorsal=new JLabel("           Dorsal: ");
		txtDorsal=new TextField();
		
		lblNombre=new JLabel("           Nombre: ");
		txtNombre=new TextField();
		
		lblApellido=new JLabel("           Apellido: ");
		txtApellido=new TextField();
		
		lblPosicion=new JLabel("           Posición: ");
		jCbPosicion = new JComboBox<String>();
		
		btnGuardar=new JButton("Guardar");
		btnAtras=new JButton("Atrás");
	}

	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 1, 30));
		lblTitulo.setBounds(130, 0, 400,50);
		
		lblDocumento.setFont(new Font("Algerian", 0, 25));
		lblDocumento.setBounds(30,60,260,50);
		txtDocumento.setBounds(290,60,200,40);
		
		lblDorsal.setFont(new Font("Algerian", 0, 25));
		lblDorsal.setBounds(30,110,260,50);
		txtDorsal.setBounds(290,110,200,40);
		
		lblNombre.setFont(new Font("Algerian", 0, 25));
		lblNombre.setBounds(30,170,260,50);
		txtNombre.setBounds(290,170,200,40);
		
		lblApellido.setFont(new Font("Algerian", 0, 25));
		lblApellido.setBounds(30,230,260,50);
		txtApellido.setBounds(290,230,200,40);
		
		lblPosicion.setFont(new Font("Algerian", 0, 25));
		lblPosicion.setBounds(30,290,260,50);
		jCbPosicion.setBounds(290,290,200,40);
		jCbPosicion.addItem("Seleccion una opcion...");
		jCbPosicion.addItem(String.valueOf(posicionJugador.PORTEROS));
		jCbPosicion.addItem(String.valueOf(posicionJugador.DEFENSAS));
		jCbPosicion.addItem(String.valueOf(posicionJugador.CENTROCAMPISTAS));
		jCbPosicion.addItem(String.valueOf(posicionJugador.DELANTEROS));
		
		btnGuardar.setBackground(Color.BLACK);
		btnGuardar.setFont(new Font("Algerian", 0, 25));
		btnGuardar.setForeground(Color.white);
		btnGuardar.setBounds(70,350, 200, 50);
		btnGuardar.setActionCommand(Acciones.GUARDAR_DEPORTIVO);
		
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setFont(new Font("Algerian", 0, 25));
		btnAtras.setForeground(Color.white);
		btnAtras.setBounds(320,350, 200, 50);
		btnAtras.setActionCommand(Acciones.ATRAS_DEPORTIVO);
	}
	
	private void agregar() {
		add(lblTitulo);
		
		add(lblDocumento);
		add(txtDocumento);
		
		add(lblDorsal);
		add(txtDorsal);
		
		add(lblNombre);
		add(txtNombre);
		
		add(lblApellido);
		add(txtApellido);
		
		add(lblPosicion);
		add(jCbPosicion);
		
		add(btnGuardar);
		add(btnAtras);
	}
	//Getters/Setters
	public JButton getBtnGuardar() {
		return btnGuardar;
	}
	public JButton getBtnAtras() {
		return btnAtras;
	}
	public JTextField getTxtDocumento() {
		return txtDocumento;
	}
	public TextField getTxtDorsal() {
		return txtDorsal;
	}
	public TextField getTxtNombre() {
		return txtNombre;
	}
	public TextField getTxtApellido() {
		return txtApellido;
	}
	public JComboBox<String> getjCbPosicion() {
		return jCbPosicion;
	}	
}
