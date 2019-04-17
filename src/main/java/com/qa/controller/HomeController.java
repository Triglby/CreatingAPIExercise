package com.qa.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @RequestMapping("/")
    public String home(){
        return "Weclome to home page";
    }

    @Value("${greetingMessage}$")
    private String greetingMessage;


}
