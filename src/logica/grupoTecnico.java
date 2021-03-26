package logica;

import java.io.Serializable;

public class grupoTecnico implements Serializable{
	//Atributos
		private	String documento;
		private	String numeroLicencia;
		private	String nombre;
		private	String apellido;
		private	cargoTecnico cargo;
	//ConStructor
		public grupoTecnico(String documento,String numeroLicencia,String nombre,String apellido,cargoTecnico cargo){
			this.documento=documento;
			this.numeroLicencia=numeroLicencia;
			this.nombre=nombre;
			this.apellido=apellido;
			this.cargo=cargo;
		}
	//Getters/Setters
		public String getDocumento() {
			return documento;
		}
		public String getNumeroLicencia() {
			return numeroLicencia;
		}
		public String getNombre() {
			return nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public cargoTecnico getCargo() {
			return cargo;
		}
	//Métodos
}
