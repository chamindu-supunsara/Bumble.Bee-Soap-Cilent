/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.client.Connectors.Servelts;

import com.mycompany.client.Connectors.OrderConnector;
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
@WebServlet(name = "Admin_DeleteOrders_Servelt", urlPatterns = {"/Admin_DeleteOrders_Servelt"})
public class Admin_DeleteOrders_Servelt extends HttpServlet {

    
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String ID = request.getParameter("id");

        OrderConnector service= new OrderConnector();
        service.deleteOrders(ID);
        response.sendRedirect("admin.jsp");
        
        }
    }
