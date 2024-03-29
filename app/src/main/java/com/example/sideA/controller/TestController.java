package com.example.sideA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sideA.service.TestService;

@RequestMapping("/api")
@RestController
public class TestController {
	
	@Autowired
	private TestService testService;

    @GetMapping("/hello")
    public String Hello () {

        return "<h1>hello World !!!</h1>";
    }
    
    @GetMapping("/DbTest")
    public String DbTest () {

    	String test = "";

    	try {
			test = testService.getTestDb();

			System.out.println("!!!!"+test+"!!!!");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	return test;
    }
}
