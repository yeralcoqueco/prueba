package dao;

import java.util.List;

import model.Persona;

public interface IPersonaDAO {

	List<Persona> listarTodos();

	Persona listarPorApellido(int id);

	void insertar(Persona persona);

	void editar(Persona persona);

	void eliminar(int id);

}
