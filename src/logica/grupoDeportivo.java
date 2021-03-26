package logica;

import java.io.Serializable;

public class grupoDeportivo implements Serializable{
	//Atributos
		private	String documento;
		private	String dorsal;
		private	String nombre;
		private	String apellido;
		private	posicionJugador posicion;
	//ConStructor
		public grupoDeportivo(String documento,String dorsal,String nombre,String apellido,posicionJugador posicion){
			this.documento=documento;
			this.dorsal=dorsal;
			this.nombre=nombre;
			this.apellido=apellido;
			this.posicion=posicion;
		}
	//Getters/Setters
		public String getDocumento() {
			return documento;
		}
		public String getDorsal() {
			return dorsal;
		}
		public String getNombre() {
			return nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public posicionJugador getPosicion() {
			return posicion;
		}
	//Métodos

}
