package dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.Conexion;
import dao.ICiudadDAO;
import model.Ciudad;
import model.Departamento;

public class CiudadDAOImpl implements ICiudadDAO {

	@Override
	public List<Ciudad> listarTodos() {

		List<Ciudad> listaCiudad = new ArrayList<>();

		try {
		
		String sql = "SELECT * FROM ciudad";
		PreparedStatement statement = Conexion.conectar().prepareStatement(sql);
		
		ResultSet result = statement.executeQuery();
		
		while(result.next()) {
			int id = result.getInt("id");
			String descripcion = result.getString("descripcion");
			int id_departamento = result.getInt("id_departamento");
			
			Ciudad ciudad = new Ciudad();
			
			ciudad.setId(id);
			ciudad.setDescripcion(descripcion);
			ciudad.setId_departamento(id_departamento);
			
			listaCiudad.add(ciudad);
		}
		

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaCiudad;
	}

}
