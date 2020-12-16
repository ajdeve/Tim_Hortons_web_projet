package step01.method;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class Servlet01Method extends HttpServlet implements Servlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost*()");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("SMITH") && pw.equals("11")) {
			//forward
			response.sendRedirect("menu.html");
		}else {
			//redirect
			response.sendRedirect("fail");
		}
	
	}

}
