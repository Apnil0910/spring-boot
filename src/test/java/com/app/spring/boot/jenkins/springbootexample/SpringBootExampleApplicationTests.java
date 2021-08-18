package com.app.spring.boot.jenkins.springbootexample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class SpringBootExampleApplicationTests {

	@Test
	public void testGetDetails() {
		
		
		String url = "http://localhost:8081/details" ;
		RestTemplate rst = new RestTemplate();
		String str = rst.getForObject(url, String.class);
		assertNotNull(str);
	}

}
