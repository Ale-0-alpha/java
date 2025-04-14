package conexionbd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
Conexion c = new Conexion();

if(c.conexion != null) {
	System.out.println("Conexion establecida");
}else {
	System.out.println("Error de conexion");
}
	String consulta = "select codigo, nombre, precio from productos";
	System.out.println("Cargar datos");
		Scanner sc = new Scanner(System.in);
		String nombre;
		String insercion = "Insert into productos(nombre, precio) values (?, ?)";
	PreparedStatement ps;
	ResultSet rs;
	int precio;
	while(true){
		try {
		ps = c.conexion.prepareStatement(consulta);
		rs = ps.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getString("nombre") + " -> ");
			System.out.println(rs.getInt("precio"));
		}
		
		System.out.println("Ingre nombre: ");
		nombre = sc.next();
		System.out.println("Ingrese precio: ");
		precio = sc.nextInt();
		
		ps = c.conexion.prepareStatement(insercion);
		ps.setString(1, nombre);
		ps.setInt(2, precio);
		ps.executeUpdate();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	// fin while
		//c.conexion.close();
	
	
	
	
	
	
	
}
}
}