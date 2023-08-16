package com.example.School.subctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class subctrl1 {


	@RequestMapping("/Savestd")
	public ModelAndView index1() {
		
		ModelAndView m1= new ModelAndView("Savestd");	
		return m1;
	
	}
	

	@RequestMapping("/fetch1")
	public ModelAndView index2() {
		
		ModelAndView m1= new ModelAndView("fetch1");	
		return m1;
	
	}
	

	@RequestMapping("/deletebyId")
	public ModelAndView index3() {
		
		ModelAndView m1= new ModelAndView("deletebyId");	
		return m1;
	
	}
	
	

	
	@RequestMapping("/updatebyid1")
	public ModelAndView index5() {
		
		ModelAndView m1= new ModelAndView("updatebyid1");	
		return m1;
	
	}
	
	
}

	