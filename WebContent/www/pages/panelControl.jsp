<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="Modelo.Usuario"%>
<%@page import="Modelo.Nivel"%>
<%@page import="java.util.ArrayList" %>
<%Usuario usuario = (Usuario)request.getAttribute("usuario");%>
<%Boolean iniciado = (Boolean)request.getSession().getAttribute("iniciado");%>
<%ArrayList<Nivel> listaNiveles = (ArrayList<Nivel>)request.getAttribute("listaNiveles");%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
   	 	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
   	 	<meta name="description" content="">
    	<meta name="author" content="">

    	<title>Panel de control</title>

    	<!-- Bootstrap Core CSS -->
    	<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    	<!-- Custom Fonts -->
    	<link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">
    	<link href="vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet">

    	<!-- Custom CSS -->
    	<link href="css/stylish-portfolio.min.css" rel="stylesheet">
	</head>
	<body id="page-top"> 
	<header class="masthead4">
		<%
		%>
		<div class="container text-center my-auto">
			<h1>Panel de control</p>
			<a class="btn btn-primary btn-xl js-scroll-trigger" href="tic-tac-toe-game/juegoTicTacToe.html">Jugar 3 en raya</a>
        	<a class="btn btn-primary btn-xl js-scroll-trigger" href="www/jsp/logout.jsp">Logout</a>
		</div>
	</header>
	</body>
</html>