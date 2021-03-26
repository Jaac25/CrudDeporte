package organizacion;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import vista.Acciones;

public class VerEquipo extends JPanel{
	private JScrollPane jScrollPane;
	private DefaultTableModel modeloTabla;
	private JTable jTable;
	private JButton btnMenu;
	private JButton btnAtras;
	
	public VerEquipo(){
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		String[] cabecera = {"Jugadores", "Médicos", "Técnicos"};
		modeloTabla = new DefaultTableModel();
		modeloTabla.setColumnIdentifiers(cabecera);
		jTable = new JTable(modeloTabla);
		jScrollPane = new JScrollPane(jTable);
		btnMenu = new JButton("Menu");
		btnAtras = new JButton("Atrás");
	}
	private void caracteristicas() {
		jTable.setGridColor(Color.BLUE);
		jScrollPane.setBounds(50, 10, 500, 370);
		
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setFont(new Font("Algerian", 0, 15));
		btnAtras.setForeground(Color.white);
		btnAtras.setBounds(120, 380, 100, 40);
		btnAtras.setActionCommand(Acciones.ATRAS_EQUIPO);
		
		btnMenu.setBackground(Color.BLACK);
		btnMenu.setFont(new Font("Algerian", 0, 15));
		btnMenu.setForeground(Color.white);
		btnMenu.setBounds(380, 380, 100, 40);
		btnMenu.setActionCommand(Acciones.MENU);
	
	}
	private void agregar() {
		add(jScrollPane);
		add(btnMenu);
		add(btnAtras);
	}
	//Getters/Setters
	public JScrollPane getjScrollPane() {
		return jScrollPane;
	}
	public void setjScrollPane(JScrollPane jScrollPane) {
		this.jScrollPane = jScrollPane;
	}
	public DefaultTableModel getModeloTabla() {
		return modeloTabla;
	}
	public void setModeloTabla(DefaultTableModel modeloTabla) {
		this.modeloTabla = modeloTabla;
	}
	public JTable getjTable() {
		return jTable;
	}
	public void setjTable(JTable jTable) {
		this.jTable = jTable;
	}
	public JButton getBtnMenu() {
		return btnMenu;
	}
	public void setBtnMenu(JButton btnMenu) {
		this.btnMenu = btnMenu;
	}
	public JButton getBtnAtras() {
		return btnAtras;
	}
	
}
