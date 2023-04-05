
package com.mycompany.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.client package. 
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

    private final static QName _LoginCustomer_QNAME = new QName("http://Services.service.mycompany.com/", "loginCustomer");
    private final static QName _RegisterCustomerResponse_QNAME = new QName("http://Services.service.mycompany.com/", "registerCustomerResponse");
    private final static QName _Update_QNAME = new QName("http://Services.service.mycompany.com/", "update");
    private final static QName _UpdateResponse_QNAME = new QName("http://Services.service.mycompany.com/", "updateResponse");
    private final static QName _LoginCustomerResponse_QNAME = new QName("http://Services.service.mycompany.com/", "loginCustomerResponse");
    private final static QName _RegisterCustomer_QNAME = new QName("http://Services.service.mycompany.com/", "registerCustomer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginCustomer }
     * 
     */
    public LoginCustomer createLoginCustomer() {
        return new LoginCustomer();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link RegisterCustomerResponse }
     * 
     */
    public RegisterCustomerResponse createRegisterCustomerResponse() {
        return new RegisterCustomerResponse();
    }

    /**
     * Create an instance of {@link LoginCustomerResponse }
     * 
     */
    public LoginCustomerResponse createLoginCustomerResponse() {
        return new LoginCustomerResponse();
    }

    /**
     * Create an instance of {@link RegisterCustomer }
     * 
     */
    public RegisterCustomer createRegisterCustomer() {
        return new RegisterCustomer();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Customers }
     * 
     */
    public Customers createCustomers() {
        return new Customers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services.service.mycompany.com/", name = "loginCustomer")
    public JAXBElement<LoginCustomer> createLoginCustomer(LoginCustomer value) {
        return new JAXBElement<LoginCustomer>(_LoginCustomer_QNAME, LoginCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services.service.mycompany.com/", name = "registerCustomerResponse")
    public JAXBElement<RegisterCustomerResponse> createRegisterCustomerResponse(RegisterCustomerResponse value) {
        return new JAXBElement<RegisterCustomerResponse>(_RegisterCustomerResponse_QNAME, RegisterCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services.service.mycompany.com/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services.service.mycompany.com/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services.service.mycompany.com/", name = "loginCustomerResponse")
    public JAXBElement<LoginCustomerResponse> createLoginCustomerResponse(LoginCustomerResponse value) {
        return new JAXBElement<LoginCustomerResponse>(_LoginCustomerResponse_QNAME, LoginCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services.service.mycompany.com/", name = "registerCustomer")
    public JAXBElement<RegisterCustomer> createRegisterCustomer(RegisterCustomer value) {
        return new JAXBElement<RegisterCustomer>(_RegisterCustomer_QNAME, RegisterCustomer.class, null, value);
    }

}
