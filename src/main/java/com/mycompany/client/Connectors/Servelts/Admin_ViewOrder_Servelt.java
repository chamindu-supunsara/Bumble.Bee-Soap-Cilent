/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.client.Connectors.Servelts;

import com.mycompany.client.Connectors.AdminConnector;
import com.mycompany.service.services.Orders;
import com.mycompany.service.services.OrderDetails;
import com.mycompany.service.services.SalesDetails;
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
@WebServlet(name = "Admin_ViewOrder_Servelt", urlPatterns = {"/Admin_ViewOrder_Servelt"})
public class Admin_ViewOrder_Servelt extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          String Id = request.getParameter("id");
          String Name = request.getParameter("name");
          String Address = request.getParameter("address");
          String Price = request.getParameter("price");
          String Loan = request.getParameter("loan");
          String Birthday = request.getParameter("birthday");
          String Plan = request.getParameter("plan");
      
       AdminConnector service = new AdminConnector();
       SalesDetails db = service.getSales(Id);
       Id = db.getId();
       Name = db.getName();
       Address = db.getAddress();
       Price = db.getPrice();
       Loan = db.getLoan();
       Birthday = db.getBirthday();
       Plan = db.getPlan();
       
       
       request.setAttribute("db", db); 
       request.getRequestDispatcher("ViewDetails.jsp").forward(request, response);
    }

}
