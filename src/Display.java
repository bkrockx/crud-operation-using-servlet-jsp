import java.io.*;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Display() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=Tpg@1234");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select id,name,department from users");
			out.println("<table border=1 width=50% height=50%>");
			out.println("<tr><th>Id</th><th>name</th><th>Department</th>");
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String department = rs.getString("department");
				out.println("<tr><td>"+id+"</td><td>"+name+"</td><td>"+department+"</td></tr>");
			}
            out.println("</table>");
            out.println("</body></html>");
            con.close();
    
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
