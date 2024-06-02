package com.sb.exception.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.exception.customExceptions.ProductNotFoundException;
import com.sb.exception.entity.Products;
import com.sb.exception.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo repo;

	
	@Override
	public Optional<Products> getProductById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Products> products = repo.findById(id);
		if(products.isEmpty()) {
			throw new ProductNotFoundException("product not found", "Id"+id);
		} else {
			return products;
		}

	}

}
