package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet (name= "deptlist", urlPatterns = {"/dept/list.do"})
public class DeptListServlet extends HttpServlet {
	DeptDAO dao = new DeptDAOImpl();
	int result = 0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		
		PrintWriter out = response.getWriter();
		
		try {
			List<DeptDTO> list = dao.select();
			
			out.println("<table border='1px solid' style='border-color: red'>");
	        out.println("<tr>");
	        out.println("<th>DeptCode</th>");
	        out.println("<th>DeptName</th>");
	        out.println("<th>Tel</th>");
	        out.println("<th>Addr</th>");
	        out.println("<th>삭제</th>");
	        out.println("</tr>");
	        
	        for (DeptDTO member : list) {
	            out.println("<tr>");
	            out.println("<td>" + member.getDeptCode() + "</td>");
	            out.println("<td>" + member.getDeptName() + "</td>");
	            out.println("<td>" + member.getTel() + "</td>");
	            out.println("<td>" + member.getAddr() + "</td>");
	            out.println("<td><a href ='/examservlet/dept/delete?deptcode=" + member.getDeptCode() + "'</a>삭제</td>");
	            out.println("</tr>");
	        }
	        
	        out.println("</table>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

