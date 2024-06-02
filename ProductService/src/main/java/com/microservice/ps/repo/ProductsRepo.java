package com.microservice.ps.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.ps.entity.Products;

@Repository
public interface ProductsRepo extends CrudRepository<Products, Integer>{

}
