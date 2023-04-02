
package com.mycompany.service.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AdminsService", targetNamespace = "http://Services.service.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdminsService {


    /**
     * 
     * @param id
     * @return
     *     returns com.mycompany.service.services.SalesDetails
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSales", targetNamespace = "http://Services.service.mycompany.com/", className = "com.mycompany.service.services.GetSales")
    @ResponseWrapper(localName = "getSalesResponse", targetNamespace = "http://Services.service.mycompany.com/", className = "com.mycompany.service.services.GetSalesResponse")
    @Action(input = "http://Services.service.mycompany.com/AdminsService/getSalesRequest", output = "http://Services.service.mycompany.com/AdminsService/getSalesResponse")
    public SalesDetails getSales(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param password
     * @param id
     * @return
     *     returns com.mycompany.service.services.Admin
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginAdmin", targetNamespace = "http://Services.service.mycompany.com/", className = "com.mycompany.service.services.LoginAdmin")
    @ResponseWrapper(localName = "loginAdminResponse", targetNamespace = "http://Services.service.mycompany.com/", className = "com.mycompany.service.services.LoginAdminResponse")
    @Action(input = "http://Services.service.mycompany.com/AdminsService/loginAdminRequest", output = "http://Services.service.mycompany.com/AdminsService/loginAdminResponse")
    public Admin loginAdmin(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteCustomer", targetNamespace = "http://Services.service.mycompany.com/", className = "com.mycompany.service.services.DeleteCustomer")
    @ResponseWrapper(localName = "deleteCustomerResponse", targetNamespace = "http://Services.service.mycompany.com/", className = "com.mycompany.service.services.DeleteCustomerResponse")
    @Action(input = "http://Services.service.mycompany.com/AdminsService/deleteCustomerRequest", output = "http://Services.service.mycompany.com/AdminsService/deleteCustomerResponse")
    public boolean deleteCustomer(
        @WebParam(name = "id", targetNamespace = "")
        String id);

}
