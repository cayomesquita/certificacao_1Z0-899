package br.com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import br.com.example.model.*;

public class ListenerTester extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("test context attribute set by listener<br>");
		out.println("new line <br>");
		Dog dog = (Dog) getServletContext().getAttribute("dog");
		out.println("Dog's breed is: " + dog.getBreed());
		out.println("<br>");
		out.println("<br>");
		out.println("test finished");
	}

}
