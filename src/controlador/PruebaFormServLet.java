package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PruebaFormServLet
 */
@WebServlet("/PruebaFormServLet") //no hace falta editar el xml
public class PruebaFormServLet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PruebaFormServLet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(request.getParameter("provincia"));
		// recive los parametros que le des en el select del html "name"
		out.println(request.getParameter("deacuerdo"));
		// recive el parametro de "name" y si no se envia nada manda un valor null y si se envia on
		String deacuerdo = request.getParameter("deacuerdo");
		if(deacuerdo == null){
			out.println("no estoy de acuerdo");		
		}else{
			out.println("Estoy de acuerdo");	
		}
		
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
