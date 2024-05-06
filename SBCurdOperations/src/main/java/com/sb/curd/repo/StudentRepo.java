package com.sb.curd.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sb.curd.entiry.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

	@Query(value="Select * from Student where sno=:id",nativeQuery=true)
	public Student getStudentDetailsById(Integer id);
}
