/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.repository;

import com.belajar.service.UserProfile;
import com.belajar.service.UserProfileService;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author israjhaliri
 */
public class UserProfileRepository {
    
    public UserProfile getUserProfile() throws Exception{
        URL url = new URL("http://localhost:9999/ws/user_profile?wsdl");

        QName qname = new QName("http://service.belajar.com/", "UserProfileServiceImplService");

        Service service = Service.create(url, qname);
        UserProfileService param = service.getPort(UserProfileService.class);
        return param.getUserProfile();
    }
    
    public UserProfile setUserProfile(String id, String username, String email, String address) throws Exception{
        URL url = new URL("http://localhost:9999/ws/user_profile?wsdl");

        QName qname = new QName("http://service.belajar.com/", "UserProfileServiceImplService");

        Service service = Service.create(url, qname);
        UserProfileService param = service.getPort(UserProfileService.class);
        return param.setUserProfile(id, username, email, address);
    }
}
