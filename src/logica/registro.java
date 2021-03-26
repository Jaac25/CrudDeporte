package logica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import crudDeportivo.agregarDeportivo;

public class registro {
	//Atributos
		private ArrayList<grupoMedico> agregarMedico;
		private ArrayList<grupoTecnico> agregarTecnico;
		private ArrayList<grupoDeportivo> agregarJugador;
		
	//Constructor
		public registro(){
			agregarMedico=new ArrayList<>();
			agregarTecnico=new ArrayList<>();
			agregarJugador=new ArrayList<>();
		}

	//Metodos
		
		//Medico
		
		public void agregarMedico(String documento,String numeroLicencia,String nombre,String apellido,cargoMedico cargo) {
			grupoMedico medico=new grupoMedico(documento, numeroLicencia,nombre,apellido,cargo);
			agregarMedico.add(medico);
		}
		public String[][] mostrarMedico() {
			String[][] datosMedico = new String[agregarMedico.size()][5];
			for (int i = 0; i < agregarMedico.size(); i++) {
				datosMedico[i][0] = agregarMedico.get(i).getDocumento();
				datosMedico[i][1] = agregarMedico.get(i).getNumeroLicencia();
				datosMedico[i][2] = agregarMedico.get(i).getNombre();
				datosMedico[i][3] = agregarMedico.get(i).getApellido();
				datosMedico[i][4] = String.valueOf(agregarMedico.get(i).getCargo());	
			}
			return datosMedico;
		}
		public String[] cargarMedico(String documento) {
			int posicion=buscarMedico(documento);
			if (posicion != -1) {
				String datosMedico[] = {String.valueOf(posicion), agregarMedico.get(posicion).getDocumento(),
						agregarMedico.get(posicion).getNumeroLicencia(),
						agregarMedico.get(posicion).getNombre(),
						agregarMedico.get(posicion).getApellido(),
						String.valueOf(agregarMedico.get(posicion).getCargo())};
				
				return datosMedico;
			}
			else if(posicion==-1) {
				String [] error= {String.valueOf(posicion),"No existe el documento","","","","",""};
				return error;
			}
			return null;
		}
		
		public int buscarMedico(String documento) {
			for (int i = 0; i < agregarMedico.size(); i++) {
				if(agregarMedico.get(i).getDocumento().equals(documento)) {
					return i;
				}
			}
			return -1;
		}
		public void modificarMedicoDocumento(String posicion, String documento, String numeroLicencia, String nombre, String apellido, cargoMedico cargo) {
			grupoMedico medico=new grupoMedico(documento,numeroLicencia,nombre,apellido,cargo);
			agregarMedico.set(Integer.parseInt(posicion),medico);
		}
		public void eliminarMedico(String posicion) {
			agregarMedico.remove(Integer.parseInt(posicion));
		}
		
		//Tecnico
		
		public void agregarTecnico(String documento,String numeroLicencia,String nombre,String apellido,cargoTecnico cargo) {
			grupoTecnico tecnico=new grupoTecnico(documento, numeroLicencia,nombre,apellido,cargo);
			agregarTecnico.add(tecnico);
		}
		public String[][]mostrarTecnico(){
			String[][]datosTecnico=new String[agregarTecnico.size()][5];
			for (int i = 0; i < agregarTecnico.size(); i++) {
				datosTecnico[i][0]=agregarTecnico.get(i).getDocumento();
				datosTecnico[i][1]=agregarTecnico.get(i).getNumeroLicencia();
				datosTecnico[i][2]=agregarTecnico.get(i).getNombre();
				datosTecnico[i][3]=agregarTecnico.get(i).getApellido();
				datosTecnico[i][4]=String.valueOf(agregarTecnico.get(i).getCargo());
			}
			return datosTecnico;
		}
		public String[] cargarTecnico(String documento) {
			int posicion=buscarTecnico(documento);
			if (posicion != -1) {
				String datosTecnico[] = {String.valueOf(posicion), agregarTecnico.get(posicion).getDocumento(),
						agregarTecnico.get(posicion).getNumeroLicencia(),
						agregarTecnico.get(posicion).getNombre(),
						agregarTecnico.get(posicion).getApellido(),
						String.valueOf(agregarTecnico.get(posicion).getCargo())};
				return datosTecnico;
			}
			else if(posicion==-1) {
				String [] error= {String.valueOf(posicion),"No existe el documento","","","","",""};
				return error;
			}
			return null;
		}
		public int buscarTecnico(String documento) {
			for (int i = 0; i < agregarTecnico.size(); i++) {
				if (agregarTecnico.get(i).getDocumento().equals(documento)) {
					return i;
				}
			}	
			return  -1;
		}
		public void modificarTecnico(String posicion, String documento, String numeroLicencia, String nombre,
				String apellido, cargoTecnico cargo) {
			grupoTecnico tecnico = new grupoTecnico(documento, numeroLicencia, nombre,apellido,cargo);
			agregarTecnico.set(Integer.parseInt(posicion), tecnico);
		}
		public void eliminarTecnico(String posicion) {
			agregarTecnico.remove(Integer.parseInt(posicion));
		}
		
		//Deportivo
		
		public void agregarJugador(String documento,String numeroLicencia,String nombre,String apellido,posicionJugador posicion) {
			grupoDeportivo jugador=new grupoDeportivo(documento, numeroLicencia,nombre,apellido,posicion);
			agregarJugador.add(jugador);
		}
		
		public String[][] mostrarDeportivo() {
			String[][] datosDeportivo = new String[agregarJugador.size()][5];
			for (int i = 0; i < agregarJugador.size(); i++) {
				datosDeportivo[i][0] = agregarJugador.get(i).getDocumento();
				datosDeportivo[i][1] = agregarJugador.get(i).getDorsal();
				datosDeportivo[i][2] = agregarJugador.get(i).getNombre();
				datosDeportivo[i][3] = agregarJugador.get(i).getApellido();
				datosDeportivo[i][4] = String.valueOf(agregarJugador.get(i).getPosicion());
			}
			return datosDeportivo;
		}
		public String[] cargarDeportivo(String documento) {
			int posicion=buscarDeportivo(documento);
			if (posicion != -1) {
				String datosDeportivo[] = {String.valueOf(posicion), agregarJugador.get(posicion).getDocumento(),
						agregarJugador.get(posicion).getDorsal(),
						agregarJugador.get(posicion).getNombre(),
						agregarJugador.get(posicion).getApellido(),
						String.valueOf(agregarJugador.get(posicion).getPosicion())};
				return datosDeportivo;
			}
			else if(posicion==-1) {
				String [] error= {String.valueOf(posicion),"No existe el documento","","","","",""};
				return error;
			}
			return null;
		}
		public int buscarDeportivo(String documento) {
			for(int i=0;i<agregarJugador.size();i++) {
				if(agregarJugador.get(i).getDocumento().equals(documento)) {
					return i;
				}
			}
			return -1;
		}
		public void modificarDeportivo(String ubicacion, String documento, String dorsal, String nombre, String apellido,
				posicionJugador posicion) {
			grupoDeportivo jugador=new grupoDeportivo(documento, dorsal, nombre, apellido, posicion);
			agregarJugador.set(Integer.parseInt(ubicacion), jugador);
		}

		public void eliminarDeportivo(String ubicacion) {
			agregarJugador.remove(Integer.parseInt(ubicacion));
		}
		//Organizacion
		//Médico
		public String[][] mostrarMedicoOganizacion(){
			String [][] medicoLista=new String[agregarMedico.size()][3];
			for (int i = 0; i < agregarMedico.size(); i++) {
				medicoLista[i][0] = agregarMedico.get(i).getNombre();
				medicoLista[i][1] = agregarMedico.get(i).getApellido();
				medicoLista[i][2]=String.valueOf(agregarMedico.get(i).getCargo());
			}	
			return medicoLista;
		}
		public String[][] medicoSeleccionado(String posicion) {
			int pos=Integer.parseInt(posicion);
			String comprobarDocumento=agregarMedico.get(pos).getDocumento();
			String [][]medicoSeleccionado=new String[agregarMedico.size()][3];
			for(int i=0;i<agregarMedico.size();i++) {
				if(comprobarDocumento.equals(agregarMedico.get(i).getDocumento())) {
					medicoSeleccionado[i][0] = agregarMedico.get(i).getNombre();
					medicoSeleccionado[i][1] = agregarMedico.get(i).getApellido();
					medicoSeleccionado[i][2] = String.valueOf(agregarMedico.get(i).getCargo());
				}
			}	
			return medicoSeleccionado;
		}

		//Tecnico
		public String[][] mostrarTecnicoOganizacion() {
			String [][] tecnicoLista = new String [agregarTecnico.size()][3];
			for (int i = 0; i < agregarTecnico.size(); i++) {
				tecnicoLista[i][0] = agregarTecnico.get(i).getNombre();
				tecnicoLista[i][1] = agregarTecnico.get(i).getApellido();
				tecnicoLista[i][2]=String.valueOf(agregarTecnico.get(i).getCargo());
			}
			return tecnicoLista;
		}
		public String[][] tecnicoSeleccionado(String posicion) {
			int i=Integer.parseInt(posicion);
			String [][]tecnicoSeleccionado=new String[agregarTecnico.size()][3];
			tecnicoSeleccionado[i][0] = agregarTecnico.get(i).getNombre();
			tecnicoSeleccionado[i][1] = agregarTecnico.get(i).getApellido();
			tecnicoSeleccionado[i][2]=String.valueOf(agregarTecnico.get(i).getCargo());
			return tecnicoSeleccionado;
		}
		//Deportivo
		public String[][] mostrarDeportivoOrganizacion() {
			 String [][] deportivoLista = new String[agregarJugador.size()][3];
			 for(int i=0;i<agregarJugador.size();i++){
				 deportivoLista[i][0]=agregarJugador.get(i).getNombre();
				 deportivoLista[i][1] = agregarJugador.get(i).getApellido();
				 deportivoLista[i][2]=String.valueOf(agregarJugador.get(i).getPosicion());
			 }
			return deportivoLista;
		}
		public String[][] deportivoSeleccionado(String posicion) {
			int i=Integer.parseInt(posicion);
			String [][]deportivoSeleccionado=new String[agregarJugador.size()][3];
			deportivoSeleccionado[i][0] = agregarJugador.get(i).getNombre();
			deportivoSeleccionado[i][1] = agregarJugador.get(i).getApellido();
			deportivoSeleccionado[i][2] = String.valueOf(agregarJugador.get(i).getPosicion());
			return deportivoSeleccionado;
		}
		//verEquipo
		public String[][] mostrarEquipo(String [] posicionJugadores,String [] posicionMedicos,String []posicionTecnicos, String jugador,String medico,String tecnico) {
			String[][] datosEquipo = null;
			if(jugador.equals("jugador")) {
				datosEquipo=new String[posicionJugadores.length][3];
				for (int i = 0; i < posicionJugadores.length; i++) {
					datosEquipo[i][0] = posicionJugadores[i];
				}		
			}	
			if(medico.equals("medico")) {
				datosEquipo=new String[posicionMedicos.length][3];
				for (int i = 0; i < posicionMedicos.length; i++) {
					datosEquipo[i][1] = posicionMedicos[i];
				}
			}
			if(tecnico.equals("tecnico")) {
				datosEquipo=new String[posicionTecnicos.length][3];
				for (int i = 0; i < posicionTecnicos.length; i++) {
					datosEquipo[i][2] = posicionTecnicos[i];
				}
			}
			return datosEquipo;
		}
		
	//Getters/Setters
		public ArrayList<grupoTecnico> getAgregarTecnico() {
			return agregarTecnico;
		}
		public void setAgregarTecnico(ArrayList<grupoTecnico> agregarTecnico) {
			this.agregarTecnico = agregarTecnico;
		}
		public ArrayList<grupoDeportivo> getAgregarJugador() {
			return agregarJugador;
		}
		public void setAgregarJugador(ArrayList<grupoDeportivo> agregarJugador) {
			this.agregarJugador = agregarJugador;
		}
		public void setAgregarMedico(ArrayList<grupoMedico> agregarMedico) {
			this.agregarMedico = agregarMedico;
		}
		public ArrayList<grupoMedico> getAgregarMedico() {
			return agregarMedico;
		}
}
