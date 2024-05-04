package member.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import member.MemberDAO;
import member.MemberDAOImpl;
import member.MemberDTO;

@WebServlet (name ="mvclist", urlPatterns = {"/examservlet/mvc/list"})
public class MemberListServlet extends HttpServlet {
	MemberDAO dao = new MemberDAOImpl();
	int result = 0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		
		PrintWriter out = response.getWriter();
		
		try {
			List<MemberDTO> dto = dao.select();
			request.setAttribute("list", dto);
			
			RequestDispatcher rd = request.getRequestDispatcher("/mvc/member/list.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}