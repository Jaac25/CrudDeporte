package logica;

import java.io.Serializable;

public class grupoMedico implements Serializable{
	//Atributos
			private	String documento;
			private	String numeroLicencia;
			private	String nombre;
			private	String apellido;
			private	cargoMedico cargo;
	//ConStructor
		public grupoMedico(String documento,String numeroLicencia,String nombre,String apellido,cargoMedico cargo){
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
		public void setDocumento(String documento) {
			this.documento = documento;
		}
		public String getNumeroLicencia() {
			return numeroLicencia;
		}
		public void setNumeroLicencia(String numeroLicencia) {
			this.numeroLicencia = numeroLicencia;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public cargoMedico getCargo() {
			return cargo;
		}
		public void setCargo(cargoMedico cargo) {
			this.cargo = cargo;
		}
	//Métodos
}
