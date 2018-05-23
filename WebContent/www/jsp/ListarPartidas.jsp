<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.css">

<script type="text/javascript" charset="utf8"
	src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.js"></script>

<script>
	$(document).ready(function() {

		$('#table_id').DataTable();
	});

	$(document).ready(function() {
		$(".popupimage").click(function(event) {
			event.preventDefault();
			$(".modal img").attr('src', $(this).attr('href'));
			$(".modal").modal("show");
		});
	});
	$(document).ready(function() {
		$("#notification").click(function() {
			$("body").css({
				"background-color" : "#2c3e50",
				"color" : "white"
			});
		});
	});
</script>



<style>
a:hover {
	color: green;
	text-decoration: none;
	font-weight: bold;
}

a {
	text-decoration: none;
}

#eliminar:hover {
	color: red;
}

#eliminar {
	color: orange;
}

#editar {
	color: violet;
}

#editar:hover {
	color: purple;
}

#container {
	margin-left: 10px;
	margin-right: 50px;
}

#insertar {
	margin-left: 10px;
}

.toggle-ios {
	margin-top: 30px;
	margin-left: 50%;
}

.toggle-ios input {
	display: none;
}

.toggle-ios label {
	cursor: pointer;
	position: relative;
	display: block;
	width: 45px;
	height: 25px;
	border-radius: 15px;
	background-color: #bdc3c7;
}

.toggle-ios label:before {
	position: absolute;
	left: 3px;
	right: auto;
	top: 3px;
	content: "";
	width: 19px;
	height: 19px;
	border-radius: 100%;
	background-color: #fff;
}

.toggle-ios input[type=checkbox]:checked+label {
	background-color: #2ecc71;
}

.toggle-ios input[type=checkbox]:checked+label:before {
	left: auto;
	right: 3px;
}

#logout:hover {
	color: #fff;
	background-color: #ff3333;
	border-color: #ff3333;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>listar Partidas</title>
</head>
<body>
<table>
	<c:forEach items="${listaPartidas}" var="partida">
		<tr>
			<td>${partida.jugador.nombre}</td>
		</tr>
	</c:forEach>
</table>
</body>

</html>