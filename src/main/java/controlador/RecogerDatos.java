package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RecogerDatos
 */
@WebServlet("/RecogerDatos")
public class RecogerDatos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecogerDatos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Emviado de parametros
		String nombre = request.getParameter("nombre");
		String apellido1=request.getParameter("apellido1");
		
		
		String apellido2=request.getParameter("apellido2");;
		
		// eviar los 3 paramtros
		
		request.setAttribute("nombre", nombre);
		request.setAttribute("apellido1", apellido1);
		request.setAttribute("apellido2", apellido2);
		
		request.getRequestDispatcher("HolaMundo4.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
