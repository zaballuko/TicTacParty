<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.PartidaModelo"%>
<%@page import="Modelo.Partida"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
<head>
	<title>Listar Partidas</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">

</head>
<body>
	
	<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
				
				<div class="table100 ver4 m-b-110">
					<div class="table100 ver5 m-b-110">
					<table data-vertable="ver5">
						<thead>
							<tr class="row100 head">
								<th class="column100 column2" data-column="column2">Cod</th>
								<th class="column100 column3" data-column="column3">Jugador</th>
								<th class="column100 column4" data-column="column4">Ganador</th>
								<th class="column100 column5" data-column="column5">Nivel</th>
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
									"<tr class='row100 head'><td class='column100 column1' data-column='column1'>"
									+ partida.getCod()
									+ "</td><td class='column100 column2' data-column='column2'>"
									+ partida.getJugador().getNombre()
									+ "</td><td class='column100 column3' data-column='column3'>"
									+ partida.getGanador()
									+ "</td><td class='column100 column4' data-column='column4'>"
									+ partida.getNivel().getNombre()
									+ "</td></tr>");
								}
							%>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="vendor/select2/select2.min.js"></script>
	<script src="js/main.js"></script>

</body>
</html>