package com.sb.curd.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sb.curd.entity.Student;
import com.sb.curd.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/getById")
	public Optional<Student> getStudentDetailsById(@RequestParam Integer id) {
		return service.getStudentDetailsByid(id);
		
	}
	
	@PostMapping("/add")
	public Student addRecord(@RequestBody Student student) {
		return service.addRecord(student);
	}
	
	@PutMapping("/update")
	public Student updateRecord(@RequestBody Student student) {
		return service.updateRecord(student);
	}
	
	@DeleteMapping("/deleteById")
	public void deleteRecord(@RequestParam Integer id) {
		service.deleteById(id);
		
	}

}
