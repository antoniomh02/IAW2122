package es.iestriana.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Juego;
import es.iestriana.dao.JuegoDAO;
import es.iestriana.dao.JuegoDAOBD;

/**
 * Servlet implementation class ValidarJuego
 */
@MultipartConfig
public class ValidarJuego extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidarJuego() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String company = request.getParameter("company");
		
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String bd = sc.getInitParameter("database");
		String driver = sc.getInitParameter("driver");
		
		Conexion con = new Conexion(usu, pass, bd, driver);
		
		JuegoDAO jDAO = new JuegoDAOBD();
		
		Juego jue = jDAO.comprobarJuego(name, company, con);
		
		// Comprobar la validez del usuario
				if (jue != null) {
					// Poner al usuario en Sesión
					//HttpSession sesion = request.getSession();
					//sesion.setAttribute("Juego", jue);
					response.sendRedirect("jsp/principal.jsp");
				} else {
					response.sendRedirect("index.jsp?mensaje=Name y/o Company Incorrecto");
				}
	}

}
