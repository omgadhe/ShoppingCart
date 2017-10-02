package com.inautix;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AdminValidate")
public class AdminValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminValidate() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession();  
        String username=(String) session.getAttribute("uname");
        String password=(String) session.getAttribute("pass");
        ProjectDAO pd=new ProjectDAO();
        String sql="Select * from AdminDataBase";
        int flag=0;
        try {
			Statement stmt=pd.database().createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				if((username.equals(rs.getString(1)))&&(password.equals(rs.getString(2)))){
					flag=1;
					break;
				}
			}
			if(flag==1){
				response.sendRedirect("Admin.jsp");
			}
			else{
				out.println("Invalid Username or Password");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
