package com.example.School.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.School.Entity.StudentDetails;
import com.example.School.Repository.StudREpository;

import jakarta.persistence.Id;

@Service
public class StudServiceImpl  {

	@Autowired
 StudREpository studrepo;
	
	@Autowired
StudentDetails studsde1;
	
	
	public void SaveStuds(StudentDetails studsde1) {
	
		System.out.println(studsde1.getStudid());
		System.out.println(studsde1.getStudfname());
		System.out.println(studsde1.getStudlname());
		
		 studrepo.save(studsde1);
		 
	
	}


	public List<StudentDetails> fetching() {
		
	
		return studrepo.findAll();
	}


	public StudentDetails update(Long studid, StudentDetails sdetails) {
		
		
		
		System.out.println(studsde1.getStudid());
		System.out.println(studsde1.getStudfname());
		System.out.println(studsde1.getStudlname());
		
		 studrepo.save(studsde1);
		
		
		
 StudentDetails	stdDB = studrepo.findById(studid).get();	
		
		if(Objects.nonNull(sdetails.getStudfname())&& !"".equalsIgnoreCase(sdetails.getStudfname())) {
			
			
			
			stdDB.setStudfname(sdetails.getStudfname());
			
		}
		
	if(Objects.nonNull(sdetails.getStudlname())&& !"".equalsIgnoreCase(sdetails.getStudlname())) {
			
			
			
			stdDB.setStudlname(sdetails.getStudlname());
			
		}
	
	
		return studrepo.save(stdDB);
	
		
	}


	public void delete(Long studid) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(studsde1.getStudid());
		studrepo.delete(studsde1);
	}

/*
	public void findbyid(Long studid) {
		// TODO Auto-generated method stub
		
		
		System.out.println(studsde1.getStudid());
		System.out.println(studsde1.getStudfname());
		System.out.println(studsde1.getStudlname());
		
		
		
		studrepo.findById(studid).get();
		
	}

*/


	public void findbyid(Long studid, StudentDetails studsde12) {
		// TODO Auto-generated method stub
		System.out.println(studsde1.getStudid());
		System.out.println(studsde1.getStudfname());
		System.out.println(studsde1.getStudlname());
		
		 StudentDetails	stdDB = studrepo.findById(studid).get();	

			if(Objects.nonNull(studsde1.getStudfname())&& !"".equalsIgnoreCase(studsde1.getStudfname())) {
				
				
				
				stdDB.setStudfname(studsde1.getStudfname());
				
			}
			
		if(Objects.nonNull(studsde1.getStudlname())&& !"".equalsIgnoreCase(studsde1.getStudlname())) {
				
				
				
				stdDB.setStudlname(studsde1.getStudlname());
				
			}
		
		
		
		studrepo.findById(studid).get();
	}

}
