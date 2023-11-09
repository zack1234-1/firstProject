package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = (String)request.getAttribute("userName");
		String password = (String)request.getAttribute("password");
		String role = (String)request.getAttribute("role");
		
		
		User user = new User();
		user.setUserName (userName);
		user.setPassword (password);
		
		request.setAttribute("user", user);
		
		if (role == "admin") { 
			RequestDispatcher rd = request.getRequestDispatcher("/adminPage.jsp"); 
			rd.forward(request, response);
		}
		else if (role == "coach"){
			RequestDispatcher rd = request.getRequestDispatcher("/coachPage.jsp"); 
			rd.forward(request, response);
		}
		else if (role == "trainee"){
			RequestDispatcher rd = request.getRequestDispatcher("/traineePage.jsp"); 
			rd.forward(request, response);
		}
		else if (role == "error") {
			RequestDispatcher rd = request.getRequestDispatcher("/errorPage.jsp"); 
			rd.forward(request, response);
		}
		
	}

}
