package crudTecnico;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logica.cargoTecnico;
import vista.Acciones;

public class modificarTecnico extends JPanel{
	private JLabel lblTitulo;
	
	private JLabel lblDocumento;
	private JTextField txtDocumento;
	
	private JLabel lblNumeroLicencia;
	private TextField txtNumeroLicencia;
	
	private JLabel lblNombre;
	private TextField txtNombre;
	
	private JLabel lblApellido;
	private TextField txtApellido;
	
	private JLabel lblCargo;
	private JComboBox<String> jCbcargo;
	
	private JButton btnBuscar;
	private JButton btnModificar;
	private JButton btnAtras;
	
	public modificarTecnico() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblTitulo=new JLabel("Modificar T?cnico");
		
		lblDocumento=new JLabel("           Documento: ");
		txtDocumento=new JTextField();
		
		lblNumeroLicencia=new JLabel("           N? de Licencia: ");
		txtNumeroLicencia=new TextField();
		
		lblNombre=new JLabel("           Nombre: ");
		txtNombre=new TextField();
		
		lblApellido=new JLabel("           Apellido: ");
		txtApellido=new TextField();
		
		lblCargo=new JLabel("           Cargo: ");
		jCbcargo = new JComboBox<String>();
		
		btnBuscar=new JButton("Buscar");
		btnModificar=new JButton("Modificar");
		btnAtras=new JButton("Atr?s");
	}

	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 1, 30));
		lblTitulo.setBounds(140, 0, 400,50);
		
		lblDocumento.setFont(new Font("Algerian", 0, 25));
		lblDocumento.setBounds(30,60,260,50);
		txtDocumento.setBounds(290,60,200,40);
		
		lblNumeroLicencia.setFont(new Font("Algerian", 0, 22));
		lblNumeroLicencia.setBounds(30,110,260,50);
		txtNumeroLicencia.setBounds(290,110,200,40);
		
		lblNombre.setFont(new Font("Algerian", 0, 25));
		lblNombre.setBounds(30,170,260,50);
		txtNombre.setBounds(290,170,200,40);
		
		lblApellido.setFont(new Font("Algerian", 0, 25));
		lblApellido.setBounds(30,230,260,50);
		txtApellido.setBounds(290,230,200,40);
		
		lblCargo.setFont(new Font("Algerian", 0, 25));
		lblCargo.setBounds(30,290,260,50);
		jCbcargo.setBounds(290,290,200,40);
		jCbcargo.addItem("Seleccion una opcion...");
		jCbcargo.addItem(String.valueOf(cargoTecnico.AUXILIAR));
		jCbcargo.addItem(String.valueOf(cargoTecnico.ENTRENADOR));
		jCbcargo.addItem(String.valueOf(cargoTecnico.PREPARADOR_FISICO));
		
		btnBuscar.setBackground(Color.BLACK);
		btnBuscar.setFont(new Font("Algerian", 0, 13));
		btnBuscar.setForeground(Color.white);
		btnBuscar.setBounds(500,60,85,35);
		btnBuscar.setActionCommand(Acciones.BUSCAR_TECNICO_MODIFICAR);
		
		btnModificar.setBackground(Color.BLACK);
		btnModificar.setFont(new Font("Algerian", 0, 25));
		btnModificar.setForeground(Color.white);
		btnModificar.setBounds(70,350, 200, 50);
		btnModificar.setActionCommand(Acciones.BTN_MODIFICAR_TECNICO);
		
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setFont(new Font("Algerian", 0, 25));
		btnAtras.setForeground(Color.white);
		btnAtras.setBounds(320,350, 200, 50);
		btnAtras.setActionCommand(Acciones.ATRAS_TECNICO);
	}
	
	private void agregar() {
		add(lblTitulo);
		
		add(lblDocumento);
		add(txtDocumento);
		
		add(lblNumeroLicencia);
		add(txtNumeroLicencia);
		
		add(lblNombre);
		add(txtNombre);
		
		add(lblApellido);
		add(txtApellido);
		
		add(lblCargo);
		add(jCbcargo);
		
		add(btnBuscar);
		add(btnModificar);
		add(btnAtras);
	}
	//Getters/Setters
	public JButton getBtnModificar() {
		return btnModificar;
	}
	public JButton getBtnAtras() {
		return btnAtras;
	}
	public JTextField getTxtDocumento() {
		return txtDocumento;
	}
	public TextField getTxtNumeroLicencia() {
		return txtNumeroLicencia;
	}
	public TextField getTxtNombre() {
		return txtNombre;
	}
	public TextField getTxtApellido() {
		return txtApellido;
	}
	public JComboBox<String> getjCbcargo() {
		return jCbcargo;
	}
	public JButton getBtnBuscar() {
		return btnBuscar;
	}
}
