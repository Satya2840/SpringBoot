package com.sb.curd.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sb.curd.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer>{

	default Optional<Student> getDetailsById(Integer id) {
		return findById(id);
	}

	
}
