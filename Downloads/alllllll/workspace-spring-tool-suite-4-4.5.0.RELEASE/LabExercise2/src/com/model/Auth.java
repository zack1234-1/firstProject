package com.model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;

/**
 * Servlet implementation class Auth
 */
@WebServlet("/Auth")
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		String role = "";
			

		if (userName.equals("admin") && password.equals("admin")){
			role = "admin"; 
		} else if (userName.equals("user1") && password.equals("user1")) {
			role = "coach";
		} else if (userName.equals("user2") && password.equals("user2")) {
			role = "trainee";
		} else {
			role = "error";
		}
		
		request.setAttribute("userName", userName);
		request.setAttribute("password", password);
		request.setAttribute("role", role);

		
		RequestDispatcher rd = request.getRequestDispatcher("/LoginController"); 
		rd.forward(request, response);
		
	}

}
