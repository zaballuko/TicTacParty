<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="Modelo.Usuario"%>
<%@page import="Modelo.UsuarioModelo"%>
<%
	request.getSession().removeAttribute("iniciado");
	response.sendRedirect("../index.jsp");
%>
