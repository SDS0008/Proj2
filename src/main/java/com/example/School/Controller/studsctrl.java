package com.example.School.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.School.Entity.StudentDetails;
import com.example.School.Service.StudServiceImpl;


@RestController
public class studsctrl {

	@Autowired
StudServiceImpl studservice;
	
	@Autowired
 StudentDetails studsde1;
	
	@RequestMapping("/Create")
	public StudentDetails  SaveStuds(@RequestParam Long studid,@RequestParam String studfname,@RequestParam String studlname)
	{
		
		studsde1.setStudid(studid);
		studsde1.setStudfname(studfname);
		studsde1.setStudlname(studlname);

		
		studservice.SaveStuds(studsde1);
		
		return studsde1;
	}
}
