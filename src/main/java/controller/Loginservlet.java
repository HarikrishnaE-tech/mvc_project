package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Usermanagement_impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {

	private static final String String = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String passwords=request.getParameter("passwords");
		
		Usermanagement_impl ump=new Usermanagement_impl();
	try {
		source.User fetch=ump.fetchuser( email,  passwords);
		if(fetch!=null) {
		   List<source.User> l= ump.getalluser();   
		   System.out.println(l);
		   request.setAttribute("userlist", l);
		   // when gettina alarge amount of data stire it in the list
		        request.getRequestDispatcher("Display.jsp").include(request, response);
		        
		}
		else {
			request.setAttribute("message", "invalid login ");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	}

	
}
