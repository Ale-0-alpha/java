package Evaluacion2;

public class Producto {
	private String nombre;
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void mostrarProducto() {
		System.out.println("Nombre del producto: " + nombre);
	}
		
	
}
