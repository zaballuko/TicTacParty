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

public class GuardarPartida extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String ganada = request.getParameter("ganada");
		int ganadaInt = Integer.parseInt(ganada);
		
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		PartidaModelo partidaModelo = new PartidaModelo();
		
		Partida partida = new Partida();
		partida.setGanador(ganadaInt);
		partida.setCod(cod);
		
		
		
		partidaModelo.insert(partida);
		//out.print(numPartidas);
		
		//guardar partidas en la BBDD
		
	
		
		
		
	}
	
	
}