package coleccion;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Producto> productos = new ArrayList<>();
		
		//Agregar productos
		productos.add(new Producto(1, "Laptop" , 1200.99));
		productos.add(new Producto(2, "Mouse" , 25.50));
		productos.add(new Producto(3, "Teclado" , 45.00));
		
		//Mostrar productos
		System.out.println("Lista de productos: ");
		for (Producto p : productos) {
			System.out.println(p);
		}
		
		//Buscar producto por codigo
		int codigoBuscado = 2;
		for (Producto p : productos) {
			if (p.getCodigo() == codigoBuscado) {
				System.out.println("\nProducto encontrado: " + p);
				break;
			}
		}
		//Eliminar un producto
		productos.removeIf(p -> p.getCodigo() == 1);
		System.out.println("\nLista despues de eliminar producto con codigo 1: ");
		for (Producto p : productos) {
			System.out.println(p);
		}
	}
}
