package com.sb.curd.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.curd.entity.Student;
import com.sb.curd.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo repo;

	public Optional<Student> getStudentDetailsByid(Integer id) {
		// TODO Auto-generated method stub
		return repo.getDetailsById(id);
	}

	public Student addRecord(Student student) {
		return repo.save(student);
		
	}

	public Student updateRecord(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

	public void deleteById(Integer id) {
		repo.deleteById(id);
		
	}
	
	

}
