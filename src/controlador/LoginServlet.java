package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.Usuario;
import Modelo.UsuarioModelo;


public class LoginServlet extends HttpServlet{
	
	Usuario usuario = new Usuario();
	UsuarioModelo usuarioModelo = new UsuarioModelo();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String email = request.getParameter("email");
		String contrasena = request.getParameter("contrasena");
		usuario = usuarioModelo.selectPorEmailContrasena(email,contrasena);
		if (usuario.getEmail().equals(email) && usuario.getContrasena().equals(contrasena)) {
			request.setAttribute("usuario", email);  
			
			response.sendRedirect("www/pages/prueba.jsp");
		} else {

		}
	}
}
