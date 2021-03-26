package vista;

import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

import control.Control;
import crudDeportivo.crudGrupoDeportivo;
import crudMedico.crudGrupoMedico;
import crudTecnico.crudGrupoTecnico;
import crudTecnico.modificarTecnico;
import organizacion.VerEquipo;
import organizacion.escogerGrupoMedico;
import organizacion.ventanaPrincipalOrganizacion;
import organizacion.formaciones;

public class ventanaPrincipal extends JFrame implements Acciones{
	private JTabbedPane jtpPestaña;
	private crudGrupoDeportivo grupoDeportivo=new crudGrupoDeportivo();
	private crudGrupoMedico grupoMedico=new crudGrupoMedico();
	private crudGrupoTecnico grupoTecnico=new crudGrupoTecnico();
	private ventanaPrincipalOrganizacion  organizacion = new ventanaPrincipalOrganizacion();
	
	public ventanaPrincipal() {
		this.setSize(600, 480);
		this.setLocation(350, 100);
	    this.setTitle("Equipo NN");
	    this.setDefaultCloseOperation(0);
	    this.setResizable(false);
	    inicializar();
	    caracteristicas();
	    agregar();
	}
	public void inicializar() {
		jtpPestaña=new JTabbedPane();
	}
	public void caracteristicas() {
		jtpPestaña.add("Grupo Médico", grupoMedico);
		jtpPestaña.add("Grupo Deportivo", grupoDeportivo);
		jtpPestaña.add("Grupo Tecnico", grupoTecnico);
		jtpPestaña.add("Organización de Equipos", organizacion);		
	}
	public void agregar() {
		add(jtpPestaña);
	}
	
	public void asignarControl(Control control) {
		grupoMedico.asignarControl(control);
		grupoDeportivo.asignarControl(control);
		grupoTecnico.asignarControl(control);
		organizacion.asignarControl(control);
	}
	public void iniciar(String seccion) {
		//Medico
		if (seccion.equals("medico") || seccion.equals("agregarMedico") || 
			seccion.equals("modificarMedico") || seccion.equals("eliminarMedico")
			||seccion.equals("verMedico")){
			grupoMedico.iniciar(seccion);
		}
		//Deportivo
		if(seccion.equals("deportivo")||seccion.equals("agregarJugador")||
			seccion.equals("modificarJugador")|| seccion.equals("eliminarJugador")
			||seccion.equals("verJugador")) {
			grupoDeportivo.iniciar(seccion);
		}
		//Tecnico
		if(seccion.equals("tecnico")||seccion.equals("agregarTecnico")||
				   seccion.equals("modificarTecnico")|| seccion.equals("eliminarTecnico")
				   ||seccion.equals("verTecnico")) {
			grupoTecnico.iniciar(seccion);
		}
		//Organizacion
		if(seccion.equals("organizacion") || seccion.equals("escogerGrupoMed") || 
				seccion.equals("escogerGrupoTec") || seccion.equals("escogerGrupoDep") 
				|| seccion.equals("formaciones") || seccion.equals("mirar") || seccion.equals("verEquipo")){
			organizacion.iniciar(seccion);
		}
		this.repaint();
	}
	public void salir(String seccion) {
		//Medico
		if (seccion.equals("medico") || seccion.equals("agregarMedico") || 
			seccion.equals("modificarMedico")|| seccion.equals("eliminarMedico")||
			seccion.equals("verMedico")||seccion.equals("atrasMedico")){
			grupoMedico.salir(seccion);
		}	
		//Deportivo
		if(seccion.equals("deportivo")||seccion.equals("agregarJugador")||
		   seccion.equals("modificarJugador")|| seccion.equals("eliminarJugador")
		   ||seccion.equals("verJugador")||seccion.equals("atrasDeportivo"))	{
			grupoDeportivo.salir(seccion);
		}
		//Tecnico
		if(seccion.equals("tecnico")||seccion.equals("agregarTecnico")||
		   seccion.equals("modificarTecnico")|| seccion.equals("eliminarTecnico")
		   ||seccion.equals("verTecnico")||seccion.equals("atrasTecnico")) {
			grupoTecnico.salir(seccion);
		}
		//Organizacion
		if(seccion.equals("organizacion") || seccion.equals("salirMedico") || 
				seccion.equals("salirTecnico") || seccion.equals("salirDeportivo") 
				|| seccion.equals("salirFormaciones") || seccion.equals("atrasEquipo")) {
			organizacion.salir(seccion);
		}
		//Salir
		if(seccion.equals("guardarSalirMedico") || seccion.equals("guardarSalirTecnico") || seccion.equals("guardarSalirDeportivo") || seccion.equals("salir")) {
			System.exit(0);
		}
		this.repaint();
	}
	public void escribir(String[][] entradas, String seccion) {
		//Medico
		if (seccion.equals("verMedico") || seccion.equals("buscarMedicoModificar") || seccion.equals("buscarMedicoEliminar")) {
			grupoMedico.escribir(entradas, seccion);
		}
		//Deportivo
		if (seccion.equals("verJugador") || seccion.equals("buscarDeportivoModificar")||seccion.equals("buscarDeportivoEliminar")) {
			grupoDeportivo.escribir(entradas, seccion);
		}
		//Tecnico
		if (seccion.equals("verTecnico") || seccion.equals("buscarTecnicoModificar") || seccion.equals("buscarTecnicoEliminar")) {
			grupoTecnico.escribir(entradas, seccion);
		}
		//Organizacion
		if(seccion.equals("escogerGrupoMed") || seccion.equals("escogerGrupoTec") || seccion.equals("escogerGrupoDep") || 
				seccion.equals("agregarListaMedico") || seccion.equals("removerListaMedico") || seccion.equals("agregarListaTecnico") || 
				seccion.equals("removerListaTecnico") || seccion.equals("agregarListaDeportivo") || seccion.equals("removerListaDeportivo") ||
				seccion.equals("verEquipo")) {
			organizacion.escribir(entradas, seccion);
		}
	}
	public String[] leer(String seccion) {
		//Medico
		String[] datosMedico = null;
		if (seccion.equals("guardarMedico") || seccion.equals("buscarMedicoModificar") || seccion.equals("buscarMedicoEliminar") || seccion.equals("btnModificarMedico") || 
				seccion.equals("btnEliminarMedico")){
			datosMedico = grupoMedico.leer(seccion);
			return datosMedico;
		}
		//Deportivo
		String[] datosJugador = null;
		if (seccion.equals("guardarJugador") || seccion.equals("buscarDeportivoModificar") || seccion.equals("buscarDeportivoEliminar") 
				|| seccion.equals("btnModificarDeportivo") || seccion.equals("btnEliminarDeportivo")){
			datosJugador = grupoDeportivo.leer(seccion);
			return datosJugador;
		}
		//Tecnico
		String [] datosTecnico=null;
		if(seccion.equals("guardarTecnico") || seccion.equals("buscarTecnicoModificar") || seccion.equals("buscarTecnicoEliminar") 
				|| seccion.equals("btnModificarTecnico") || seccion.equals("btnEliminarTecnico")){
			datosTecnico=grupoTecnico.leer(seccion);
			return datosTecnico;
		}
		//Organizacion
		String [] datosLista=null;
		if(seccion.equals("agregarListaMedico") || (seccion.equals("removerListaMedico")) || (seccion.equals("agregarListaTecnico")) 
				|| seccion.equals("removerListaTecnico") || seccion.equals("agregarListaDeportivo") || seccion.equals("removerListaDeportivo") 
				|| seccion.equals("cargarMedico")|| seccion.equals("cargarTecnico")|| seccion.equals("cargarJugador")) {
			datosLista=organizacion.leer(seccion);
			return datosLista;
		}
		return null;
	}
}