/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.client.Connectors;

import com.mycompany.client.CustomerService;
import com.mycompany.client.CustomerService_Service;
import com.mycompany.client.Customers;

/**
 *
 * @author A V I A N
 */
public class CustomerConnector {
    
     public boolean registerCustomer(Customers customer){
        CustomerService_Service service=new CustomerService_Service ();
        CustomerService proxy=service.getCustomerServicePort();
        return proxy.registerCustomer(customer);
    
    }
}   
