package crudTecnico;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import vista.Acciones;

public class verTecnico extends JPanel{
	private JLabel lblTitulo;
	private JScrollPane jScrollPane;
	private DefaultTableModel modeloTabla;
	private JTable jTableMedicos;
	private JButton btnAtras;
	
	public verTecnico() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}

	private void inicializar() {
		lblTitulo = new JLabel("Ver Técnicos");
		String[] cabecera = {"Documento", "N° de Licencia", "Nombre"," Apellido","Cargo"};
		modeloTabla = new DefaultTableModel();
		modeloTabla.setColumnIdentifiers(cabecera);
		jTableMedicos = new JTable(modeloTabla);
		jScrollPane = new JScrollPane(jTableMedicos);
		btnAtras = new JButton("Atras");
	}
	
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 1, 30));
		lblTitulo.setBounds(200, 0, 350,50);
		
		jTableMedicos.setGridColor(Color.BLUE);
		jScrollPane.setBounds(50, 50, 480, 270);
		
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setFont(new Font("Algerian", 0, 15));
		btnAtras.setForeground(Color.white);
		btnAtras.setBounds(250, 350, 100, 40);
		btnAtras.setActionCommand(Acciones.ATRAS_TECNICO);
	}

	private void agregar() {
		add(lblTitulo);
		add(jScrollPane);
		add(btnAtras);
	}
	
	public JButton getBtnAtras() {
		return btnAtras;
	}
	
	public DefaultTableModel getModeloTabla() {
		return modeloTabla;
	}
	
	public JTable getjTableCamaras() {
		return jTableMedicos;
	}
	//Getters/Setters

	public void setBtnAtras(JButton btnAtras) {
		this.btnAtras = btnAtras;
	}
		
}
