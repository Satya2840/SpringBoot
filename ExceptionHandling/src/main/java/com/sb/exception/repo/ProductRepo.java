package com.sb.exception.repo;

import org.springframework.data.repository.CrudRepository;

import com.sb.exception.entity.Products;

public interface ProductRepo extends CrudRepository<Products, Integer>{
	
	

}
