package com.sb.curd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.curd.entiry.Student;
import com.sb.curd.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;
	
	
	public Student getStudentDetailsById(Integer id) {
		return repo.getStudentDetailsById(id);
	}
	
	

}
