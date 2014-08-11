<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h1>Enter your choice</h1>
	<form action="Save " method="post">
	
	<br>Select option<select name="operation">
		<option value="insert">INSERT</option>
		<option value = "update">UPDATE</option>
		<option value = "delete">DELETE</option>
		<option value = "Show">SHOW</option>
	</select>
	<br>
	<br><input type = "submit" value = "submit">
	</form>
	</center>
</body>
</html>