import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public InsertData() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Id = request.getParameter("id");
		String name = request.getParameter("name");
		String department = request.getParameter("department");
		String password = request.getParameter("password");
		int id = Integer.parseInt(Id);
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=Tpg@1234");
			String str = "insert into employee(id,name,department,password) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(str);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, department);
			ps.setString(4, password);
			
			int count = ps.executeUpdate();
			if(count!=0){
				System.out.println("data inserted successfully");
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
