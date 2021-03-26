package vista;

import control.Control;

public interface Acciones {
		
	
	//Medico
		public static String GRUPO_MEDICO="medico";
		public static String AGREGAR_MEDICO="agregarMedico";
		public static String MODIFICAR_MEDICO="modificarMedico";
		public static String ELIMINAR_MEDICO="eliminarMedico";
		public static String VER_MEDICO="verMedico";
		public static String ATRAS_MEDICO="atrasMedico";
		public static String GUARDAR_MEDICO="guardarMedico";
		public static String BTN_MODIFICAR_MEDICO="btnModificarMedico";
		public static String BTN_ELIMINAR_MEDICO="btnEliminarMedico";
		public static String BUSCAR_MEDICO_MODIFICAR = "buscarMedicoModificar";
		public static String BUSCAR_MEDICO_ELIMINAR = "buscarMedicoEliminar";
		public static String GUARDAR_SALIR_MEDICO = "guardarSalirMedico";
		
	//Jugador
		public static String GRUPO_DEPORTIVO="deportivo";
		public static String AGREGAR_JUGADOR="agregarJugador";
		public static String MODIFICAR_JUGADOR="modificarJugador";
		public static String ELIMINAR_JUGADOR="eliminarJugador";
		public static String VER_JUGADOR="verJugador";
		public static String ATRAS_DEPORTIVO="atrasDeportivo";
		public static String GUARDAR_DEPORTIVO="guardarJugador";
		public static String BTN_MODIFICAR_DEPORTIVO="btnModificarDeportivo";
		public static String BTN_ELIMINAR_DEPORTIVO="btnEliminarDeportivo";
		public static String BUSCAR_DEPORTIVO_ELIMINAR = "buscarDeportivoEliminar"; 
		public static String BUSCAR_DEPORTIVO_MODIFICAR = "buscarDeportivoModificar";
		public static String GUARDAR_SALIR_DEPORTIVO = "guardarSalirDeportivo";
		
	//Tecnico
		public static String GRUPO_TECNICO="tecnico";
		public static String AGREGAR_TECNICO="agregarTecnico";
		public static String MODIFICAR_TECNICO="modificarTecnico";
		public static String ELIMINAR_TECNICO="eliminarTecnico";
		public static String VER_TECNICO="verTecnico";
		public static String ATRAS_TECNICO="atrasTecnico";
		public static String GUARDAR_TECNICO="guardarTecnico";
		public static String BTN_MODIFICAR_TECNICO="btnModificarTecnico";
		public static String BTN_ELIMINAR_TECNICO="btnEliminarTecnico";
		public static String BUSCAR_TECNICO_MODIFICAR="buscarTecnicoModificar";
		public static String BUSCAR_TECNICO_ELIMINAR="buscarTecnicoEliminar";
		public static String GUARDAR_SALIR_TECNICO = "guardarSalirTecnico";
	//Organizacion
		public static String ORGANIZACION="organizacion";
		//Grupo Medico
			public static String SALIR_MEDICO="salirMedico";
			public static String ESCOGER_GRUPO_MEDICO="escogerGrupoMed";
			public static String AGREGAR_LISTA_MEDICO = "agregarListaMedico";
			public static String REMOVER_LISTA_MEDICO = "removerListaMedico";
		//Grupo Tecnico
			public static String ESCOGER_GRUPO_TECNICO = "escogerGrupoTec";
			public static String SALIR_TECNICO="salirTecnico";
			public static String AGREGAR_LISTA_TECNICO = "agregarListaTecnico";
			public static String REMOVER_LISTA_TECNICO = "removerListaTecnico";
		//Grupo Deportivo
			public static String ESCOGER_GRUPO_DEPORTIVO="escogerGrupoDep";
			public static String SALIR_DEPORTIVO="salirDeportivo";
			public static String AGREGAR_LISTA_DEPORTIVO = "agregarListaDeportivo";
			public static String REMOVER_LISTA_DEPORTIVO = "removerListaDeportivo";
		//Formaciones
			public static String FORMACIONES = "formaciones";
			public static String SALIR_FORMACIONES = "salirFormaciones";
			public static String MIRAR = "mirar";
			public static String VER_EQUIPO = "verEquipo";
			public static String SALIR = "salir";
		//VerEquipo	
			public static String ATRAS_EQUIPO = "atrasEquipo";
			public static String MENU = "menu";
			public static String CARGAR_MEDICO="cargarMedico";
			public static String CARGAR_JUGADOR="cargarJugador";
			public static String CARGAR_TECNICO="cargarTecnico";
			
	public void asignarControl(Control control);
	public void iniciar(String seccion);
	public void salir(String seccion);
	public void escribir(String[][] entradas, String seccion);
	public String[] leer(String seccion);
}


