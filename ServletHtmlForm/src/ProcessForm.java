

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ProcessForm
 */
@WebServlet("/ProcessForm")
public class ProcessForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessForm() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() throws ServletException
    {
        // Do required initialization
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		String firstName = request.getParameter("firstname");
		String laseName = request.getParameter("lastname");
		String area = request.getParameter("textarea");
		String car = request.getParameter("cars");
		request.setAttribute("firstname", firstName);
		request.setAttribute("lastname", laseName);
		request.setAttribute("area", area);
		request.setAttribute("car", car);
		request.getRequestDispatcher("output.jsp").forward(request, response);
	      
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public void destroy() 
	   { 
	     // do nothing. 
	   } 
}
