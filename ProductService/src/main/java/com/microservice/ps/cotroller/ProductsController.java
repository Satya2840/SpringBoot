package com.microservice.ps.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.ps.entity.Products;
import com.microservice.ps.service.ProductsService;

@RestController
public class ProductsController {
	
	@Autowired
	private ProductsService service;
	
	@PostMapping("/insertRecord")
	public Products createRecord(@RequestBody Products products) {
		return service.createRecord(products);
	}
	
	@GetMapping("/getByProductId")
	public Products getProductsById(@RequestParam Integer id) {
		return service.getByProductId(id);
	}
	
	
	
	

}
