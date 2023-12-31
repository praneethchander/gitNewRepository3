package com.in28minutes.springboot.tutorial.basics.application.configuration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String loginMessage() {
		return "welcome123456";
	}
}