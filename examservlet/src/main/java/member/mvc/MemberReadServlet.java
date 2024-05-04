package member.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import member.MemberDAO;
import member.MemberDAOImpl;
import member.MemberDTO;

@WebServlet (name ="mvcread", urlPatterns = {"/examservlet/mvc/read"})
public class MemberReadServlet extends HttpServlet {
	MemberDAO dao = new MemberDAOImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		MemberDTO dto = dao.findById(id);
		request.setAttribute("data", dto);
		
		RequestDispatcher rd = request.getRequestDispatcher("/mvc/member/member_read.jsp");
		rd.include(request, response);
	}
}