<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<% Class.forName("com.mysql.jdbc.Driver"); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Database</h1>
	<%
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=Tpg@1234");
		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery("select * from employee where id=?");
		
	%>
	
	<TABLE Border="1">
		<TR>
			<TH>Id</TH>
			<TH>Name</TH>
			<TH>Department</TH>
		</TR>
		<% while(rs.next()){ %>
            <TR>
                <TD> <%= rs.getInt(1) %></TD>
                <TD> <%= rs.getString(2) %></TD>
                <TD> <%= rs.getString(3) %></TD>
            </TR>
        <% } %>
	
	</TABLE>

</body>
</html>