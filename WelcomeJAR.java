package com.sb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeJAR {
	
	@Value("${value}")
    String don;
     
    @GetMapping("/welcome")
    public String getMessage(){
    	 return "Hi "+don;
    }
    
}


