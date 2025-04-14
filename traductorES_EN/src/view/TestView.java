package view;

import controllers.TraductorController;
import models.Traduccion;

public class TestView {
	
	
	public static void main(String[] args) {
		TraductorController controlador = new TraductorController();
		
		//Agregar traducciones
		controlador.agregarTraduccion(new Traduccion(1, "hola", "hello"));
		controlador.agregarTraduccion(new Traduccion(2, "adios", "goodbye"));
		controlador.agregarTraduccion(new Traduccion(3, "gracias", "thank you"));
		
		System.out.println("Todas las traducciones: ");
		controlador.mostrarTodas();
		
		//Modificar una traduccion
		controlador.modificarTraduccion(2, "adios", "goodbye");
		
		//Consultar una traduccion
		System.out.println("\nConsulta ID 2: ");
		Traduccion t = controlador.consultarPorID(2);
		if (t != null) {
			System.out.println(t);
		}
		
		//Eliminar una traduccion
		controlador.eliminarTraduccion(1);
		
		System.out.println("\nTraducciones despues de eliminar ID 1: ");
		controlador.mostrarTodas();
	}
}
