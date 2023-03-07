
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
@WebServiceClient(name = "AdminsService", targetNamespace = "http://Services.service.mycompany.com/", wsdlLocation = "http://localhost:8080/service/AdminsService?wsdl")
public class AdminsService_Service
    extends Service
{

    private final static URL ADMINSSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADMINSSERVICE_EXCEPTION;
    private final static QName ADMINSSERVICE_QNAME = new QName("http://Services.service.mycompany.com/", "AdminsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/service/AdminsService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADMINSSERVICE_WSDL_LOCATION = url;
        ADMINSSERVICE_EXCEPTION = e;
    }

    public AdminsService_Service() {
        super(__getWsdlLocation(), ADMINSSERVICE_QNAME);
    }

    public AdminsService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADMINSSERVICE_QNAME, features);
    }

    public AdminsService_Service(URL wsdlLocation) {
        super(wsdlLocation, ADMINSSERVICE_QNAME);
    }

    public AdminsService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADMINSSERVICE_QNAME, features);
    }

    public AdminsService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdminsService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AdminsService
     */
    @WebEndpoint(name = "AdminsServicePort")
    public AdminsService getAdminsServicePort() {
        return super.getPort(new QName("http://Services.service.mycompany.com/", "AdminsServicePort"), AdminsService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdminsService
     */
    @WebEndpoint(name = "AdminsServicePort")
    public AdminsService getAdminsServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Services.service.mycompany.com/", "AdminsServicePort"), AdminsService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADMINSSERVICE_EXCEPTION!= null) {
            throw ADMINSSERVICE_EXCEPTION;
        }
        return ADMINSSERVICE_WSDL_LOCATION;
    }

}