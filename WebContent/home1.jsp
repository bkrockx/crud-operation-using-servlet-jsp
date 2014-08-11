<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*;" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script language ="javascript">

function editData(id){
	window.location.href="http://localhost:8080/First/editData1?id="+id;
}

function deleteData(id){
	window.location.href="http://localhost:8080/First/deleteData1?id="+id;	
}

   
</script>

</head>
<body>
<br>
<table align="center">
 </table>
<br>

 <table border='1' width='300' cellpadding='1' cellspacing='0'>
    <tr><td colspan=6 align="center"></td></tr>
  <tr>
     <td>Id</td><td>Name</td><td>Department</td><td>Password</td>
	 <td>Edit</td><td>Delete</td>
  </tr>                       
	
	<%
	
	List Li = new ArrayList();
	Iterator  lr;
	
	if(request.getAttribute("userList")!=null && request.getAttribute("userList")!="")
	{
		List userList =  (ArrayList)request.getAttribute("userList");
		Iterator itr = userList.iterator();
		
		while(itr.hasNext())
		{
			
			Li = (ArrayList)itr.next();
			lr = Li.iterator();
			Integer id = (Integer)lr.next();
			String name = (String)lr.next();
			String department = (String)lr.next();
			String password = (String)lr.next();
			
			%>
			<tr>
			<td><%=id%></td>
			<td><%=name%></td>
			<td><%=department%></td>
			<td><%=password%></td>
			<td><input type="button" name="edit" value="edit" onclick="editData(<%=id%>);" ></td>
				<td><input type="button" name="delete" value="Delete" onclick="deleteData(<%=id%>);"></td>
			</tr>
			<%
		}
	}
	%>
	  
  }
  </table>
</body>
</html>