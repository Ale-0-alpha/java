package Alumno;

import Asignatura.Asignatura;
import Persona.Persona;

public class Alumno extends Persona {
	private String institucion;
	Asignatura[] materias;
	
	//Comentario: esta clase explica sobre como crear un super constructor para que se puedan asignar los codigos
	public Alumno() {
		super(0);
	}
	
	public Alumno(String nombre, int cedula, String institucion, Asignatura[] materias) {
		super(nombre, cedula);
		this.institucion = institucion;
		this.materias = materias;
		
	}
	
	public String getInstitucion() {
		return institucion;
		
	}
	
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
		
	}
	
	public Asignatura[] getMaterias() {
		return materias;
	}

	public void setMaterias(Asignatura[] materias) {
		this.materias = materias;
	}
}
