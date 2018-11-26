package com.haoli.log.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApi {
	
	@GetMapping("/log/hello")
	public String hello() {
		return "hello world";
	}

}
