

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUpServlet
 */
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding( "UTF-8" );
		String id = request.getParameter("email");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		DBManager dbm = new DBManager();
		
		try {
			dbm.sendQuery("SSAFY_DB", "INSERT INTO member (id, pw, name) VALUES ('" + id + "', '" + pw + "', '" + name + "');");
			response.sendRedirect("WebContent/html/mainPage1.jsp");
		} catch (SQLException e) {
			response.sendRedirect("WebContent/html/error.jsp");
		}
		
	}

}
