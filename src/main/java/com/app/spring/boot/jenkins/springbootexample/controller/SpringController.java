package com.app.spring.boot.jenkins.springbootexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	
	@GetMapping("/details")
	public String getDetails() {
		return "Welcome To spring boot integration to Jenkins !!" ;
	}
	
}
