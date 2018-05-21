<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="Modelo.Usuario"%>
<%Usuario usuario = (Usuario)session.getAttribute("usuario");%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Tic-Tac-Toe</title>
  
  <style type="text/css">
 #button {
  display: inline-block;
  padding: 15px 25px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #007bff;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

#button:hover {
background-color: white
;
color:#007bff;
}

#button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
  </style>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <link rel="stylesheet" href="css/style.css">

  
</head>

<body>
<a id="button" href="./www/jsp/logout.jsp">Logout</a>
<a id="button" href="../www/pages/panelControl.jsp">Volver</a>

  <div id="wrap">
	<div id="body">
		<div class="game_area">
			<div class="block"></div>
			<div class="block"></div>
			<div class="block"></div>
			<div class="block"></div>
			<div class="block"></div>
			<div class="block"></div>
			<div class="block"></div>
			<div class="block"></div>
			<div id="a" class="block"></div>
			<div id="line0" class="line"></div>
			<div id="line1" class="line"></div>
			<div id="line2" class="line"></div>
			<div id="line3" class="line"></div>
		</div>
	</div>
	<div id="start_screen">
		<div id="select_box">
			<div id="selectO">
				<div class="o"></div>
			</div>
			<div id="selectX">
				<div class="x"></div>
			</div>
			<div class="info_bubble" id="info_1">primero</div>
			<div class="info_bubble" id="info_2">elige uno</div>
		</div>
	</div>
	<div id="end_screen">
		<div id="end_box">
			<div id="end_info"></div>
			<div class="circle"></div>
			<div class="info_bubble" id="btn_restart">otra?</div>
		</div>
	</div>
</div>
    <script  src="js/index.js"></script>
</body>

</html>