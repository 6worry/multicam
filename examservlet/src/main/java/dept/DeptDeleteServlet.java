package dept;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet (name = "deptdelete", urlPatterns = {"/dept/delete"})
public class DeptDeleteServlet extends HttpServlet {
	DeptDAO dao = new DeptDAOImpl();
	int result = 0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		String id = request.getParameter("deptcode");
		
		PrintWriter out = response.getWriter();
		
		try {
			DeptDTO dto = new DeptDTO(id);
			result = dao.delete(id);
			
			response.sendRedirect("/examservlet/dept/list.do");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}