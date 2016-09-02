/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Administrator
 */
@Controller

public class HelloController {
    
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = {"welcome"})
    public String index(ModelMap model){
        model.addAttribute("message","Welcome to Web Application!");
        return "welcome";
    }
}
