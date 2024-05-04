package member.mvc;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import member.MemberDAO;
import member.MemberDAOImpl;
import member.MemberDTO;

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO dao = new MemberDAOImpl();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pass");
		String save = request.getParameter("member_id_save");
		MemberDTO dto = dao.login(id, pw);
		
		if(save != null) {
			if(save.equals("T") & dto !=null) {
				HttpSession session = request.getSession();
				session.setAttribute("id", dto.getId());
//				Cookie cookie = new Cookie("id", dto.getId());
//				cookie.setMaxAge(60*60);
//				cookie.setPath("/examservlet");
//				response.addCookie(cookie);
				session.setAttribute("data", dto);
			}
		}
		
//		request.setAttribute("data", dto);
		
		RequestDispatcher rd = request.getRequestDispatcher("/view/index.jsp");
		rd.include(request, response);
	}
}