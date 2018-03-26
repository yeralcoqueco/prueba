package dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import dao.Conexion;
import dao.IPersonaDAO;
import model.Persona;

public class PersonaDAOImpl implements IPersonaDAO {

	@Override
	public List<Persona> listarTodos() {

		List<Persona> lista = new ArrayList<>();

		try {

			Statement statement = Conexion.conectar().createStatement();
			String sql = "SELECT * FROM persona";

			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {

				int id = result.getInt("id");
				String cedula = result.getString("cedula");
				String nombre = result.getString("nombre");
				String apellido = result.getString("apellido");
				int edad = result.getInt("edad");
				int id_ciudad = result.getInt("id_ciudad");

				Persona persona = new Persona();

				persona.setId(id);
				persona.setCedula(cedula);
				persona.setApellido(apellido);
				persona.setNombre(nombre);
				persona.setEdad(edad);
				persona.setId_ciudad(id_ciudad);

				lista.add(persona);

			}
			result.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}

	@Override
	public Persona listarPorApellido(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(Persona persona) {
		try {

			String sql = "INSERT INTO persona(cedula,nombre,apellido,edad,id_ciudad) VALUES(?,?,?,?,?)";
			PreparedStatement statement = Conexion.conectar().prepareStatement(sql);
			statement.setString(1, persona.getCedula());
			statement.setString(2, persona.getNombre());
			statement.setString(3, persona.getApellido());
			statement.setInt(4, persona.getEdad());
			statement.setInt(5, persona.getId_ciudad());
			

			statement.execute();
			
			statement.close();

		} catch (Exception e) {

		}

	}

	@Override
	public void editar(Persona persona) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(int id) {

		try {

			String sql = "delete from persona where id = ?";
			PreparedStatement statement = Conexion.conectar().prepareStatement(sql);
			statement.setInt(1, id);

			statement.execute();
			
			statement.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
