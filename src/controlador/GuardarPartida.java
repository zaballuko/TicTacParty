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
		
		int idUsuario= 7; 
		jugador.setCod(idUsuario);
		
		Partida partida = new Partida();
		
		partida.setGanador(resultado);
		partida.setJugador(jugador);
		partida.setNivel(null);
		
		partidaModelo.insert(partida);

		PrintWriter out = response.getWriter();
		out.println("resultado: " + resultado);

//		
		
		
	}
	
	
}