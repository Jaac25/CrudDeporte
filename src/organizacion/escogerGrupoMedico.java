package organizacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import vista.Acciones;

public class escogerGrupoMedico extends JPanel{
	
	private JLabel lblTitulo;
	private JLabel lblElegir;
	private JLabel lblElegido;
	
	private JScrollPane jScrollElegir;
	private JScrollPane jScrollElegido;
	
	private DefaultListModel modelElegir;
	private DefaultListModel modelElegido;
	
	private JList jListaElegir;
	private JList jListaElegido;
	
	private JButton btnAgregar;
	private JButton btnRemover;
	private JButton btnAtras;
	private JButton btnSiguiente;
	
	public escogerGrupoMedico() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblTitulo=new JLabel("Grupo Médico");
		
		lblElegir=new JLabel("Elija");
		
		lblElegido=new JLabel("Escogidos");
		
		modelElegir=new DefaultListModel();
		modelElegido=new DefaultListModel();
		
		jScrollElegir = new JScrollPane(jListaElegir);
		jScrollElegido = new JScrollPane(jListaElegido);
		
		jListaElegir=new JList<>(modelElegir);
		jListaElegido=new JList<>(modelElegido);
		
		btnAgregar=new JButton("+");
		btnRemover=new JButton("-");
		btnAtras=new JButton("Atrás");
		btnSiguiente=new JButton("Siguiente");
	}
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 1, 30));
		lblTitulo.setBounds(175, 0, 350,50);
		
		lblElegir.setFont(new Font("Algerian", 1, 20));
		lblElegir.setBounds(95,50,200,50);
		
		lblElegido.setFont(new Font("Algerian", 1, 20));
		lblElegido.setBounds(390,50,200,50);
		
		jScrollElegir.setBounds(30,100,230,240);
		jScrollElegir.setViewportView(jListaElegir);
		
		jScrollElegido.setBounds(330,100,230,240);
		jScrollElegido.setViewportView(jListaElegido);
		
		btnAgregar.setBackground(Color.BLACK);
		btnAgregar.setFont(new Font("Algerian", 1, 13));
		btnAgregar.setForeground(Color.white);
		btnAgregar.setBounds(270,160,50,40);
		btnAgregar.setActionCommand(Acciones.AGREGAR_LISTA_MEDICO);
		
		btnRemover.setBackground(Color.BLACK);
		btnRemover.setFont(new Font("Algerian", 1, 14));
		btnRemover.setForeground(Color.white);
		btnRemover.setBounds(270,240,50,40);
		btnRemover.setActionCommand(Acciones.REMOVER_LISTA_MEDICO);
		
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setFont(new Font("Algerian", 0, 25));
		btnAtras.setForeground(Color.white);
		btnAtras.setBounds(40,360,200,50);
		btnAtras.setActionCommand(Acciones.SALIR_MEDICO);
		
		btnSiguiente.setBackground(Color.BLACK);
		btnSiguiente.setFont(new Font("Algerian", 0, 25));
		btnSiguiente.setForeground(Color.white);
		btnSiguiente.setBounds(350,360,200,50);
		btnSiguiente.setActionCommand(Acciones.ESCOGER_GRUPO_TECNICO);
		}
	
	private void agregar() {
		add(lblElegir);
		add(lblElegido);
		add(lblTitulo);
		
		add(jScrollElegir);
		add(jScrollElegido);
		
		add(btnAgregar);
		add(btnRemover);
		add(btnAtras);
		add(btnSiguiente);
	}
	//Getter/Setters
	public JButton getBtnAtras() {
		return btnAtras;
	}
	public JButton getBtnSiguiente() {
		return btnSiguiente;
	}
	public DefaultListModel getModelElegir() {
		return modelElegir;
	}
	public void setModelElegir(DefaultListModel modelElegir) {
		this.modelElegir = modelElegir;
	}
	public JList getjListaElegir() {
		return jListaElegir;
	}	
	public void setjListaElegir(JList jListaElegir) {
		this.jListaElegir = jListaElegir;
	}
	public DefaultListModel getModelElegido() {
		return modelElegido;
	}
	public void setModelElegido(DefaultListModel modelElegido) {
		this.modelElegido = modelElegido;
	}
	public JButton getBtnAgregar() {
		return btnAgregar;
	}
	public JButton getBtnRemover() {
		return btnRemover;
	}
	public JScrollPane getjScrollElegido() {
		return jScrollElegido;
	}
	public JList getjListaElegido() {
		return jListaElegido;
	}
	
	
}
