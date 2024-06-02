package com.microservice.ps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.ps.entity.Products;
import com.microservice.ps.repo.ProductsRepo;

@Service
public class ProductsServiceImpl implements ProductsService {
	
	@Autowired
	private ProductsRepo repo;

	@Override
	public Products createRecord(Products products) {
		// TODO Auto-generated method stub
		return repo.save(products);
	}

	@Override
	public Products getByProductId(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

}
