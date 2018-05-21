package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Modelo.Partida;
import Modelo.PartidaModelo;
import Modelo.Usuario;
import Modelo.UsuarioModelo;

public class GuardarPartida extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//Para que funcione el acceso a los datos	
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("text/html");

		//recoge el parametro resultadoPartidal de JavaScript y lo pasa a tipo int
		
		String resultadoString = request.getParameter("resultadoPartida");
		int resultado = Integer.parseInt(resultadoString);

		
		//Codigo del usuario con sesion iniciada durante esa partida
		
		//con session de jsp a servlet
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		Usuario jugador = (Usuario)session.getAttribute("usuario");
		
				//		Usuario jugador = new Usuario();
				//		int idjugador= 7;
				//		idjugador = jugador.getCod();
		
		//Creamos una nueva Partida y le damos los datos que ha recogido el servlet
		Partida partida = new Partida();
		partida.setGanador(resultado);
		partida.setJugador(jugador);
		partida.setNivel(null);
		
		//Insertamos la nueva partida en la BBDD
		PartidaModelo partidaModelo = new PartidaModelo();
		partidaModelo.insert(partida);
		
		//Sacamos por pantalla para verificar el resultado
		
		if (resultado == 1) {
			out.println("Has Ganado y se ha guardado a la base de datos");
		}else if(resultado == 0){
			out.println("Has perdido y se ha guardado a la base de datos");			
		}else{
			out.println("Has empatado y se ha guardado a la base de datos");
		}

	}
	
	
}