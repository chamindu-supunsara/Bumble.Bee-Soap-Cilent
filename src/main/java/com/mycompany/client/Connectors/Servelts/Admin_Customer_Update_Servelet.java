/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.client.Connectors.Servelts;

import com.mycompany.client.Connectors.AdminConnector;
import com.mycompany.client.Connectors.CustomerConnector;
import com.mycompany.client.Customers;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author A V I A N
 */
@WebServlet(name = "Admin_Customer_Update_Servelet", urlPatterns = {"/Admin_Customer_Update_Servelet"})
public class Admin_Customer_Update_Servelet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String ID = request.getParameter("id");
        String Name = request.getParameter("name");
        String Email = request.getParameter("email");
        String Password = request.getParameter("password");

        CustomerConnector service=new CustomerConnector();
        
        Customers customer = new Customers();
        
         customer.setId(ID);
         customer.setName(Name);
         customer.setEmail(Email);
         customer.setPassword(Password);
          
        
      
        service.update(customer);
        response.sendRedirect("admin.jsp");
    }
}
