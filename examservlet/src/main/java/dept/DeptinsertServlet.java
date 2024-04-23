package dept;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet (name= "deptinsert", urlPatterns = {"/dept/insert.do"})
public class DeptinsertServlet extends HttpServlet {
	DeptDAO dao = new DeptDAOImpl();
	int result = 0;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");

		String deptno = request.getParameter("deptcode");
		String deptname = request.getParameter("deptname");
		String number = request.getParameter("tel");
		String addr = request.getParameter("addr");
		
		PrintWriter out = response.getWriter();
		
		try {
			DeptDTO dto = new DeptDTO(deptno, deptname, number, addr);
			result = dao.insert(dto);
			
			if(result > 0) {				
				out.print("가입완료");
			} else {
				out.print("가입실패 올바른 값을 입력하시오");
			}
			
			response.sendRedirect("/examservlet/dept/list.do");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}