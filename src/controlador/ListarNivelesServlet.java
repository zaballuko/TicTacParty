package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.Nivel;
import Modelo.NivelModelo;

public class ListarNivelesServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		NivelModelo nivelModelo = new NivelModelo();
		ArrayList<Nivel> listaNiveles = nivelModelo.selectAll();
		if (listaNiveles != null){		
			//Crear y mandar atributo listaNiveles a panelControl.jsp
			request.setAttribute("listaNiveles", listaNiveles);
			RequestDispatcher dispatcher = request.getRequestDispatcher("www/jsp/listaNiveles.jsp");
			dispatcher.forward(request,response);
		} else {
		}
	}
}
