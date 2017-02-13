/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author israjhaliri
 */
@Controller
public class PageController {
     @RequestMapping("dashboard")
    public ModelAndView Home(ModelAndView modelAndView){
        modelAndView.setViewName("dashboard");
        return modelAndView;
    }
}
