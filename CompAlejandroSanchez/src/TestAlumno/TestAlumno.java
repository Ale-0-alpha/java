package TestAlumno;

import Alumno.Alumno;
import Asignatura.Asignatura;

public class TestAlumno {
	public static void main(String[] args) {
		
		Asignatura m1 = new Asignatura(2102, "Programacion JAVA junior");
		
	
		Asignatura[] materias = {m1};
		Alumno alumno = new Alumno("Alejandro", 6954432, "Institucion SNPP", materias);
		
		System.out.println("Nombre: "+ alumno.getNombre());
		System.out.println("Cedula: " + alumno.getCedula());
		System.out.println("Institucion: " + alumno.getInstitucion());
		System.out.println("Materias: ");
		for (Asignatura materia : alumno.getMaterias()) {
			System.out.println(" - " + materia.getCodigo() + " : " + materia.getNombre());
			
		}
	}
}
