/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.client.Connectors;

import com.mycompany.service.services.OrderService;
import com.mycompany.service.services.OrderService_Service;
import com.mycompany.service.services.Orders;

/**
 *
 * @author A V I A N
 */
public class OrderConnector {
    
    public boolean orderCustomer(Orders order){
        OrderService_Service service = new OrderService_Service ();
        OrderService proxy = service.getOrderServicePort();
        return proxy.customerOrder(order);
    }
    
    public boolean deleteOrders(String id){
     OrderService_Service service = new OrderService_Service ();
     OrderService proxy = service.getOrderServicePort();
     return proxy.deleteOrder(id);
    }
}
