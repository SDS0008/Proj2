package com.example.School.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.School.Entity.StudentDetails;
import com.example.School.Service.StudServiceImpl;

@RestController
public class Updatebyid {

	
	@Autowired
StudServiceImpl studservice;
	
	@Autowired
 StudentDetails studsde1;
	
	@RequestMapping("/updateByid")
	public StudentDetails update(@RequestParam Long studid,@RequestParam String studfname,@RequestParam String studlname)
	{
		
		studsde1.setStudid(studid);
		studsde1.setStudfname(studfname);
		studsde1.setStudlname(studlname);

		studservice.update(studid, studsde1);
		return 	studsde1;
		
	}

}
