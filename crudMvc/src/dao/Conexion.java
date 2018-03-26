package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	private static Connection conexion;
	static String host = "jdbc:mysql://127.0.0.1:3306/bd_persona";
	static String user = "root";
	static String pass = "1234";

	public static Connection conectar() {

		// If conection is diferent of null then return conection
		if (conexion != null) {
			return conexion;
		}

		// Do a Try/catch to control exceptions
		try {

			// Here Driver, in this case MySQL
			Class.forName("com.mysql.jdbc.Driver");

			conexion = DriverManager.getConnection(host, user, pass);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return conexion;
	}

	public static void desconectar() {

		if (conexion == null) {
			return;
		}

		try {
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
