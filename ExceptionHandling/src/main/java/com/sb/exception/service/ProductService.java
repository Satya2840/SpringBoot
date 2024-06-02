package com.sb.exception.service;

import java.util.Optional;

import com.sb.exception.entity.Products;

public interface ProductService {
	
	public Optional<Products> getProductById(Integer id);

}
