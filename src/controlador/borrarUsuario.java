package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Usuario;
import Modelo.UsuarioModelo;


public class borrarUsuario extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
		UsuarioModelo usuarioModelo = new UsuarioModelo();
		usuarioModelo.deleteUsuario(usuario);
		
		request.getSession().removeAttribute("usuario");
		
		response.sendRedirect("www/index.jsp?mensaje=eliminado");
		
	}

}
