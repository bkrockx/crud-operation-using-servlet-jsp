import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/editData1")
public class editData1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public editData1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		
		Connection conn = null;
		int id=0;
		String name=null,department=null,password=null;
		
		if(request.getParameter("id")!=null && request.getParameter("id")!=""){
			id = Integer.parseInt(request.getParameter("id"));
			response.sendRedirect("./update.jsp");
		}
	}

}
