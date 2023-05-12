package com.webservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloWorldController {

	// localhost:8080
	@GetMapping(path = "/hello")
	public String hello() {
		return "Helloooooojkgjkkhghoo";
	}

	@GetMapping(path = "/hello/world")
	public HelloBean helloBean() {
		return new HelloBean("helloooooooooooo");
	}

	@GetMapping(path = "/hello-world/path-variable/{name}")
	public String helloWorldPathVariable(@PathVariable String name) {
		return "Hello there, " + name;
	}
}
