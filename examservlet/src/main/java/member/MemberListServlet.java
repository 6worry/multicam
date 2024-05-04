package member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet (name ="deptlist", urlPatterns = {"/examservlet/emp/list.do"})
public class MemberListServlet extends HttpServlet {
	MemberDAO dao = new MemberDAOImpl();
	int result = 0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		
		PrintWriter out = response.getWriter();
		
		try {
			List<MemberDTO> list = dao.select();
			
			out.println("<table border='1px solid' style='border-color: red'>");
	        out.println("<tr>");
	        out.println("<th>ID</th>");
	        out.println("<th>Password</th>");
	        out.println("<th>Name</th>");
	        out.println("<th>Address</th>");
	        out.println("<th>RegDate</th>");
	        out.println("<th>Point</th>");
	        out.println("<th>Info</th>");
	        out.println("<th>삭제</th>");
	        out.println("</tr>");
	        
	        for (MemberDTO user : list) {
	            out.println("<tr>");
	            out.println("<td><a href ='/examservlet/emp/list.do/id?id=" + user.getId() +"'</a>" + user.getId() + "</td>");
	            out.println("<td>" + user.getPass() + "</td>");
	            out.println("<td>" + user.getName() + "</td>");
	            out.println("<td>" + user.getAddr() + "</td>");
	            out.println("<td>" + user.getRegDate() + "</td>");
	            out.println("<td>" + user.getPoint() + "</td>");
	            out.println("<td>" + user.getInfo() + "</td>");
	            out.println("<td><a href ='/examservlet/emp/delete?id=" + user.getId() +"'</a>삭제</td>");
	            out.println("</tr>");
	        }
	        
	        out.println("</table>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}