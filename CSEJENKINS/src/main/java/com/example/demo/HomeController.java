package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/cserocks")
	public String cse() {
		return "WELCOME TO CSE JENKINS";
	}
}
