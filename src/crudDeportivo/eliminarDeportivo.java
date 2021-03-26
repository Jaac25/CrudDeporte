package crudDeportivo;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logica.posicionJugador;
import vista.Acciones;

public class eliminarDeportivo extends JPanel{
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
	
	private JButton btnEliminar;
	private JButton btnAtras;
	private JButton btnBuscar;
	
	public eliminarDeportivo() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblTitulo=new JLabel("    Eliminar Jugador");
		
		lblDocumento=new JLabel("           Documento: ");
		txtDocumento=new JTextField();
		
		lblDorsal=new JLabel("           Dorsal: ");
		txtDorsal=new TextField();
		
		lblNombre=new JLabel("           Nombre: ");
		txtNombre=new TextField();
		
		lblApellido=new JLabel("           Apellido: ");
		txtApellido=new TextField();
		
		lblPosicion=new JLabel("           Posicion: ");
		jCbPosicion = new JComboBox<String>();
		
		btnBuscar=new JButton("Buscar");
		btnEliminar=new JButton("Eliminar");
		btnAtras=new JButton("Atrás");
	}

	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 1, 30));
		lblTitulo.setBounds(100, 0, 400,50);
		
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
		
		btnBuscar.setBackground(Color.BLACK);
		btnBuscar.setFont(new Font("Algerian", 0, 13));
		btnBuscar.setForeground(Color.white);
		btnBuscar.setBounds(500,60,85,35);
		btnBuscar.setActionCommand(Acciones.BUSCAR_DEPORTIVO_ELIMINAR);
		
		btnEliminar.setBackground(Color.BLACK);
		btnEliminar.setFont(new Font("Algerian", 0, 25));
		btnEliminar.setForeground(Color.white);
		btnEliminar.setBounds(70,350, 200, 50);
		btnEliminar.setActionCommand(Acciones.BTN_ELIMINAR_DEPORTIVO);
		
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
		
		add(btnBuscar);
		add(btnEliminar);
		add(btnAtras);
	}
	//Getters/Setters
	public JButton getBtnEliminar() {
		return btnEliminar;
	}
	public JButton getBtnAtras() {
		return btnAtras;
	}
	public JButton getBtnBuscar() {
		return btnBuscar;
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
