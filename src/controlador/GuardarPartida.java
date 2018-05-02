package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Partida;

public class GuardarPartida extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String numPartidas = request.getParameter("numPartidas");
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.print(numPartidas);
		
		//guardar partidas en la BBDD
		
		
		
		
	}
	
	
}
