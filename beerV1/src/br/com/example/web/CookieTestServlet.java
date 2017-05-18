package br.com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CookieTestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		Cookie[] cookies = request.getCookies();
		if (cookies != null && cookies.length > 0) {
			out.println("We have cookies:");
			for (int i = 0; i < cookies.length ; i++) {
				out.println(String.format("Name = %s; Value = %s", cookies[i].getName(), cookies[i].getValue()));
			}	
		} else {
			Cookie cookie = new Cookie("cookieTest", "Myfirstcookie");
			response.addCookie(cookie);
			out.println("No cookies.");
		}	
	}

}
