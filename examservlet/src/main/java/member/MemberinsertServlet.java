package member;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberinsertServlet extends HttpServlet {
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
			
			if(result > 0) {				
				out.print("가입완료");
			} else {
				out.print("가입실패 올바른 값을 입력하시오");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}