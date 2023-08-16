package com.example.School.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.School.Entity.StudentDetails;
import com.example.School.Service.StudServiceImpl;

@RestController
public class Fetchctrl {

	@Autowired
	StudServiceImpl studservice;
		
		
		@GetMapping("/fetch12")
		public List<StudentDetails> fetching()
		{
			return studservice.fetching();
			
			
		}
	
}
