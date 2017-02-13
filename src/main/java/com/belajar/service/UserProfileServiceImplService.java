
package com.belajar.service;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UserProfileServiceImplService", targetNamespace = "http://service.belajar.com/", wsdlLocation = "http://localhost:9999/ws/user_profile?wsdl")
public class UserProfileServiceImplService
    extends Service
{

    private final static URL USERPROFILESERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERPROFILESERVICEIMPLSERVICE_EXCEPTION;
    private final static QName USERPROFILESERVICEIMPLSERVICE_QNAME = new QName("http://service.belajar.com/", "UserProfileServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9999/ws/user_profile?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERPROFILESERVICEIMPLSERVICE_WSDL_LOCATION = url;
        USERPROFILESERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public UserProfileServiceImplService() {
        super(__getWsdlLocation(), USERPROFILESERVICEIMPLSERVICE_QNAME);
    }

    public UserProfileServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERPROFILESERVICEIMPLSERVICE_QNAME, features);
    }

    public UserProfileServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, USERPROFILESERVICEIMPLSERVICE_QNAME);
    }

    public UserProfileServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERPROFILESERVICEIMPLSERVICE_QNAME, features);
    }

    public UserProfileServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserProfileServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserProfileService
     */
    @WebEndpoint(name = "UserProfileServiceImplPort")
    public UserProfileService getUserProfileServiceImplPort() {
        return super.getPort(new QName("http://service.belajar.com/", "UserProfileServiceImplPort"), UserProfileService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserProfileService
     */
    @WebEndpoint(name = "UserProfileServiceImplPort")
    public UserProfileService getUserProfileServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.belajar.com/", "UserProfileServiceImplPort"), UserProfileService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERPROFILESERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw USERPROFILESERVICEIMPLSERVICE_EXCEPTION;
        }
        return USERPROFILESERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}