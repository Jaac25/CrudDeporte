package organizacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import vista.Acciones;

public class inicioOrganizacion extends JPanel{
	private JLabel lblTitulo;
	private JButton btnOrganizarEquipo;
	private JButton btnGuardarSalir;
	
	public inicioOrganizacion(){
		this.setVisible(true);
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblTitulo=new JLabel("Nombre del Equipo");
		
		btnOrganizarEquipo=new JButton("Organizar Equipo");
		btnGuardarSalir=new JButton("Guardar y Salir");
	}
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 0, 36)); 
		lblTitulo.setForeground (Color.BLACK);
		lblTitulo.setBounds(120,0,400,50);
		
		btnOrganizarEquipo.setBackground(Color.BLACK);
		btnOrganizarEquipo.setForeground(Color.WHITE);
		btnOrganizarEquipo.setBounds(190,130,200,50);
		btnOrganizarEquipo.setActionCommand(Acciones.ESCOGER_GRUPO_MEDICO);
		
		btnGuardarSalir.setBackground(Color.BLACK);
		btnGuardarSalir.setForeground(Color.WHITE);
		btnGuardarSalir.setBounds(190,200,200,50);
		btnGuardarSalir.setActionCommand(Acciones.SALIR);
	}
	private void agregar() {
		add(lblTitulo);
		add(btnOrganizarEquipo);
		add(btnGuardarSalir);
	}
	//Getters/Setters
		public JButton getBtnOrganizarEquipo() {
			return btnOrganizarEquipo;
		}
		public void setBtnOrganizarEquipo(JButton btnOrganizarEquipo) {
			this.btnOrganizarEquipo = btnOrganizarEquipo;
		}
		public JButton getBtnGuardarSalir() {
			return btnGuardarSalir;
		}
}
