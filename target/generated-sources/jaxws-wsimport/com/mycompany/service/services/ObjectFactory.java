
package com.mycompany.service.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.service.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginAdmin_QNAME = new QName("http://Services.service.mycompany.com/", "loginAdmin");
    private final static QName _LoginAdminResponse_QNAME = new QName("http://Services.service.mycompany.com/", "loginAdminResponse");
    private final static QName _DeleteCustomer_QNAME = new QName("http://Services.service.mycompany.com/", "deleteCustomer");
    private final static QName _GetSalesResponse_QNAME = new QName("http://Services.service.mycompany.com/", "getSalesResponse");
    private final static QName _GetSales_QNAME = new QName("http://Services.service.mycompany.com/", "getSales");
    private final static QName _DeleteCustomerResponse_QNAME = new QName("http://Services.service.mycompany.com/", "deleteCustomerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.service.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginAdmin }
     * 
     */
    public LoginAdmin createLoginAdmin() {
        return new LoginAdmin();
    }

    /**
     * Create an instance of {@link LoginAdminResponse }
     * 
     */
    public LoginAdminResponse createLoginAdminResponse() {
        return new LoginAdminResponse();
    }

    /**
     * Create an instance of {@link GetSalesResponse }
     * 
     */
    public GetSalesResponse createGetSalesResponse() {
        return new GetSalesResponse();
    }

    /**
     * Create an instance of {@link GetSales }
     * 
     */
    public GetSales createGetSales() {
        return new GetSales();
    }

    /**
     * Create an instance of {@link DeleteCustomer }
     * 
     */
    public DeleteCustomer createDeleteCustomer() {
        return new DeleteCustomer();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link Admin }
     * 
     */
    public Admin createAdmin() {
        return new Admin();
    }

    /**
     * Create an instance of {@link SalesDetails }
     * 
     */
    public SalesDetails createSalesDetails() {
        return new SalesDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services.service.mycompany.com/", name = "loginAdmin")
    public JAXBElement<LoginAdmin> createLoginAdmin(LoginAdmin value) {
        return new JAXBElement<LoginAdmin>(_LoginAdmin_QNAME, LoginAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services.service.mycompany.com/", name = "loginAdminResponse")
    public JAXBElement<LoginAdminResponse> createLoginAdminResponse(LoginAdminResponse value) {
        return new JAXBElement<LoginAdminResponse>(_LoginAdminResponse_QNAME, LoginAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services.service.mycompany.com/", name = "deleteCustomer")
    public JAXBElement<DeleteCustomer> createDeleteCustomer(DeleteCustomer value) {
        return new JAXBElement<DeleteCustomer>(_DeleteCustomer_QNAME, DeleteCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services.service.mycompany.com/", name = "getSalesResponse")
    public JAXBElement<GetSalesResponse> createGetSalesResponse(GetSalesResponse value) {
        return new JAXBElement<GetSalesResponse>(_GetSalesResponse_QNAME, GetSalesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services.service.mycompany.com/", name = "getSales")
    public JAXBElement<GetSales> createGetSales(GetSales value) {
        return new JAXBElement<GetSales>(_GetSales_QNAME, GetSales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services.service.mycompany.com/", name = "deleteCustomerResponse")
    public JAXBElement<DeleteCustomerResponse> createDeleteCustomerResponse(DeleteCustomerResponse value) {
        return new JAXBElement<DeleteCustomerResponse>(_DeleteCustomerResponse_QNAME, DeleteCustomerResponse.class, null, value);
    }

}
