package member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet (name ="deptmember", urlPatterns = {"/examservlet/emp/list.do/id"})
public class MemberListServlet2 extends HttpServlet {
	MemberDAO dao = new MemberDAOImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		String id = request.getParameter("id");
		PrintWriter out = response.getWriter();
		
		MemberDTO dto = dao.select(id);
		try {
	        out.println("<h1>" + dto.getId() + "의 정보</h1>");
	        out.println("<hr />");
	        out.println("<h2>ID: " + dto.getId() + "</h2>");
	        out.println("<h2>Pass: " + dto.getPass() + "</h2>");
	        out.println("<h2>Name: " + dto.getName() + "</h2>");
	        out.println("<h2>Addr: " + dto.getAddr() + "</h2>");
	        out.println("<h2>RedDate: " + dto.getRegDate() + "</h2>");
	        out.println("<h2>Point: " + dto.getPoint() + "</h2>");
	        out.println("<h2>Info: " + dto.getInfo() + "</h2>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}