package com.sb.curd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sb.curd.entiry.Student;
import com.sb.curd.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	//http://localhost:8080/getById?id=1
	@GetMapping("/getById")
	public Student getDetails(@RequestParam("id") Integer id) {
		return service.getStudentDetailsById(id);
		
	}

}
