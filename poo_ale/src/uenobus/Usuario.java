package uenobus;

public class Usuario {
	//atributos
	String nombre, telefono;
	int cedula;
	
	public Usuario(String n) {}
	
	//cargar = set, mostrar = get
	
	public void setNombre(String n) {
		nombre = n;
	}

	public void setCedula(int c) {
		cedula = c;
	}
	
	public void setTelefono(String t) {
		telefono = t;
	}
	
	public String getNombre() {
	    return nombre;
	}
	
	public int getCedula() {
		return cedula;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
}
