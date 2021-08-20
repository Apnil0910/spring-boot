package com.app.spring.boot.jenkins.springbootexample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.app.spring.boot.jenkins.springbootexample.controller.SpringController;

@SpringBootTest
class SpringBootExampleApplicationTests {

	@Test
	public void testGetStringConstant() {
		SpringController obj  = new SpringController();
		String str = obj.getStringConstant();
		assertNotNull(str);
	}

}
