package organizacion;

import java.awt.Color;
import java.awt.Font;
import java.net.URL;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import vista.Acciones;

public class formaciones extends JPanel{
	private ButtonGroup botones; 
	private JRadioButton formacion1;
	private JRadioButton formacion2;
	private JRadioButton formacion3;
	private JRadioButton formacion4;
	private JRadioButton formacion5;
	private JRadioButton formacion6;
	private JButton btnMirar;
	private JButton btnAtras;
	private JButton btnGuardar;
	private URL urlImagen1;
	private URL urlImagen2;
	private URL urlImagen3;
	private URL urlImagen4;
	private URL urlImagen5;
	private URL urlImagen6;
	private ImageIcon imageIcon1;
	private ImageIcon imageIcon2;
	private ImageIcon imageIcon3;
	private ImageIcon imageIcon4;
	private ImageIcon imageIcon5;
	private ImageIcon imageIcon6;
	private JLabel lblImagen1;
	private JLabel lblImagen2;
	private JLabel lblImagen3;
	private JLabel lblImagen4;
	private JLabel lblImagen5;
	private JLabel lblImagen6;
	
	public formaciones() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		botones=new ButtonGroup();
		
		formacion1=new JRadioButton("4-4-2");
		formacion2=new JRadioButton("4-3-3");
		formacion3=new JRadioButton("3-5-2");
		formacion4=new JRadioButton("3-4-3");
		formacion5=new JRadioButton("5-3-2");
		formacion6=new JRadioButton("5-4-1");
		
		urlImagen1=this.getClass().getResource("/imagenes/4-4-2.jpeg");
		imageIcon1=new ImageIcon(urlImagen1);
		
		urlImagen2=this.getClass().getResource("/imagenes/4-3-3.jpeg");
		imageIcon2=new ImageIcon(urlImagen2);
		
		urlImagen3=this.getClass().getResource("/imagenes/3-5-2.jpeg");
		imageIcon3=new ImageIcon(urlImagen3);
		
		urlImagen4=this.getClass().getResource("/imagenes/3-4-3.jpeg");
		imageIcon4=new ImageIcon(urlImagen4);
		
		urlImagen5=this.getClass().getResource("/imagenes/5-3-2.jpeg");
		imageIcon5=new ImageIcon(urlImagen5);
		
		urlImagen6=this.getClass().getResource("/imagenes/5-4-1.jpeg");
		imageIcon6=new ImageIcon(urlImagen6);
		
		lblImagen1=new JLabel();
		lblImagen2=new JLabel();
		lblImagen3=new JLabel();
		lblImagen4=new JLabel();
		lblImagen5=new JLabel();
		lblImagen6=new JLabel();
		
		btnMirar=new JButton("Mirar");
		btnAtras=new JButton("Atras");
		btnGuardar=new JButton("Salir");
	}
	private void caracteristicas() {
		botones.add(formacion1);
		botones.add(formacion2);
		botones.add(formacion3);
		botones.add(formacion4);
		botones.add(formacion5);
		botones.add(formacion6);
		
		formacion1.setBounds(60,260,70,25);
		formacion2.setBounds(180,260,70,25);
		formacion3.setBounds(300,260,70,25);

		formacion4.setBounds(60,320,70,25);
		formacion5.setBounds(180,320,70,25);
		formacion6.setBounds(300,320,70,25);
		
		lblImagen1.setIcon(imageIcon1);
		lblImagen1.setBounds(65, 20, 286, 215);
		
		lblImagen2.setIcon(imageIcon2);
		lblImagen2.setBounds(20, 20, 380, 213);
		
		lblImagen3.setIcon(imageIcon3);
		lblImagen3.setBounds(20, 20, 380, 220);
		
		lblImagen4.setIcon(imageIcon4);
		lblImagen4.setBounds(20, 20, 380, 189);
		
		lblImagen5.setIcon(imageIcon5);
		lblImagen5.setBounds(45, 20, 330, 220);
		
		lblImagen6.setIcon(imageIcon6);
		lblImagen6.setBounds(20, 20, 380, 192);
		
		btnMirar.setBounds(165,360,90,25);
		btnMirar.setBackground(Color.BLACK);
		btnMirar.setFont(new Font("Algerian", 0, 15));
		btnMirar.setForeground(Color.white);
		btnMirar.setActionCommand(Acciones.MIRAR);
		
		btnGuardar.setBounds(430,40,130,50);
		btnGuardar.setBackground(Color.BLACK);
		btnGuardar.setFont(new Font("Algerian", 0, 20));
		btnGuardar.setForeground(Color.white);
		btnGuardar.setActionCommand(Acciones.SALIR);
		
		btnAtras.setBounds(430,320,130,50);
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setFont(new Font("Algerian", 0, 20));
		btnAtras.setForeground(Color.white);
		btnAtras.setActionCommand(Acciones.SALIR_FORMACIONES);
	}
	private void agregar() {	
		add(formacion1);
		add(formacion2);
		add(formacion3);
		add(formacion4);
		add(formacion5);
		add(formacion6);
		
		add(btnMirar);
		add(btnGuardar);
		add(btnAtras);
	}
	//Getters/Setters
	public JButton getBtnMirar() {
		return btnMirar;
	}
	public void setBtnMirar(JButton btnMirar) {
		this.btnMirar = btnMirar;
	}
	public JRadioButton getFormacion1() {
		return formacion1;
	}
	public JRadioButton getFormacion2() {
		return formacion2;
	}
	public JRadioButton getFormacion3() {
		return formacion3;
	}
	public JRadioButton getFormacion4() {
		return formacion4;
	}
	public JRadioButton getFormacion5() {
		return formacion5;
	}
	public JRadioButton getFormacion6() {
		return formacion6;
	}
	public JButton getBtnAtras() {
		return btnAtras;
	}
	public JLabel getLblImagen1() {
		return lblImagen1;
	}
	public JLabel getLblImagen2() {
		return lblImagen2;
	}
	public JLabel getLblImagen3() {
		return lblImagen3;
	}
	public JLabel getLblImagen4() {
		return lblImagen4;
	}
	public JLabel getLblImagen5() {
		return lblImagen5;
	}
	public JLabel getLblImagen6() {
		return lblImagen6;
	}
	public JButton getBtnGuardar() {
		return btnGuardar;
	}
	
}
