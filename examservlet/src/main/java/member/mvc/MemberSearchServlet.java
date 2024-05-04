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

@WebServlet (name ="mvcsearch", urlPatterns = {"/examservlet/mvc/search"})
public class MemberSearchServlet extends HttpServlet {
	MemberDAO dao = new MemberDAOImpl();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		String Addr = request.getParameter("search");
		
		List<MemberDTO> dto = dao.search(Addr);
		request.setAttribute("list", dto);
		
		RequestDispatcher rd = request.getRequestDispatcher("/mvc/member/list.jsp");
		rd.include(request, response);
	}
}