package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Modelo.Usuario;
import Modelo.UsuarioModelo;


public class LoginServlet extends HttpServlet{
	
	 
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String email = request.getParameter("email");
		String contrasena = request.getParameter("contrasena");
		
		UsuarioModelo usuarioModelo = new UsuarioModelo();
		Usuario usuario = usuarioModelo.selectPorEmailContrasena(email,contrasena);
		
		if (usuario.getEmail().equals(email) && usuario.getContrasena().equals(contrasena)) {
			
			//Crear variable de sesion
			HttpSession session = request.getSession();
			session.setAttribute("iniciado", true);
			//Crear atributo usuario con el usuario que ha iniciado sesion y enviarsela a la pagina panelControl.jsp
			session.setAttribute("usuario", usuario);
			
//			RequestDispatcher dispatcher = request.getRequestDispatcher("www/pages/panelControl.jsp");
//			dispatcher.forward(request,response);
			response.sendRedirect("www/pages/panelControl.jsp");
		} else {

		}
	}

}
