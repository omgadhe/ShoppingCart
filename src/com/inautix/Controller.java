package com.inautix;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String param=request.getParameter("param");
		String username=request.getParameter("");
		String password=request.getParameter("");
		if(param.equals("login")){
			 HttpSession session=request.getSession();  
		        session.setAttribute("uname",username);
		        session.setAttribute("pass", password);
			response.sendRedirect("AdminValidate");
		}
		else{
			HttpSession session=request.getSession();  
	        session.setAttribute("uname",username);
	        session.setAttribute("pass", password);
			response.sendRedirect("UserValidate");
		}
	}

}
