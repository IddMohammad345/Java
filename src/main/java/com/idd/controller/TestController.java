package com.idd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/")
	public String test() {
		return "tes";
	}
	
	@GetMapping("/hello")
	public String Hello() {
		return "Hello guys ,How are you...";
	}

}
