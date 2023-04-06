
package com.mycompany.service.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CheckoutService", targetNamespace = "http://Services.service.mycompany.com/", wsdlLocation = "http://localhost:8080/service/CheckoutService?wsdl")
public class CheckoutService_Service
    extends Service
{

    private final static URL CHECKOUTSERVICE_WSDL_LOCATION;
    private final static WebServiceException CHECKOUTSERVICE_EXCEPTION;
    private final static QName CHECKOUTSERVICE_QNAME = new QName("http://Services.service.mycompany.com/", "CheckoutService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/service/CheckoutService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CHECKOUTSERVICE_WSDL_LOCATION = url;
        CHECKOUTSERVICE_EXCEPTION = e;
    }

    public CheckoutService_Service() {
        super(__getWsdlLocation(), CHECKOUTSERVICE_QNAME);
    }

    public CheckoutService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CHECKOUTSERVICE_QNAME, features);
    }

    public CheckoutService_Service(URL wsdlLocation) {
        super(wsdlLocation, CHECKOUTSERVICE_QNAME);
    }

    public CheckoutService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CHECKOUTSERVICE_QNAME, features);
    }

    public CheckoutService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CheckoutService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CheckoutService
     */
    @WebEndpoint(name = "CheckoutServicePort")
    public CheckoutService getCheckoutServicePort() {
        return super.getPort(new QName("http://Services.service.mycompany.com/", "CheckoutServicePort"), CheckoutService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CheckoutService
     */
    @WebEndpoint(name = "CheckoutServicePort")
    public CheckoutService getCheckoutServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Services.service.mycompany.com/", "CheckoutServicePort"), CheckoutService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CHECKOUTSERVICE_EXCEPTION!= null) {
            throw CHECKOUTSERVICE_EXCEPTION;
        }
        return CHECKOUTSERVICE_WSDL_LOCATION;
    }

}