package com.sangee.Home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/controller home")
	public String home() {
	
		String products= restTemplate.getForObject("http://localhost:8082/product page",String.class);	
		return products;
}
}
