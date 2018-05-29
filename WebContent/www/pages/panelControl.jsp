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
		<a class="btn btn-danger navbar-btn" href="../jsp/logout.jsp">logout</a>
	</ul>
	<ul class="nav navbar-nav navbar-right">
		<li class="dropdown"><a id="sessionScope" class="dropdown-toggle"
			data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span>
				${sessionScope.usuario.nombre}</a>
			<ul class="dropdown-menu">
				<li><a href="modificarUsuario.jsp">Modificar</a></li>
				<li><a href="/TicTacParty/BorrarUsuario">Delete</a></li>
			</ul>
</div>
</nav>
<div class="container text-center my-auto">
	<h1>Panel de control</h1>

</div>
</header>
<body id="page-top">
	<centre>
	<div id="imagen">
		<a href="../../tic-tac-toe-game/juegoTicTacToe.jsp"><img src="../img/game.png"></a>
	</div>
	</centre>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>