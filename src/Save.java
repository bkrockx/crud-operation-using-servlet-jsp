import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Save")
public class Save extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Save() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String choice = request.getParameter("operation");
		
		if(choice.equalsIgnoreCase("insert")){
			response.sendRedirect("./insert.jsp");
		}
		
		if(choice.equalsIgnoreCase("update")){
			response.sendRedirect("./update.jsp");	
		}
		
		if(choice.equalsIgnoreCase("delete")){
			//response.sendRedirect("./delete.jsp");
			response.sendRedirect("http://localhost:8080/First/Display2");
		}

		if(choice.equalsIgnoreCase("show")){
			response.sendRedirect("http://localhost:8080/First/Display2");
		}
		
		
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
