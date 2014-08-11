<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String userName = null;
	String sessionId = null;
	String user = null;
	if(session.getAttribute("user")==null){
		response.sendRedirect("login.jsp");
	}
	else{
		user = (String)session.getAttribute("user");
		
		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
			for(Cookie cookie:cookies){
				if(cookie.getName().equals("user")) userName = cookie.getValue();
				if(cookie.getName().equals("JSESSIONID")) sessionId = cookie.getValue();
			}
		}
	}
%>

<h3> <%=userName %>Login Successful</h3>
<br>
<a href="Front.jsp">enter your choice</a>
<form action="LogoutServlet" method="post">
<input type="submit" value="Logout" >
</form>

</body>
</html>