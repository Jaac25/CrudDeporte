package crudDeportivo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import vista.Acciones;

public class verJugador extends JPanel{
	private JLabel lblTitulo;
	private JScrollPane jScrollPane;
	private DefaultTableModel modeloTabla;
	private JTable jTableMedicos;
	private JButton btnAtras;
	
	public verJugador () {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}

	private void inicializar() {
		lblTitulo = new JLabel("Ver Jugadores");
		
		String[] cabecera = {"Documento", "Dorsal", "Nombre"," Apellido","Posición"};
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
		jScrollPane.setBounds(50, 50, 505, 270);
		
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setFont(new Font("Algerian", 0, 15));
		btnAtras.setForeground(Color.white);
		btnAtras.setBounds(250, 350, 100, 40);
		btnAtras.setActionCommand(Acciones.ATRAS_DEPORTIVO);
	}

	private void agregar() {
		add(lblTitulo);
		add(jScrollPane);
		add(btnAtras);
	}
	
	//GEtters/Setters
	public JButton getBtnAtras() {
		return btnAtras;
	}
	
	public DefaultTableModel getModeloTabla() {
		return modeloTabla;
	}
	
	public JTable getjTableCamaras() {
		return jTableMedicos;
	}
}
