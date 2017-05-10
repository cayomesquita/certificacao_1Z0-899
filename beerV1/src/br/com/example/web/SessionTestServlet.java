package br.com.example.web;

import javax.servlet.*;    
import javax.servlet.http.*;    
import java.io.*;

public class SessionTestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		if (session.isNew()) {
			out.println("You're wellcome");
			out.println("ID da nova sessão: " + session.getId());
			out.println("Timeout: " + session.getMaxInactiveInterval());
		} else {
			out.println("I'm happy to see you again!");
			out.println("ID da sessão: " + session.getId());
			out.println("Tempo da criação da sessão: " + session.getCreationTime());
			out.println("Tempo da último acesso: " + session.getLastAccessedTime());
		}
	}
}
