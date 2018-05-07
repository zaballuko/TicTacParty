<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="Modelo.Usuario"%>
<%@page import="Modelo.UsuarioModelo"%>
<%
String dni = request.getParameter("dni");
String contrasena = request.getParameter("contrasena");


if (dni != null && contrasena != null){
// 	UsuarioModelo usuarioModelo = new UsuarioModelo();
// 	Usuario usuario = usuarioModelo.selectPorEmailContrasena(email,contrasena);
// 	if(usuario == null){
// 		response.sendRedirect("login_form.jsp");
// 	}else{
// 		session.setAttribute("iniciado", "si");
// 		session.setAttribute("rol", usuario.getRol());
// 		response.sendRedirect("sistema.jsp");
// 	}
}else{
	response.sendRedirect("login_form.jsp");
}

%>