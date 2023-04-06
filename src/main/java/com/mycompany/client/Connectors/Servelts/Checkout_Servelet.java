/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.client.Connectors.Servelts;

import com.mycompany.client.Connectors.CheckoutConnector;
import com.mycompany.service.services.Checkout;
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
@WebServlet(name = "Checkout_Servelet", urlPatterns = {"/Checkout_Servelet"})
public class Checkout_Servelet extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        CheckoutConnector cus_connector = new CheckoutConnector();
        
        String Item = request.getParameter("item");
        String Size = request.getParameter("size");
        String Quantity = request.getParameter("quantity");
        String Price = request.getParameter("price");
        
        Checkout cus = new Checkout();
        cus.setItem(Item);
        cus.setSize(Size);
        cus.setQuantity(Quantity);
        cus.setPrice(Price);
        
         try {
            cus_connector.registerCustomer(cus);
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("Order.jsp");
        
        }
    }

