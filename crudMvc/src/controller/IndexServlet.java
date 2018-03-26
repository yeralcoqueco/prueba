package controller;


import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ICiudadDAO;
import dao.IDepartamentoDAO;
import dao.IPersonaDAO;
import dao.impl.CiudadDAOImpl;
import dao.impl.DepartamentoDAOImpl;
import dao.impl.PersonaDAOImpl;
import model.Ciudad;
import model.Departamento;
import model.Persona;

@WebServlet("index")
public class IndexServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		IPersonaDAO dao = new PersonaDAOImpl();
		IDepartamentoDAO daoDpto = new DepartamentoDAOImpl();
		ICiudadDAO daoCiudad = new CiudadDAOImpl();
		
		List<Persona> lista = dao.listarTodos();
		List<Departamento> listaDpto = daoDpto.listarTodos();
		List<Ciudad> listaCiudad = daoCiudad.listarTodos();
		
		
		RequestDispatcher dispatcer = req.getRequestDispatcher("index.jsp");
		req.setAttribute("lista", lista);
		req.setAttribute("listaDpto", listaDpto);
		req.setAttribute("listaCiudad", listaCiudad);
		
		dispatcer.forward(req, resp);
	}
	
	
	
	

}
