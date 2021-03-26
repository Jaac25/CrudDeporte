package ejecucion;

import control.Control;
import vista.ventanaPrincipal;

public class ejecutable {
	public static void main(String[]arg) {
		ventanaPrincipal principal=new ventanaPrincipal();
		Control control = new Control(principal);
		principal.asignarControl(control);	
		principal.setVisible(true);
	}
}
