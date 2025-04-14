package controllers;

import java.util.ArrayList;

import models.Traduccion;

public class TraductorController {
	private ArrayList<Traduccion> lista;
	
	public TraductorController() {
		lista = new ArrayList<>();
	}
	
	public void agregarTraduccion(Traduccion t) {
		lista.add(t);
	}
	
	public boolean modificarTraduccion(int id, String nuevoEspanol, String nuevoIngles) {
			for (Traduccion t : lista) {
				if (t.getID() == id) {
					t.setEspanol(nuevoEspanol);
					t.setIngles(nuevoIngles);
					return true;
				}
			}
			return false;
	}
	
	public boolean eliminarTraduccion(int id) {
		return lista.removeIf(t -> t.getID() == id);
	}
	
	public Traduccion consultarPorID(int id) {
		for (Traduccion t : lista) {
			if (t.getID() == id) {
				return t;
			}
		}
		return null;
	}
	
	public void mostrarTodas() {
		for (Traduccion t : lista) {
			System.out.println(t);
		}
	}
}
