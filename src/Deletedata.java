import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Deletedata")
public class Deletedata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Deletedata() {
        super();
        
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=Tpg@1234");
			PreparedStatement ps = con.prepareStatement("DELETE FROM employee WHERE name=?");
			ps.setString(1,name);
			int count = ps.executeUpdate();
			if(count!=0){
				System.out.println("data deleted successfully");
			}
			else{
				System.out.println("Failed");
			}
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
