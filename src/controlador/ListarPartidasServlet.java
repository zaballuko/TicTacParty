package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Partida;
import Modelo.PartidaModelo;

public class ListarPartidasServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		//conseguir partidas
		PartidaModelo partidaModelo = new PartidaModelo();
		ArrayList<Partida> listaPartidas = partidaModelo.selectAll();
		if(listaPartidas != null){
			//Crear y mandar atributo listaPartidas a panelControl.jsp
			request.setAttribute("listaPartidas", listaPartidas);
			RequestDispatcher dispatcher = request.getRequestDispatcher("www/jsp/listarPartidas.jsp");
			dispatcher.forward(request,response);
		}else{
				
			}
		}
		
		
		//almacenar partidas para vista
		
		
		//abrir vista
		/*PrintWriter out = response.getWriter();
		
		out.println("funciona");*/
	}
