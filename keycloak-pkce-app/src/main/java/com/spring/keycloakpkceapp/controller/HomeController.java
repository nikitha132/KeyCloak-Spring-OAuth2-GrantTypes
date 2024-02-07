package com.spring.keycloakpkceapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
@CrossOrigin(origins="*")
public class HomeController {

	
	@GetMapping
	public ResponseEntity<String> home() {
		String responseMessage = "Hey! from resource server";
        return ResponseEntity.ok().body(responseMessage);
	}

}
