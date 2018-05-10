package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.Usuario;
import Modelo.UsuarioModelo;

public class CreateAcc extends HttpServlet{
	UsuarioModelo usuarioModelo = new UsuarioModelo();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//Recoge os parametros
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		int edad = Integer.parseInt(request.getParameter("edad"));
		String email = request.getParameter("email");
		String contrasena = request.getParameter("contrasena");
		int telefono = Integer.parseInt(request.getParameter("telefono"));
		//Crear usuario con los parametros del formulario
		Usuario usuario = new Usuario(email,contrasena,nombre,apellidos,edad,"user",telefono);
		
		if (nombre != "" && apellidos != "" && email != "" && contrasena != "") {
			//Insertar el usuario en la BBDD
			usuarioModelo.insertUsuario(usuario);
			response.sendRedirect("www/index.html");
		} else {
			//Devolver error (Sin hacer)
			 
		}
	}
}
