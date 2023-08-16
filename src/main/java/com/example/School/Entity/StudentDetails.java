package com.example.School.Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "studs")
public class StudentDetails {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studid;
	
	@Column(name = "studfname",nullable = false)
	private String studfname;
	
	@Column(name = "studlname")
	private String studlname;
	
	
	public long getStudid() {
		return studid;
	}

	public void setStudid(long studid) {
		this.studid = studid;
	}

	public String getStudfname() {
		return studfname;
	}

	public void setStudfname(String studfname) {
		this.studfname = studfname;
	}

	public String getStudlname() {
		return studlname;
	}

	public void setStudlname(String studlname) {
		this.studlname = studlname;
	}

	public StudentDetails(long studid, String studfname, String studlname) {
		super();
		this.studid = studid;
		this.studfname = studfname;
		this.studlname = studlname;
	}

	public StudentDetails() {
		super();
	}

	
	
	
}
