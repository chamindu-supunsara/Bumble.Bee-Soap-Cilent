/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.client.Connectors.Servelts;

import com.mycompany.client.Connectors.AdminConnector;
import com.mycompany.service.services.Admin;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author A V I A N
 */
@WebServlet(name = "Admin_login_Servelet", urlPatterns = {"/Admin_login_Servelet"})
public class Admin_login_Servelet extends HttpServlet {

    private String id = null;
    private String password = null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                id = request.getParameter("id");
		password = request.getParameter("password");
		
		if((id != null && !id.isEmpty()) && (password != null && !password.isEmpty())) {
			
			
		AdminConnector adminLogin = new AdminConnector();	
		Admin admin = adminLogin.loginAdmin(id, password);
			
			
		if(admin != null && admin.isIsValide()) {				
		HttpSession session = request.getSession();
				
		RequestDispatcher dispatcher = request.getRequestDispatcher("admin.jsp");
		session.setAttribute("admin", admin);		
		dispatcher.forward(request, response);
						
		} else {
				
		RequestDispatcher dispatcher = request.getRequestDispatcher("Home.jsp");
        	request.setAttribute("errorMessage", "you have given invalid username or password :( ");
		dispatcher.forward(request, response);
                }
        }
    }
}
