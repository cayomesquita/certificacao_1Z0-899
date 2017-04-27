<%@ page import="java.util.*" %>
<html>
	<body>
		<h1 align="center">Parametros</h1>
		<p>
		
		<%
			Enumeration it = getServletConfig().getInitParameterNames();
			while(it.hasMoreElements()){
				out.println("<br>Parametros: " + it.nextElement());
			}
		%>
	</body>
</html>
