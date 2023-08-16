package com.example.School.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.School.Entity.StudentDetails;

@Repository
public interface StudREpository extends JpaRepository<StudentDetails, Long> {

}
