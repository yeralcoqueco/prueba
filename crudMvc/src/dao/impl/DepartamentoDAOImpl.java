package dao.impl;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.Conexion;
import dao.IDepartamentoDAO;
import model.Departamento;

public class DepartamentoDAOImpl implements IDepartamentoDAO {

	@Override
	public List<Departamento> listarTodos() {
		
		List<Departamento> listaDpto =  new ArrayList<>();
		
		try {
			
			Statement statement = Conexion.conectar().createStatement();
			String sql = "SELECT * FROM departamento";
			
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				
				int id = result.getInt("id");
				String descripcion = result.getString("descripcion");
				
				Departamento departamento = new Departamento();
				
				departamento.setId(id);
				departamento.setDescripcion(descripcion);
				
				listaDpto.add(departamento);
			}
			
			result.close();
			statement.close();
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return listaDpto;
	}

}
