/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.client.Connectors;

import com.mycompany.client.Customers;
import com.mycompany.service.services.Admin;
import com.mycompany.service.services.AdminsService;
import com.mycompany.service.services.AdminsService_Service;
import com.mycompany.service.services.SalesDetails;

/**
 *
 * @author A V I A N
 */
public class AdminConnector {
    
    public Admin loginAdmin(String id, String password) {
	 AdminsService_Service service = new AdminsService_Service ();
         AdminsService proxy=service.getAdminsServicePort();
        return proxy.loginAdmin(id, password);
    }
    
     public SalesDetails getSales(String id){
     AdminsService_Service service = new AdminsService_Service ();
     AdminsService proxy=service.getAdminsServicePort();
     return proxy.getSales(id);
    }
     
     public boolean deleteVehicle(String id){
     AdminsService_Service service = new AdminsService_Service ();
     AdminsService proxy=service.getAdminsServicePort();
     return proxy.deleteCustomer(id);
    }
   
}
