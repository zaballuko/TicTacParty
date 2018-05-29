package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Nivel;
import Modelo.NivelModelo;
import Modelo.Usuario;
import Modelo.UsuarioModelo;

public class UpdateUsuario extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		UsuarioModelo usuarioModelo = new UsuarioModelo();
		
		//Recoge os parametros
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		int edad = Integer.parseInt(request.getParameter("edad"));
		String email = request.getParameter("email");
		String contrasena = request.getParameter("contrasena");
		int telefono = Integer.parseInt(request.getParameter("telefono"));
		//Crear usuario con los parametros del formulario
		Usuario usuarioNuevo = new Usuario(email,contrasena,nombre,apellidos,edad,telefono);
		
		//Recoge usuario de sesion
		Usuario usuarioSesion = (Usuario) request.getSession().getAttribute("usuario");
		//Hace el update
		usuarioModelo.updateUsuario(usuarioNuevo, usuarioSesion.getCod());
		//Borrar usuario sesion
		request.getSession().removeAttribute("usuario");
		//Redirige al panel de control
		response.sendRedirect("www/index.jsp?mensajeModificar=modificado");
	}
}
