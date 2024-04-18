package basic;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostForm
 */
@WebServlet(name = "PostFormServlet", urlPatterns = {"/post.do"})
public class PostFormServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		String id = request.getParameter("userId");
		String name = request.getParameter("userName");
		String pw = request.getParameter("password");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String[] item = request.getParameterValues("item");
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1>customer</h1>");
		out.print("<hr />");
		out.print("<h2>아이디: " + id + "</h2>");
		out.print("<h2>성명: " + name + "</h2>");
		out.print("<h2>패스워드: " + pw + "</h2>");
		out.print("<h2>성별: " + gender + "</h2>");
		out.print("<h2>직업: " + job + "</h2>");
		out.print("<h2>좋아하는 항목: ");
		
		for(String items:item) {
			if(!items.equals(item[item.length - 1])) {				
				out.print(items + ", ");
			} else {
				out.print(items);
			}
		}
		
		out.print("</h2>");
	}
}