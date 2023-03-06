/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.client.Connectors.Servelts;

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
@WebServlet(name = "Customer_Register_Servelt", urlPatterns = {"/Customer_Register_Servelt"})
public class Customer_Register_Servelt extends HttpServlet {

 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        CustomerConnector cus_connector=new CustomerConnector();
        
        String ID = request.getParameter("id");
        String NAME = request.getParameter("name");
        String EMAIL = request.getParameter("email");
        String PASSWORD = request.getParameter("password");
        
        Customers cus = new Customers();
        cus.setCusId(ID);
        cus.setCusName(NAME);
        cus.setCusEmail(EMAIL);
        cus.setPassword(PASSWORD);
        
         try {
            cus_connector.registerCustomer(cus);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("CustomerLogin.jsp");
        
        }
    }

    


