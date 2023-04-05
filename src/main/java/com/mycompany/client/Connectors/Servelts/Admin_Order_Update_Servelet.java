/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.client.Connectors.Servelts;

import com.mycompany.client.Connectors.OrderConnector;
import com.mycompany.service.services.Orders;
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
@WebServlet(name = "Admin_Order_Update_Servelet", urlPatterns = {"/Admin_Order_Update_Servelet"})
public class Admin_Order_Update_Servelet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String ID = request.getParameter("id");
        String Name = request.getParameter("name");
        String Address = request.getParameter("address");
        String Price = request.getParameter("price");
        String Loan = request.getParameter("loan");
        String Birthday = request.getParameter("birthday");
        String Plan = request.getParameter("plan");

        OrderConnector service = new OrderConnector();
        
        Orders order = new Orders();
        
         order.setOrderId(ID);
         order.setOrderName(Name);
         order.setOrderAddress(Address);
         order.setOrderPrice(Price);
         order.setOrderLoan(Loan);
         order.setOrderBirthday(Birthday);
         order.setOrderPlan(Plan);
         

        service.updateOrders(order);
        response.sendRedirect("admin.jsp");
    }
}
