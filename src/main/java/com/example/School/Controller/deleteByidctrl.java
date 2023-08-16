package com.example.School.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.School.Entity.StudentDetails;
import com.example.School.Service.StudServiceImpl;

@RestController
public class deleteByidctrl {

	@Autowired
	StudServiceImpl studserv;
	
	@Autowired
	StudentDetails stdetails;
	
	@RequestMapping("/Deletebyid")
	public StudentDetails delete(@RequestParam Long studid)
	{
		
		
		stdetails.setStudid(studid);
		
		studserv.delete(studid);
		
		return stdetails;
		
		
	}
	
	
	
	
}
