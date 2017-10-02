package com.inautix;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CartItems")
public class CartItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CartItems() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String action=request.getParameter("action");
		if(action.equals("add")) {
		    addToCart(request);
		   }
		response.sendRedirect("Shops.html");
		  }
		public void addToCart(HttpServletRequest request){
			HttpSession session = request.getSession();
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			String desc=request.getParameter("desc");
			int quantity=Integer.parseInt(request.getParameter("quantity"));
			int unitPrice=Integer.parseInt(request.getParameter("unitPrice"));
			CartController cartController = null;
			   
			  Object objCartController = session.getAttribute("cart");
			 
			  if(objCartController!=null) {
			   cartController =(CartController) objCartController ;
			  } else {
			   cartController = new CartController();
			   session.setAttribute("cart", cartController);
			  }
			   
			  cartController.addCartItem(id, name, desc, quantity, unitPrice);
		}
	}

