package com.sb.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sb.app.dto.Bill;
import com.sb.app.dto.GeneratedBill;
import com.sb.app.entity.Products;

@Service
public interface ProductService {
	
	public Bill getProducts(Integer productId,Integer noOfTimes);

	public List<Products> getAllProducts();
	
	public GeneratedBill generateBill(Integer noOfTimes);

	public Products getProductsByName(String name);

	public Products getProductsByPrice(Integer price);

	public Products getProductsByProductNameAndPrice(String name, Integer price);

	public List<Products> getProductsByProductNameOrPrice(String name, Integer price);

	public List<Products> getProductsByPriceGreaterthan(Integer price);

	public List<Products> getProductsByPriceLessthan(Integer price);



}
