

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * �׻� ����Ǵ� ������.
 * => web.xml���� load-on-startup Ȱ���Ǿ� ����.
 * 
 * �ϴ� �� :
 * - �����ͺ��̽� �ʱ�ȭ
 */

public class InitialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public InitialServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	public void init(ServletConfig config) throws ServletException {
		DBManager dbm = new DBManager();
		
		dbm.createNewDatabase("SSAFY_DB");
		
		try {
			dbm.sendQuery("SSAFY_DB", "CREATE TABLE IF NOT EXISTS member ( id VARCHAR(40) PRIMARY KEY, pw VARCHAR(40), name VARCHAR(40) );");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("WebContent/html/mainPage1.jsp");
	}
	
}
