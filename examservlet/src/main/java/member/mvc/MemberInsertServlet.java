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

@WebServlet (name ="mvcinsert", urlPatterns = {"/examservlet/mvc/insert"})
public class MemberInsertServlet extends HttpServlet {
	MemberDAO dao = new MemberDAOImpl();
	int result = 0;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");

		String id = request.getParameter("id");
		String pw = request.getParameter("pass");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String info = request.getParameter("info");
		
		PrintWriter out = response.getWriter();
		
		try {
			MemberDTO dto = new MemberDTO(id, pw, name, addr, info);
			result = dao.insert(dto);
			
			request.setAttribute("insert", result);
			RequestDispatcher rd = request.getRequestDispatcher("/mvc/member/insertresult.jsp");
			rd.forward(request, response);
//			response.sendRedirect("/examservlet/view/member/insertOK.html");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}