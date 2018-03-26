package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IPersonaDAO;
import dao.impl.PersonaDAOImpl;
import model.Persona;

@WebServlet("insertar")
public class InsertarServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String cedula = req.getParameter("cedula");
		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellido");
		int edad = Integer.parseInt(req.getParameter("edad"));
		int id_ciudad =  Integer.parseInt(req.getParameter("id_ciudad"));
		
		Persona persona = new Persona();
		
		persona.setCedula(cedula);
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		persona.setEdad(edad);
		persona.setId_ciudad(id_ciudad);
		
		IPersonaDAO dao = new PersonaDAOImpl();
		dao.insertar(persona);
		
		RequestDispatcher dispatcer = req.getRequestDispatcher("confirmacion.jsp");
		
		dispatcer.forward(req, resp);
		
		
		
	}

	
	
}
