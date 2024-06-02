package com.sb.exception.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sb.exception.entity.Products;
import com.sb.exception.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/getById")
	public Optional<Products> getProductById(@RequestParam Integer id) {
		
		return service.getProductById(id);
		
	}

}
