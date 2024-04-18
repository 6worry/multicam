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
@WebServlet(name = "calc", urlPatterns = {"/calc.do"})
public class CalcServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String opr = request.getParameter("method");
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1>계산결과</h1>");
		out.print("<hr />");
		out.print("<h2>num1의 " + num1 + "과 ");
		out.print("num2의 " + num2 + "를 연산한 결과는");
		
		if (opr.equals("+")) {
	        out.print((Double.parseDouble(num1) + Double.parseDouble(num2)) + " +값입니다.");
	    } else if (opr.equals("-")) {
	        out.print(Math.round((Double.parseDouble(num1) - Double.parseDouble(num2)) * 1000.0) / 1000.0 + " -값입니다.");
	    } else if (opr.equals("*")) {
	        out.print(Math.round(Double.parseDouble(num1) * Double.parseDouble(num2) * 1000.0) / 1000.0 + " *값입니다.");
	    } else if (opr.equals("/")) {
	    	if(num1.equals("0") || num2.equals("0")) {
	    		out.print("0은 못나눠");
	    	} else {
	    		out.print(Math.round(Double.parseDouble(num1) / Double.parseDouble(num2) * 1000.0) / 1000.0 + " /값입니다.");	    		
	    	}
	    } else {
	        out.print("올바른 값을 입력해주세요.");
	    }
		
//		Calc logic = new Calc();
//		double result = logic.calc(num1, num2, opr);
		
		out.print("</h2>");
	}
}