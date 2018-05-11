package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Partida;
import Modelo.PartidaModelo;
import Modelo.Usuario;
import Modelo.UsuarioModelo;

public class GuardarPartida extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("text/html");

		//recoge el parametro resultadoPartidal de JavaScript y lo pasa a tipo int
		
		String resultadoString = request.getParameter("resultadoPartida");
		int resultado = Integer.parseInt(resultadoString);
		
		//Para que funcione el acceso a los datos	
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("text/html");
	
		PartidaModelo partidaModelo = new PartidaModelo();
		Usuario jugador = new Usuario();
		
		//Usuario Fijo ToDo	
		int idUsuario= 7; 
		jugador.setCod(idUsuario);
		
		//Creamos una nueva Partida y le damos los datos que ha recogido el servlet
		Partida partida = new Partida();
		partida.setGanador(resultado);
		partida.setJugador(jugador);
		partida.setNivel(null);
		
		//Insertamos la nueva partida en la BBDD
		partidaModelo.insert(partida);
		
		//Sacamos por pantalla para verificar el resultado
		PrintWriter out = response.getWriter();
		out.println("resultado: " + resultado);

	}
	
	
}