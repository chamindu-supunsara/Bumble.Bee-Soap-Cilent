/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.client.Connectors;

import com.mycompany.service.services.Checkout;
import com.mycompany.service.services.CheckoutService;
import com.mycompany.service.services.CheckoutService_Service;

/**
 *
 * @author A V I A N
 */
public class CheckoutConnector {
    
    public boolean registerCustomer(Checkout checkout){
        CheckoutService_Service service=new CheckoutService_Service ();
        CheckoutService proxy=service.getCheckoutServicePort();
        return proxy.registerCustomer(checkout);
    }
}
