package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Modelo.*;

public class ListarJuegoServLet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		JuegoModelo juegoModelo = new JuegoModelo();
		ArrayList<Juego> listarJuegos = juegoModelo.selectAll();
		if (listarJuegos != null){		
			//Crear y mandar atributo listaNiveles a panelControl.jsp
			
			//le pasa al jsp
			request.setAttribute("listarJuegos", listarJuegos);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("www/jsp/listarJuegos.jsp");
			dispatcher.forward(request,response);
		} else {
		}
	}
}
