package com.idd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/")
	public String test() {
		return "Jenkins Test is completed Successfully...";
	}
	
	@GetMapping("/a")
	public String Hello() {
		return "Hello guys ,How are you...";
	}

}
