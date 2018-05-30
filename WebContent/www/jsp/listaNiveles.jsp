<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList" %> 
<%@page import="Modelo.Nivel"%>   
<!-- para poder utilizar etiquetas de jstl -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Lista de juegos</title>
	<!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">
    <link href="vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/stylish-portfolio.min.css" rel="stylesheet">
</head>
<body>
	<!--  por cada item de esa lista recorre y va sacando  a cada item le pongo el nombre con var" "-->
	<c:forEach items="${listaNiveles}" var="nivel">
															<--! a cada item un atributo -->									
		<a class="btn btn-primary btn-xl js-scroll-trigger" href="tic-tac-toe-game/juegoTicTacToe.html">Jugar ${nivel.nombre}</a><br />
	</c:forEach>

</body>
</html>