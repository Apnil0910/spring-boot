package com.app.spring.boot.jenkins.springbootexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	
	@GetMapping
	public String getDetails1() {
		return "Welcome To spring boot integration to Jenkins !!" ;
	}
	
	@GetMapping("/welcome")
	public String getDetails2() {
		return "Welcome To spring boot integration with AWS - CLOUD !!" ;
	}
	
	public String getStringConstant() {
		return "Welcome To spring boot integration to Jenkins - string constant !!" ;
	}
	
	
}
