
package com.mycompany.client;

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
@WebService(name = "CustomerService", targetNamespace = "http://Services.service.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomerService {


    /**
     * 
     * @param customers
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "update", targetNamespace = "http://Services.service.mycompany.com/", className = "com.mycompany.client.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://Services.service.mycompany.com/", className = "com.mycompany.client.UpdateResponse")
    @Action(input = "http://Services.service.mycompany.com/CustomerService/updateRequest", output = "http://Services.service.mycompany.com/CustomerService/updateResponse")
    public boolean update(
        @WebParam(name = "customers", targetNamespace = "")
        Customers customers);

    /**
     * 
     * @param customer
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registerCustomer", targetNamespace = "http://Services.service.mycompany.com/", className = "com.mycompany.client.RegisterCustomer")
    @ResponseWrapper(localName = "registerCustomerResponse", targetNamespace = "http://Services.service.mycompany.com/", className = "com.mycompany.client.RegisterCustomerResponse")
    @Action(input = "http://Services.service.mycompany.com/CustomerService/registerCustomerRequest", output = "http://Services.service.mycompany.com/CustomerService/registerCustomerResponse")
    public boolean registerCustomer(
        @WebParam(name = "customer", targetNamespace = "")
        Customers customer);

    /**
     * 
     * @param password
     * @param id
     * @return
     *     returns com.mycompany.client.Customers
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginCustomer", targetNamespace = "http://Services.service.mycompany.com/", className = "com.mycompany.client.LoginCustomer")
    @ResponseWrapper(localName = "loginCustomerResponse", targetNamespace = "http://Services.service.mycompany.com/", className = "com.mycompany.client.LoginCustomerResponse")
    @Action(input = "http://Services.service.mycompany.com/CustomerService/loginCustomerRequest", output = "http://Services.service.mycompany.com/CustomerService/loginCustomerResponse")
    public Customers loginCustomer(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "password", targetNamespace = "")
        String password);

}
