/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.controller;

import com.belajar.repository.UserProfileRepository;
import com.belajar.service.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author israjhaliri
 */
@RestController
@RequestMapping("api")
public class UserProfileController {
    
    @Autowired UserProfileRepository profileRepository;
    
    @RequestMapping(value = "get_user_profile", method = RequestMethod.GET)
    public UserProfile  GetUserProfile() throws Exception{
        return profileRepository.getUserProfile();
    }
    
    @RequestMapping(value = "set_user_profile", method = RequestMethod.POST)
    public UserProfile  GetUserProfile(
      @RequestParam(value = "id") String id,
      @RequestParam(value = "username") String username,
      @RequestParam(value = "email") String email,
      @RequestParam(value = "address") String address
    ) throws Exception{
        return profileRepository.setUserProfile(id,username,email,address);
    }
}
