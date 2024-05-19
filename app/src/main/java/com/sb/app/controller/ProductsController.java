package com.sb.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sb.app.dto.Bill;
import com.sb.app.dto.GeneratedBill;
import com.sb.app.entity.Products;
import com.sb.app.service.ProductService;

@RestController
public class ProductsController {

	@Autowired
	private ProductService service;

	@GetMapping("/productById")
	public Bill getProductsById(@RequestParam Integer productId, @RequestParam Integer noOfTimes) {
		return service.getProducts(productId,noOfTimes);
	}
	
	@GetMapping("/getProducts")
	public List<Products> getAllProducts() {
		
		return service.getAllProducts();
		
	}
	
	@GetMapping("/generateBill")
	public GeneratedBill getBill(@RequestParam Integer noOfTimes) {
		
		return service.generateBill(noOfTimes);
		
	}
	
	@GetMapping("/getByName")
	public Products getByProductName(@RequestParam String name) {
		return service.getProductsByName(name);
		
	}
	
	@GetMapping("/getByPrice")
	public Products getByPrice(@RequestParam Integer price) {
		return service.getProductsByPrice(price);
	}
	
	@GetMapping("/getByNameAndPrice")
	public Products getProductsByProductNameAndPrice(@RequestParam String name, @RequestParam Integer price) {
		return service.getProductsByProductNameAndPrice(name,price);
	}
	
	@GetMapping("/getByNameOrPrice")
	public List<Products> getProductsByProductNameOrPrice(@RequestParam String name, @RequestParam Integer price) {
		return service.getProductsByProductNameOrPrice(name,price);
	}
	
	@GetMapping("/getProductsByPriceGreaterthan")
	public List<Products> getProductsByPriceGreaterthan(@RequestParam Integer price) {
		return service.getProductsByPriceGreaterthan(price);
	}
	
	@GetMapping("/getProductsByPriceLessthan")
	public List<Products> getProductsByPriceLessthan(@RequestParam Integer price) {
		return service.getProductsByPriceLessthan(price);
	}
}

