import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Display2")
public class Display2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Display2() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Connection conn = null;
		Statement st;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=Tpg@1234");
		
			ArrayList al=null;
			ArrayList userList =new ArrayList();
			String query = "select id,name,department,password from users order by id";
			
			st = conn.createStatement();
			ResultSet  rs = st.executeQuery(query);
			
			out.println("<table border=1 width=50% height=50%>");
			out.println("<tr><th colspan=6</th></tr>");
			out.println("<tr><td> Id </td><td> Name </td> <td> Department </td><td>password</td> <td>Edit </td> <td> Delete</td></tr> ");

			while(rs.next()){
				
				al  = new ArrayList();
				al.add(rs.getInt(1));
				al.add(rs.getString(2));
				al.add(rs.getString(3));
				al.add(rs.getString(4));
				userList.add(al);
				out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td><A HREF=http://localhost:8080/First/update1.jsp>Edit<br></A></td><td><A HREF=http://localhost:8080/First/delete.jsp>Delete<br></A></td></tr>");
				
				//out.println("<A HREF=http://localhost:8080/First/update1.jsp>Create one more User<br></A>");
				//out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td><a href="http://localhost:8080/First/update1.jsp"</a></td></tr>");
			}
			out.println("</table>");
            out.println("</body></html>");
            
            /*request.setAttribute("userList",userList);
            String nextJSP = "/show.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
            dispatcher.forward(request,response);
			*/
            conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
