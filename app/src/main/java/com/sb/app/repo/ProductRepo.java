package com.sb.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.sb.app.entity.Products;
import java.util.List;


public interface ProductRepo extends CrudRepository<Products, Integer>{

	
	public Products findByProductName(String productName);
	
	public Products findByprice(Integer price);
	
	public Products findByProductNameAndPrice(String productName,Integer price);
	
	public List<Products> findByProductNameOrPrice(String productName,Integer price);
	
	public List<Products> findByPriceGreaterThan(Integer price);
	
	public List<Products> findByPriceLessThan(Integer price);
}
