<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.PartidaModelo"%>
<%@page import="Modelo.Partida"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Partidas</title>
</head>
<body>

<h1>Partidas</h1>
<table border=1>

	<thead>
	
		<tr>
		
			<th>Cod</th>
			<th>Jugador</th>
			<th>Ganador</th>
			<th>Nivel</th>
		</tr>
	</thead>
	<tbody>
<%
	PartidaModelo partidaModelo = new PartidaModelo();
	ArrayList<Partida> partidas = partidaModelo.selectAll();
	
	Iterator<Partida> i = partidas.iterator();
	while (i.hasNext()){
		Partida partida = i.next();
		out.print(
		"<tr><td>"
		+ partida.getCod()
		+ "</td><td>"
		+ partida.getJugador().getNombre()
		+ "</td><td>"
		+ partida.getGanador()
		+ "</td><td>"
		+ partida.getNivel().getNombre()
		+ "</td></tr>");
	}
%>
	</tbody>
</table>
<a href="guardar_libro.jsp">Guardar</a>
<a href="libros.html">Atras</a>

</body>
</html>