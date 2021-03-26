package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import logica.cargoMedico;
import logica.cargoTecnico;
import logica.posicionJugador;
import logica.registro;
import vista.Acciones;
import persistencia.Persistencia;

public class Control implements ActionListener{
	private Acciones acciones;
	private registro registro;
	private Persistencia persistencia;
	
	public Control(Acciones acciones) {
		this.acciones=acciones;
		registro=new registro();
		persistencia=new Persistencia();
		cargarDatosPersistencia();
	}	
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			//Medico
				case Acciones.AGREGAR_MEDICO:
					acciones.iniciar(Acciones.AGREGAR_MEDICO);
					acciones.salir(Acciones.GRUPO_MEDICO);
					break;
				case Acciones.MODIFICAR_MEDICO:
					acciones.salir(Acciones.GRUPO_MEDICO);
					acciones.iniciar(Acciones.MODIFICAR_MEDICO);
					break;
				case Acciones.ELIMINAR_MEDICO:
					acciones.iniciar(Acciones.ELIMINAR_MEDICO);
					acciones.salir(Acciones.GRUPO_MEDICO);
					break;
				case Acciones.VER_MEDICO:
					acciones.iniciar(Acciones.VER_MEDICO);
					acciones.salir(Acciones.GRUPO_MEDICO);
					String[][] datosMatrizMedico = registro.mostrarMedico();
					acciones.escribir(datosMatrizMedico, Acciones.VER_MEDICO);
					break;
				case Acciones.GUARDAR_SALIR_MEDICO:
					persistencia.crearArchivoDeportivo(registro.getAgregarJugador());
					persistencia.crearArchivoMedicos(registro.getAgregarMedico());
					persistencia.crearArchivoTecnicos(registro.getAgregarTecnico());
					acciones.salir(Acciones.GUARDAR_SALIR_MEDICO);
					break;
				case Acciones.ATRAS_MEDICO:
					acciones.iniciar(Acciones.GRUPO_MEDICO);
					acciones.salir(Acciones.ATRAS_MEDICO);
					break;
				case Acciones.GUARDAR_MEDICO:
					String[]datosMedico=acciones.leer(Acciones.GUARDAR_MEDICO);
					guardarMedico(datosMedico);
					break;
				case Acciones.BUSCAR_MEDICO_MODIFICAR:
					String [] documentoModificarMedico=acciones.leer(Acciones.BUSCAR_MEDICO_MODIFICAR);
					String [][] datosBusquedaMedicoModificar=new String[1][6];
					datosBusquedaMedicoModificar[0]=registro.cargarMedico(documentoModificarMedico[0]);
					acciones.escribir(datosBusquedaMedicoModificar, Acciones.BUSCAR_MEDICO_MODIFICAR);
					break;
				case Acciones.BTN_MODIFICAR_MEDICO:
					documentoModificarMedico=acciones.leer(Acciones.BUSCAR_MEDICO_MODIFICAR);
					int posicionModificarMedico=registro.buscarMedico(documentoModificarMedico[0]);
					datosMedico = acciones.leer(Acciones.BTN_MODIFICAR_MEDICO);
					String[] datosModificarMedico = {""+posicionModificarMedico,datosMedico[0],datosMedico[1],datosMedico[2],datosMedico[3]
							,datosMedico[4]};
					modificarMedico(datosModificarMedico);
					break;
				case Acciones.BUSCAR_MEDICO_ELIMINAR:
					String [] documentoEliminarMedico=acciones.leer(Acciones.BUSCAR_MEDICO_ELIMINAR);
					String [][] datosBusquedaMedicoEliminar=new String [1][6];
					datosBusquedaMedicoEliminar[0]=registro.cargarMedico(documentoEliminarMedico[0]);
					acciones.escribir(datosBusquedaMedicoEliminar, Acciones.BUSCAR_MEDICO_ELIMINAR);
					break;
				case Acciones.BTN_ELIMINAR_MEDICO:
					documentoEliminarMedico = acciones.leer(Acciones.BUSCAR_MEDICO_ELIMINAR);
					int posicionMedicoEliminar = registro.buscarMedico(documentoEliminarMedico[0]);
					datosMedico = acciones.leer(Acciones.BTN_ELIMINAR_MEDICO);
					String[] datosEliminarMedico = {""+posicionMedicoEliminar};
					eliminarMedico(datosEliminarMedico);
					break;
					
			//Deportivo
					
				case Acciones.AGREGAR_JUGADOR:
					acciones.iniciar(Acciones.AGREGAR_JUGADOR);
					acciones.salir(Acciones.GRUPO_DEPORTIVO);
					break;
				case Acciones.MODIFICAR_JUGADOR:
					acciones.salir(Acciones.GRUPO_DEPORTIVO);
					acciones.iniciar(Acciones.MODIFICAR_JUGADOR);
					break;
				case Acciones.ELIMINAR_JUGADOR:
					acciones.salir(Acciones.GRUPO_DEPORTIVO);
					acciones.iniciar(Acciones.ELIMINAR_JUGADOR);
					break;
				case Acciones.VER_JUGADOR:
					acciones.salir(Acciones.GRUPO_DEPORTIVO);
					acciones.iniciar(Acciones.VER_JUGADOR);
					String[][] datosMatrizJugador = registro.mostrarDeportivo();
					acciones.escribir(datosMatrizJugador, Acciones.VER_JUGADOR);
					break;
				case Acciones.GUARDAR_SALIR_DEPORTIVO:
					persistencia.crearArchivoDeportivo(registro.getAgregarJugador());
					persistencia.crearArchivoMedicos(registro.getAgregarMedico());
					persistencia.crearArchivoTecnicos(registro.getAgregarTecnico());
					acciones.salir(Acciones.GUARDAR_SALIR_DEPORTIVO);
					break;
				case Acciones.ATRAS_DEPORTIVO:
					acciones.iniciar(Acciones.GRUPO_DEPORTIVO);
					acciones.salir(Acciones.ATRAS_DEPORTIVO);
					break;
				case Acciones.GUARDAR_DEPORTIVO:
					String[]datosDeportivo=acciones.leer(Acciones.GUARDAR_DEPORTIVO);
					guardarDeportivo(datosDeportivo);
					break;	
				case Acciones.BUSCAR_DEPORTIVO_MODIFICAR:
					String [] documentoModificarDeportivo=acciones.leer(Acciones.BUSCAR_DEPORTIVO_MODIFICAR);
					String [][]datosBusquedaDeportivoModificar=new String[1][6];
					datosBusquedaDeportivoModificar[0]=registro.cargarDeportivo(documentoModificarDeportivo[0]);
					acciones.escribir(datosBusquedaDeportivoModificar, Acciones.BUSCAR_DEPORTIVO_MODIFICAR);
					break;
				case Acciones.BUSCAR_DEPORTIVO_ELIMINAR:
					String [] documentoEliminarDeportivo=acciones.leer(Acciones.BUSCAR_DEPORTIVO_ELIMINAR);
					String [][]datosBusquedaDocumentoEliminar=new String[1][6];
					datosBusquedaDocumentoEliminar[0]=registro.cargarDeportivo(documentoEliminarDeportivo[0]);
					acciones.escribir(datosBusquedaDocumentoEliminar, Acciones.BUSCAR_DEPORTIVO_ELIMINAR);
					break;
				case Acciones.BTN_MODIFICAR_DEPORTIVO:
					documentoModificarDeportivo = acciones.leer(Acciones.BUSCAR_DEPORTIVO_MODIFICAR);
					int posicionDeportivoModificar = registro.buscarDeportivo(documentoModificarDeportivo[0]);
					datosDeportivo = acciones.leer(Acciones.BTN_MODIFICAR_DEPORTIVO);
					String[] datosModificarDeportivo = {""+posicionDeportivoModificar, datosDeportivo[0], datosDeportivo[1],
							datosDeportivo[2],datosDeportivo[3],datosDeportivo[4]};
					modificarDeportivo(datosModificarDeportivo);
					break;
				case Acciones.BTN_ELIMINAR_DEPORTIVO:
					documentoEliminarDeportivo = acciones.leer(Acciones.BUSCAR_DEPORTIVO_ELIMINAR);
					int posicionDeportivoEliminar = registro.buscarDeportivo(documentoEliminarDeportivo[0]);
					datosDeportivo = acciones.leer(Acciones.BTN_ELIMINAR_DEPORTIVO);
					String[] datosEliminarDeportivo = {""+posicionDeportivoEliminar};
					eliminarDeportivo(datosEliminarDeportivo);
					break;	
			//Tecnico
				case Acciones.AGREGAR_TECNICO:
					acciones.iniciar(Acciones.AGREGAR_TECNICO);
					acciones.salir(Acciones.GRUPO_TECNICO);
					break;
				case Acciones.MODIFICAR_TECNICO:
					acciones.iniciar(Acciones.MODIFICAR_TECNICO);
					acciones.salir(Acciones.GRUPO_TECNICO);
					break;
				case Acciones.ELIMINAR_TECNICO:
					acciones.iniciar(Acciones.ELIMINAR_TECNICO);
					acciones.salir(Acciones.GRUPO_TECNICO);
					break;
				case Acciones.VER_TECNICO:
					String[][] datosMatrizTecnico = registro.mostrarTecnico();
					acciones.iniciar(Acciones.VER_TECNICO);
					acciones.salir(Acciones.GRUPO_TECNICO);
					acciones.escribir(datosMatrizTecnico, Acciones.VER_TECNICO);
					break;
				case Acciones.ATRAS_TECNICO:
					acciones.iniciar(Acciones.GRUPO_TECNICO);
					acciones.salir(Acciones.ATRAS_TECNICO);
					break;	
				case Acciones.GUARDAR_SALIR_TECNICO:
					persistencia.crearArchivoDeportivo(registro.getAgregarJugador());
					persistencia.crearArchivoMedicos(registro.getAgregarMedico());
					persistencia.crearArchivoTecnicos(registro.getAgregarTecnico());
					acciones.salir(Acciones.GUARDAR_SALIR_TECNICO);
					break;	
				case Acciones.GUARDAR_TECNICO:
					String[]datosTecnico=acciones.leer(Acciones.GUARDAR_TECNICO);
					guardarTecnico(datosTecnico);
					break;
				case Acciones.BUSCAR_TECNICO_MODIFICAR:
					String [] documentoModificarTecnico=acciones.leer(Acciones.BUSCAR_TECNICO_MODIFICAR);
					String [][]datosBusquedaTecnicoModificar=new String[1][6];
					datosBusquedaTecnicoModificar[0]=registro.cargarTecnico(documentoModificarTecnico[0]);
					acciones.escribir(datosBusquedaTecnicoModificar, Acciones.BUSCAR_TECNICO_MODIFICAR);
					break;
				case Acciones.BUSCAR_TECNICO_ELIMINAR:
					String [] documentoEliminarTecnico=acciones.leer(Acciones.BUSCAR_TECNICO_ELIMINAR);
					String [][]datosBusquedaTecnicoEliminar=new String[1][6];
					datosBusquedaTecnicoEliminar[0]=registro.cargarTecnico(documentoEliminarTecnico[0]);
					acciones.escribir(datosBusquedaTecnicoEliminar, Acciones.BUSCAR_TECNICO_ELIMINAR);
					break;
				case Acciones.BTN_MODIFICAR_TECNICO:
					documentoModificarTecnico = acciones.leer(Acciones.BUSCAR_TECNICO_MODIFICAR);
					int posicionTecnicoModificar = registro.buscarTecnico(documentoModificarTecnico[0]);
					datosTecnico = acciones.leer(Acciones.BTN_MODIFICAR_TECNICO);
					String[] datosModificarTecnico = {""+posicionTecnicoModificar, datosTecnico[0], datosTecnico[1],
							datosTecnico[2],datosTecnico[3],datosTecnico[4]};
					modificarTecnico(datosModificarTecnico);
					break;
				case Acciones.BTN_ELIMINAR_TECNICO:
					documentoEliminarTecnico = acciones.leer(Acciones.BUSCAR_TECNICO_ELIMINAR);
					int posicionTecnicoEliminar = registro.buscarTecnico(documentoEliminarTecnico[0]);
					datosTecnico = acciones.leer(Acciones.BTN_ELIMINAR_TECNICO);
					String[] datosEliminarTecnico = {""+posicionTecnicoEliminar};
					eliminarTecnico(datosEliminarTecnico);
					break;
			
			//Organizar Equipo
				//Médico	
				case Acciones.ESCOGER_GRUPO_MEDICO:
					acciones.iniciar(Acciones.ESCOGER_GRUPO_MEDICO);
					acciones.salir(Acciones.ORGANIZACION);
					String[][] datosMatrizEscogerMedico = registro.mostrarMedicoOganizacion();
					acciones.escribir(datosMatrizEscogerMedico, Acciones.ESCOGER_GRUPO_MEDICO);
					break;
				case Acciones.SALIR_MEDICO:
					acciones.iniciar(Acciones.ORGANIZACION);
					acciones.salir(Acciones.SALIR_MEDICO);
					break;
				case Acciones.AGREGAR_LISTA_MEDICO:
					String [] posicionListaElegirMedico=acciones.leer(Acciones.AGREGAR_LISTA_MEDICO);
					String [][] datosMatrizListaElegirMedico = registro.medicoSeleccionado(posicionListaElegirMedico[0]);
					acciones.escribir(datosMatrizListaElegirMedico, Acciones.AGREGAR_LISTA_MEDICO);
					break;
				case Acciones.REMOVER_LISTA_MEDICO:
					String [] posicionListaElegidoMedico=acciones.leer(Acciones.REMOVER_LISTA_MEDICO);
					String [][] datosMatrizListaElegidoMedico = registro.medicoSeleccionado(posicionListaElegidoMedico[0]);
					acciones.escribir(datosMatrizListaElegidoMedico, Acciones.REMOVER_LISTA_MEDICO);
					break;
				//Técnico
				case Acciones.ESCOGER_GRUPO_TECNICO:
					acciones.iniciar(Acciones.ESCOGER_GRUPO_TECNICO);
					acciones.salir(Acciones.SALIR_MEDICO);
					String[][] datosMatrizEscogerTecnico = registro.mostrarTecnicoOganizacion();
					acciones.escribir(datosMatrizEscogerTecnico, Acciones.ESCOGER_GRUPO_TECNICO);
					break;
				case Acciones.SALIR_TECNICO:
					acciones.iniciar(Acciones.ESCOGER_GRUPO_MEDICO);
					acciones.salir(Acciones.SALIR_TECNICO);
					break;
				case Acciones.AGREGAR_LISTA_TECNICO:
					String [] posicionListaElegirTecnico=acciones.leer(Acciones.AGREGAR_LISTA_TECNICO);
					String [][] datosMatrizListaElegirTecnico = registro.tecnicoSeleccionado(posicionListaElegirTecnico[0]);
					acciones.escribir(datosMatrizListaElegirTecnico, Acciones.AGREGAR_LISTA_TECNICO);
					break;
				case Acciones.REMOVER_LISTA_TECNICO:
					String [] posicionListaElegidoTecnico=acciones.leer(Acciones.REMOVER_LISTA_TECNICO);
					String [][] datosMatrizListaElegidoTecnico = registro.tecnicoSeleccionado(posicionListaElegidoTecnico[0]);
					acciones.escribir(datosMatrizListaElegidoTecnico, Acciones.REMOVER_LISTA_TECNICO);
					break;	
				//Deportivo
				case Acciones.ESCOGER_GRUPO_DEPORTIVO:
					acciones.iniciar(Acciones.ESCOGER_GRUPO_DEPORTIVO);
					acciones.salir(Acciones.SALIR_TECNICO);
					String[][] datosMatrizEscogerDeportivo = registro.mostrarDeportivoOrganizacion();
					acciones.escribir(datosMatrizEscogerDeportivo, Acciones.ESCOGER_GRUPO_DEPORTIVO);
					break;
				case Acciones.SALIR_DEPORTIVO:
					acciones.iniciar(Acciones.ESCOGER_GRUPO_TECNICO);
					acciones.salir(Acciones.SALIR_DEPORTIVO);
					break;
				case Acciones.AGREGAR_LISTA_DEPORTIVO:
					String [] posicionListaElegirDeportivo=acciones.leer(Acciones.AGREGAR_LISTA_DEPORTIVO);
					String [][] datosMatrizListaElegirDeportivo = registro.deportivoSeleccionado(posicionListaElegirDeportivo[0]);
					acciones.escribir(datosMatrizListaElegirDeportivo, Acciones.AGREGAR_LISTA_DEPORTIVO);
					break;
				case Acciones.REMOVER_LISTA_DEPORTIVO:
					String [] posicionListaElegidoDeportivo=acciones.leer(Acciones.REMOVER_LISTA_DEPORTIVO);
					String [][] datosMatrizListaElegidoDeportivo = registro.deportivoSeleccionado(posicionListaElegidoDeportivo[0]);
					acciones.escribir(datosMatrizListaElegidoDeportivo, Acciones.REMOVER_LISTA_DEPORTIVO);
					break;	
				//Formaciones	
				case Acciones.FORMACIONES:
					acciones.iniciar(Acciones.FORMACIONES);
					acciones.salir(Acciones.SALIR_DEPORTIVO);
					break;
				case Acciones.SALIR_FORMACIONES:
					acciones.iniciar(Acciones.ESCOGER_GRUPO_DEPORTIVO);
					acciones.salir(Acciones.SALIR_FORMACIONES);
					break;
				case Acciones.MIRAR:
					acciones.iniciar(Acciones.MIRAR);
					break;
				case Acciones.VER_EQUIPO:
					acciones.iniciar(Acciones.VER_EQUIPO);
					acciones.salir(Acciones.SALIR_FORMACIONES);
					String [] verEquipoMedico=acciones.leer(Acciones.CARGAR_MEDICO);
					String [] verEquipoTecnico=acciones.leer(Acciones.CARGAR_TECNICO);
					String [] verEquipoDeportivo=acciones.leer(Acciones.CARGAR_JUGADOR);
					
					String [][] datosEquipo = registro.mostrarEquipo(verEquipoDeportivo,verEquipoMedico,verEquipoTecnico,"jugador","medico","tecnico");
					acciones.escribir(datosEquipo, Acciones.REMOVER_LISTA_DEPORTIVO);
					break;
				case Acciones.SALIR:
					persistencia.crearArchivoDeportivo(registro.getAgregarJugador());
					persistencia.crearArchivoMedicos(registro.getAgregarMedico());
					persistencia.crearArchivoTecnicos(registro.getAgregarTecnico());
					acciones.salir(Acciones.SALIR);
					break;
				//VerEquipo
				case Acciones.ATRAS_EQUIPO:
					acciones.iniciar(Acciones.FORMACIONES);
					acciones.salir(Acciones.ATRAS_EQUIPO);
					break;
				case Acciones.MENU:
					acciones.iniciar(Acciones.ORGANIZACION);
					acciones.salir(Acciones.ATRAS_EQUIPO);
				default:
					break;
		}
	}
	//Medico
	
		private void guardarMedico(String[] datosMedico) {
			boolean comprobar=true;
			String documento="";
			String numeroLicencia="";
			if(registro.getAgregarMedico().size()>0) {
				for(int i=0;i<registro.getAgregarMedico().size();i++) {
					if(datosMedico[0].equals(registro.getAgregarMedico().get(i).getDocumento()) ){
						JOptionPane.showMessageDialog(null, "Ya existe esa cédula");
						comprobar=false;
					}
					else {
						documento = datosMedico[0];
					}
					if(datosMedico[1].equals(registro.getAgregarMedico().get(i).getNumeroLicencia())) {
						JOptionPane.showMessageDialog(null, "Ya existe el numero de licencia");
						comprobar=false;
					}
					else {
						numeroLicencia = datosMedico[1];
					}
				}
				if(datosMedico[0].equals("") || datosMedico[1].equals("") || datosMedico[2].equals("") || 
						datosMedico[3].equals("") || datosMedico[4].equals("null")) {
					JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
					comprobar=false;
				}
			}
			else {
				documento = datosMedico[0];
				numeroLicencia = datosMedico[1];
			}
			String nombre = datosMedico[2];
			String apellido = datosMedico[3];
			cargoMedico cargo = null;
			if (datosMedico[4].equals("GENERAL")) {
				cargo = cargo.GENERAL;
			}
			if (datosMedico[4].equals("TERAPEUTA")) {
				cargo = cargo.TERAPEUTA;
			}
			if(comprobar) {
				registro.agregarMedico(documento, numeroLicencia, nombre, apellido, cargo);
				JOptionPane.showMessageDialog(null, "Guardado Exitoso");
				acciones.salir(Acciones.ATRAS_MEDICO);
				acciones.iniciar(Acciones.GRUPO_MEDICO);
			}
		}
		private void modificarMedico(String[] datosModificarMedico) {
			boolean comprobar=true;
			String documento=datosModificarMedico[1];
			String numeroLicencia="";
			if(registro.getAgregarMedico().size()>0) {
				for(int i=0;i<registro.getAgregarMedico().size();i++) {
					if(datosModificarMedico[2].equals(registro.getAgregarMedico().get(i).getNumeroLicencia())) {
						JOptionPane.showMessageDialog(null, "Ya existe el numero de licencia");
						comprobar=false;
					}
					else {
						numeroLicencia = datosModificarMedico[2];
					}
				}
				if(datosModificarMedico[1].equals("") || datosModificarMedico[2].equals("") || 
						datosModificarMedico[3].equals("") || datosModificarMedico[4].equals("null")) {
					JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
					comprobar=false;
				}
				String nombre = datosModificarMedico[3];
				String apellido = datosModificarMedico[4];
				cargoMedico cargo = null;
				if (datosModificarMedico[5].equals("GENERAL")) {
					cargo = cargo.GENERAL;
				}
				if (datosModificarMedico[5].equals("TERAPEUTA")) {
					cargo = cargo.TERAPEUTA;
				}
				if(comprobar) {
					registro.modificarMedicoDocumento(datosModificarMedico[0],documento,numeroLicencia,nombre,apellido,cargo);
					JOptionPane.showMessageDialog(null, "Modificación Exitosa");
					acciones.salir(Acciones.ATRAS_MEDICO);
					acciones.iniciar(Acciones.GRUPO_MEDICO);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "No se ha registrado a ningún médico");
			}
		}
		private void eliminarMedico(String[] datosEliminarMedico) {
			if(registro.getAgregarMedico().size()>0) {
				registro.eliminarMedico(datosEliminarMedico[0]);
				JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
				acciones.salir(Acciones.ATRAS_MEDICO);
				acciones.iniciar(Acciones.GRUPO_MEDICO);
			}
			else {
				JOptionPane.showMessageDialog(null, "No se ha registrado a ningún médico");
			}
		}
		
	//Deportivo
		private void guardarDeportivo(String[] datosDeportivo) {
			boolean comprobar=true;
			String documento="";
			if(registro.getAgregarJugador().size()>0) {
				for(int i=0;i<registro.getAgregarJugador().size();i++) {
					if(datosDeportivo[0].equals(registro.getAgregarJugador().get(i).getDocumento()) || 
							datosDeportivo[0].equals(registro.getAgregarJugador().get(i).getDocumento())){
						JOptionPane.showMessageDialog(null, "Ya existe esa cédula");
						comprobar=false;
					}
					else {
						documento = datosDeportivo[0];
					}
				}
				if(datosDeportivo[0].equals("") || datosDeportivo[1].equals("") || datosDeportivo[2].equals("") || 
						datosDeportivo[3].equals("") || datosDeportivo[4].equals("null")) {
					JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
					comprobar=false;
				}
			}
			else {
				documento = datosDeportivo[0];
			}
			String dorsal = datosDeportivo[1];
			String nombre = datosDeportivo[2];
			String apellido = datosDeportivo[3];
			posicionJugador posicion = null;
			if (datosDeportivo[4].equals("PORTEROS")) {
				posicion = posicion.PORTEROS;
			}
			if (datosDeportivo[4].equals("DEFENSAS")) {
				posicion = posicion.DEFENSAS;
			}
			if (datosDeportivo[4].equals("CENTROCAMPISTAS")) {
				posicion = posicion.CENTROCAMPISTAS;
			}
			if (datosDeportivo[4].equals("DELANTEROS")) {
				posicion = posicion.DELANTEROS;
			}
			if(comprobar) {
				registro.agregarJugador(documento, dorsal, nombre, apellido, posicion);
				JOptionPane.showMessageDialog(null, "Guardado Exitoso");
				acciones.salir(Acciones.ATRAS_DEPORTIVO);
				acciones.iniciar(Acciones.GRUPO_DEPORTIVO);
				
			}
		}
		private void modificarDeportivo(String[] datosModificarDeportivo) {
			boolean comprobar=true;
			if(registro.getAgregarJugador().size()>0) {
				String documento = datosModificarDeportivo[1];
				String dorsal=datosModificarDeportivo[2];
				String nombre=datosModificarDeportivo[3];
				String apellido=datosModificarDeportivo[4];
				posicionJugador posicion=null;
				if (datosModificarDeportivo[5].equals("PORTEROS")) {
					posicion = posicion.PORTEROS;
				}
				if (datosModificarDeportivo[5].equals("DEFENSAS")) {
					posicion = posicion.DEFENSAS;
				}
				if (datosModificarDeportivo[5].equals("CENTROCAMPISTAS")) {
					posicion = posicion.CENTROCAMPISTAS;
				}
				if (datosModificarDeportivo[5].equals("DELANTEROS")) {
					posicion = posicion.DELANTEROS;
				}
				if(datosModificarDeportivo[1].equals("") || datosModificarDeportivo[2].equals("") || 
						datosModificarDeportivo[3].equals("") || datosModificarDeportivo[4].equals("null")) {
					JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
					comprobar=false;
				}
				if(comprobar) {
					registro.modificarDeportivo(datosModificarDeportivo[0],documento,dorsal,nombre,apellido,posicion);
					JOptionPane.showMessageDialog(null, "Modificación Exitosa");
					acciones.salir(Acciones.ATRAS_DEPORTIVO);
					acciones.iniciar(Acciones.GRUPO_DEPORTIVO);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "No se ha registrado a ningún jugador");
			}	
		}
		private void eliminarDeportivo(String[] datosEliminarDeportivo) {
			if(registro.getAgregarJugador().size()>0) {
				registro.eliminarDeportivo(datosEliminarDeportivo[0]);
				JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
				acciones.salir(Acciones.ATRAS_DEPORTIVO);
				acciones.iniciar(Acciones.GRUPO_DEPORTIVO);
			}
			else {
				JOptionPane.showMessageDialog(null, "No se ha registrado a ningún jugador");
			}
		}
	
	//Tecnico
		private void guardarTecnico(String[] datosTecnico) {
			boolean comprobar=true;
			String documento="";
			String numeroLicencia="";
			if(registro.getAgregarTecnico().size()>0) {
				for(int i=0;i<registro.getAgregarTecnico().size();i++) {
					if(datosTecnico[0].equals(registro.getAgregarTecnico().get(i).getDocumento())){
						JOptionPane.showMessageDialog(null, "Ya existe esa cédula");
						comprobar=false;
					}
					else {
						documento = datosTecnico[0];
					}
					if(datosTecnico[1].equals(registro.getAgregarTecnico().get(i).getNumeroLicencia())) {
						JOptionPane.showMessageDialog(null, "Ya existe el numero de licencia");
						comprobar=false;
					}
					else {
						numeroLicencia = datosTecnico[1];
					}
				}
				if(datosTecnico[0].equals("") || datosTecnico[1].equals("") || datosTecnico[2].equals("") || 
						datosTecnico[3].equals("") || datosTecnico[4].equals("null")) {
					JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
					comprobar=false;
				}
			}
			else {
				documento = datosTecnico[0];
				numeroLicencia = datosTecnico[1];
			}
			String nombre=datosTecnico[2];
			String apellido=datosTecnico[3];
			cargoTecnico cargo=null;
			if(datosTecnico[4].equals("AUXILIAR")) {
				cargo=cargo.AUXILIAR;
			}
			if(datosTecnico[4].equals("ENTRENADOR")) {
				cargo=cargo.ENTRENADOR;
			}
			if(datosTecnico[4].equals("PREPARADOR_FISICO")) {
				cargo=cargo.PREPARADOR_FISICO;
			}
			if(comprobar) {
				registro.agregarTecnico(documento, numeroLicencia, nombre, apellido, cargo);
				JOptionPane.showMessageDialog(null, "Guardado exitoso");
				acciones.salir(Acciones.ATRAS_TECNICO);
				acciones.iniciar(Acciones.GRUPO_TECNICO);
			}
		}
		private void modificarTecnico(String[] datosModificaTecnico) {
			boolean comprobar=true;
			String documento=datosModificaTecnico[1];
			String numeroLicencia="";
			if(registro.getAgregarTecnico().size()>0) {
				for(int i=0;i<registro.getAgregarTecnico().size();i++) {
					if(datosModificaTecnico[2].equals(registro.getAgregarTecnico().get(i).getNumeroLicencia())) {
						JOptionPane.showMessageDialog(null, "Ya existe el numero de licencia");
						comprobar=false;
					}
					else {
						numeroLicencia = datosModificaTecnico[2];
					}
				}
				if(datosModificaTecnico[1].equals("") || datosModificaTecnico[2].equals("") || 
						datosModificaTecnico[3].equals("") || datosModificaTecnico[4].equals("null")) {
					JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
					comprobar=false;
				}
				String nombre=datosModificaTecnico[3];
				String apellido=datosModificaTecnico[4];
				cargoTecnico cargo=null;
				if(datosModificaTecnico[5].equals("AUXILIAR")) {
					cargo=cargo.AUXILIAR;
				}
				else if(datosModificaTecnico[5].equals("ENTRENADOR")) {
					cargo=cargo.ENTRENADOR;
				}
				else if(datosModificaTecnico[5].equals("PREPARADOR_FISICO")) {
					cargo=cargo.PREPARADOR_FISICO;
				}
				if(comprobar) {
					registro.modificarTecnico(datosModificaTecnico[0],documento,numeroLicencia,nombre,apellido,cargo);
					JOptionPane.showMessageDialog(null, "Modificación exitosa");
					acciones.salir(Acciones.ATRAS_TECNICO);
					acciones.iniciar(Acciones.GRUPO_TECNICO);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "No se ha registrado ningún técnico");
			}
			
		}	
		private void eliminarTecnico(String[] datosEliminarTecnico) {
			if(registro.getAgregarTecnico().size()>0) {				
				registro.eliminarTecnico(datosEliminarTecnico[0]);
				JOptionPane.showMessageDialog(null, "Se elimimó correctamente");
				acciones.salir(Acciones.ATRAS_TECNICO);
				acciones.iniciar(Acciones.GRUPO_TECNICO);
			}
			else {
				JOptionPane.showMessageDialog(null, "No se ha registrado ningún técnico");
			}
		}
		
		//Serializacion
		private void cargarDatosPersistencia() {
			registro.setAgregarMedico(persistencia.leerArchivoMedico());
			registro.setAgregarTecnico(persistencia.leerArchivoTecnico());
			registro.setAgregarJugador(persistencia.leerArchivoDeportivo());
		}
}

