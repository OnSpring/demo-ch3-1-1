package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	@RequestMapping
	public String sayHello() {
		return "Hello, world!";
	}

	@RequestMapping("/welcome")
	public String greeting(@RequestParam(value = "to") String name) {
		return "Hello, " + name + "!";
	}
}
