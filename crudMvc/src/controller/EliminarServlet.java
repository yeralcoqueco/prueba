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

@WebServlet("eliminar")
public class EliminarServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		
		IPersonaDAO dao = new PersonaDAOImpl();
		dao.eliminar(id);
		
		RequestDispatcher dispatcer = req.getRequestDispatcher("confirmacion.jsp");
		
		dispatcer.forward(req, resp);
		
	}
	
	
	

}
