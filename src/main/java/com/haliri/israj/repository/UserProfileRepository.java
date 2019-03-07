/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haliri.israj.repository;

import com.haliri.israj.service.UserProfile;
import com.haliri.israj.service.UserProfileService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * @author israjhaliri
 */
public class UserProfileRepository {

    public UserProfile getUserProfile() throws Exception {
        URL url = new URL("http://127.0.0.1:9999/ws/user_profile?wsdl");

        QName qname = new QName("http://service.israj.haliri.com/", "UserProfileServiceImplService");

        Service service = Service.create(url, qname);

        UserProfileService param = service.getPort(UserProfileService.class);

        return param.getUserProfile();
    }

    public UserProfile setUserProfile(String id, String username, String email, String address) throws Exception {
        URL url = new URL("http://127.0.0.1:9999/ws/user_profile?wsdl");

        QName qname = new QName("http://service.israj.haliri.com/", "UserProfileServiceImplService");

        Service service = Service.create(url, qname);

        UserProfileService param = service.getPort(UserProfileService.class);

        return param.setUserProfile(id, username, email, address);
    }
}
