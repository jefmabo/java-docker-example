package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/helloworld")
public class HelloWorldController {

	@GetMapping
	public ResponseEntity<?> getHelloWorld() {
		
		var response = new Object() {
			public final String message = "Hello World!";
		};
		
		return ResponseEntity.ok(response);
	}
}
