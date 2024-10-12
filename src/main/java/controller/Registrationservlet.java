package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Usermanagement_impl;
import source.User;

import java.io.IOException;
import java.sql.SQLException;



@WebServlet("/Registrationservlet")
public class Registrationservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usermanagement_impl um=new Usermanagement_impl();
        
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String passwords=request.getParameter("passwords");
		String gender=request.getParameter("gender");
		String state=request.getParameter("state");
		User user=new User(username,email,passwords,gender,state);
		
		try {
		int result=	um.saveuser(user);
		if(result>0) {
			response.sendRedirect("login.jsp");
		}
		else {
			response.sendRedirect("error.jsp");
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
