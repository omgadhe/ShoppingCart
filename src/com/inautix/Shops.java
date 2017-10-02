package com.inautix;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Shops")
public class Shops extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Shops() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=(Integer.parseInt(request.getParameter("id")));
		if(id==1){
			response.sendRedirect("/iNautix/WebContent/JSP/Shop1.jsp");
		}
		else if(id==2){
			response.sendRedirect("/iNautix/WebContent/JSP/Shop2.jsp");
		}
		else if(id==3){
			response.sendRedirect("/iNautix/WebContent/JSP/Shop3.jsp");
		}
		else if(id==4){
			response.sendRedirect("/iNautix/WebContent/JSP/Shop4.jsp");
		}
		else if(id==5){
			response.sendRedirect("/iNautix/WebContent/JSP/Shop5.jsp");
		}
		else if(id==6){
			response.sendRedirect("/iNautix/WebContent/JSP/Shop6.jsp");
		}
		else if(id==7){
			response.sendRedirect("/iNautix/WebContent/JSP/Shop7.jsp");
		}
		else if(id==8){
			response.sendRedirect("/iNautix/WebContent/JSP/Shop8.jsp");
		}
		else if(id==9){
			response.sendRedirect("/iNautix/WebContent/JSP/Shop9.jsp");
		}
		else{
			response.sendRedirect("/iNautix/WebContent/JSP/Shop10.jsp");
		}
	}

}
