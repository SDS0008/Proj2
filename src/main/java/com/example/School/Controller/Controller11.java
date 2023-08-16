package com.example.School.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller11 {

	
	@GetMapping("/")
	public String Savestuds()
	{
		return "hai...";

	}
}
