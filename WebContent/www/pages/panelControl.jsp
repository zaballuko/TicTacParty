<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="Modelo.Usuario"%>
<%@page import="Modelo.Nivel"%>
<%@page import="java.util.ArrayList"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="../css/estiloControl.css">
<title>Panel de control</title>


</head>
<body id="page-top">
	<header class="masthead4"> <nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">TicTacParty</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="/TicTacParty/ListarJuegoServLet">Ver lista
					juegos</a></li>
			<li><a href="/TicTacParty/ListarNivelesServlet">Ver lista
					niveles</a></li>
			<li><a href="/TicTacParty/ListarPartidasServlet">ListarPartidas</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a id="sessionScope"><span
					class="glyphicon glyphicon-user"></span>
					${sessionScope.usuario.nombre}</a></li>
			<li><a href="/TicTacParty/BorrarUsuario">delete</a></li>
			<a class="btn btn-danger navbar-btn" href="../jsp/logout.jsp">logout</a>
		</ul>
	</div>
	</nav>
	<div class="container text-center my-auto">
		<h1>Panel de control</h1>

	</div>
	</header>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>