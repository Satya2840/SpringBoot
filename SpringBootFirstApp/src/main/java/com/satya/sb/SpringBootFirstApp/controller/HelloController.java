package com.satya.sb.SpringBootFirstApp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {
	
	
	@GetMapping("/hello")	
	public String hello() {
		return "Hello Controller";
		
	}

}
