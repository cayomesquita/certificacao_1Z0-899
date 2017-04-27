package br.com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import br.com.example.model.*;

public class TesteParam extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		Enumeration parameters = getServletConfig().getInitParameterNames();	
		
		request.setAttribute("parametersName", parameters);
		
		RequestDispatcher view = request.getRequestDispatcher("resultTesteParam.jsp");
		view.forward(request, response);
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		doPost(request, response);
	}
}
