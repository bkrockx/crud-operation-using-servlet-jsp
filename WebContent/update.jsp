<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.*;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<%
	
	List Li1 = new ArrayList();
	Iterator  lr1;
	
	if(request.getAttribute("UserList")!=null && request.getAttribute("UserList")!="")
	{
		List UserList =  (ArrayList)request.getAttribute("UserList");
		Iterator itr1 = UserList.iterator();
		
		while(itr1.hasNext())
		{
			
			Li1 = (ArrayList)itr1.next();
			lr1 = Li1.iterator();
			Integer id = (Integer)lr1.next();
			String name = (String)lr1.next();
			String department = (String)lr1.next();
			String password = (String)lr1.next();
			
			%>
				<form action="UpdateData1" method="post">
			
				<br>Id:<input type="text" name = "id" value="<%=id%>">
				<br>
				
				<br>Name:<input type="text" name="name" value = "<%=name%>">
				<br>
				
				<br>department:<input type="text" name="department" value = "<%=department%>">
				<br>
				
				<br>Password:<input type="text" name="password" value = "<%=password%>" >
				<br>
				
				<br><input type = "submit" value = "submit">
				
				</form>
			<% 
			}
			
		}
%>

	</center>

</body>
</html>