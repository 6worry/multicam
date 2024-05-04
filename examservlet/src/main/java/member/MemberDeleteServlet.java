package member;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class MemberDeleteServlet extends HttpServlet {
	MemberDAO dao = new MemberDAOImpl();
	int result = 0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		String id = request.getParameter("id");
		
		PrintWriter out = response.getWriter();
		
		try {
			MemberDTO dto = new MemberDTO(id);
			result = dao.delete(id);
			
			response.sendRedirect("/list.do");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}