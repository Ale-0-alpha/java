package conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	String driver = "com.mysql.cj.jdbc.Driver";
	String user = "root";
	String pass = "";
	String bd = "java_db_ale";
	String url = "jdbc:mysql://localhost:3306/" + bd;
	Connection conexion;
	
	public Conexion() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conexion = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
