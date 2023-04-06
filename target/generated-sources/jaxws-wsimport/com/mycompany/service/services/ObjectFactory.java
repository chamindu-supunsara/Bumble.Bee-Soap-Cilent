
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

    private final static QName _RegisterCustomerResponse_QNAME = new QName("http://Services.service.mycompany.com/", "registerCustomerResponse");
    private final static QName _RegisterCustomer_QNAME = new QName("http://Services.service.mycompany.com/", "registerCustomer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.service.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterCustomerResponse }
     * 
     */
    public RegisterCustomerResponse createRegisterCustomerResponse() {
        return new RegisterCustomerResponse();
    }

    /**
     * Create an instance of {@link RegisterCustomer }
     * 
     */
    public RegisterCustomer createRegisterCustomer() {
        return new RegisterCustomer();
    }

    /**
     * Create an instance of {@link Checkout }
     * 
     */
    public Checkout createCheckout() {
        return new Checkout();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services.service.mycompany.com/", name = "registerCustomer")
    public JAXBElement<RegisterCustomer> createRegisterCustomer(RegisterCustomer value) {
        return new JAXBElement<RegisterCustomer>(_RegisterCustomer_QNAME, RegisterCustomer.class, null, value);
    }

}
