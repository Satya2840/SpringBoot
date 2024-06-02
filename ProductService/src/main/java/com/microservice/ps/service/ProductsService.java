package com.microservice.ps.service;

import org.springframework.stereotype.Service;

import com.microservice.ps.entity.Products;

@Service
public interface ProductsService {
	
	public Products createRecord(Products products);
	
	public Products getByProductId(Integer id);

}
