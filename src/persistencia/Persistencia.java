package persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import logica.grupoDeportivo;
import logica.grupoMedico;
import logica.grupoTecnico;

public class Persistencia {
	public void crearArchivoMedicos(ArrayList<grupoMedico> medicos){
		FileOutputStream file;
		try {
			file = new FileOutputStream("src\\archivos\\medicos.ser");
			ObjectOutputStream objeto = new ObjectOutputStream(file);

			for (int i = 0; i < medicos.size(); i++) {
				objeto.writeObject(medicos.get(i));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<grupoMedico> leerArchivoMedico(){
		ArrayList<grupoMedico> medicos = new ArrayList<grupoMedico>();
		try {
			FileInputStream file = new FileInputStream("src\\archivos\\medicos.ser");
			ObjectInputStream objeto = new ObjectInputStream(file);
			
			grupoMedico medico = (grupoMedico) objeto.readObject();
			medicos.add(medico);
			
			while (medico != null) {
				medico = (grupoMedico) objeto.readObject();
				medicos.add(medico);
			}
		}	
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("El archivo Medicos se cargó correctamente");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return medicos;
	}
	
	//Tecnico
	public void crearArchivoTecnicos(ArrayList<grupoTecnico> agregarTecnico) {
		FileOutputStream file;
		try {
			file = new FileOutputStream("C:\\Users\\George\\Documents\\Eclipse\\proyectoEconomia\\src\\archivos\\tecnicos.ser");
			ObjectOutputStream objeto = new ObjectOutputStream(file);

			for (int i = 0; i < agregarTecnico.size(); i++) {
				objeto.writeObject(agregarTecnico.get(i));
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("archivo");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("este2");
			e.printStackTrace();
		}
	}
	public ArrayList<grupoTecnico> leerArchivoTecnico(){
		ArrayList<grupoTecnico> tecnicos = new ArrayList<grupoTecnico>();
		try {
			FileInputStream file = new FileInputStream("src\\archivos\\tecnicos.ser");
			ObjectInputStream objeto = new ObjectInputStream(file);
			
			grupoTecnico tecnico = (grupoTecnico) objeto.readObject();
			tecnicos.add(tecnico);
			
			while (tecnico != null) {
				tecnico = (grupoTecnico) objeto.readObject();
				tecnicos.add(tecnico);
			}
		}	
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("El archivo tecnicos se cargó correctamente");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return tecnicos;
	}
	//Deportivo
	public void crearArchivoDeportivo(ArrayList<grupoDeportivo> deportivo) {
		FileOutputStream file;
		try {
			file = new FileOutputStream("C:\\Users\\George\\Documents\\Eclipse\\proyectoEconomia\\src\\archivos\\deportivos.ser");
			ObjectOutputStream objeto = new ObjectOutputStream(file);

			for (int i = 0; i < deportivo.size(); i++) {
				objeto.writeObject(deportivo.get(i));
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("archivo");
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("este3");
			e.printStackTrace();
		}
	}
	public ArrayList<grupoDeportivo> leerArchivoDeportivo(){
		ArrayList<grupoDeportivo> deportivos = new ArrayList<grupoDeportivo>();
		try {
			FileInputStream file = new FileInputStream("src\\archivos\\deportivos.ser");
			ObjectInputStream objeto = new ObjectInputStream(file);
			
			grupoDeportivo deportivo = (grupoDeportivo) objeto.readObject();
			deportivos.add(deportivo);
			
			while (deportivo != null) {
				deportivo = (grupoDeportivo) objeto.readObject();
				deportivos.add(deportivo);
			}
		}	
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("El archivo deportivos se cargó correctamente");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return deportivos;
	}
}
