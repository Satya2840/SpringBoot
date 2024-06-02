package com.microservice.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.microservice.payment.dto.Product;

@Service
public class ProductService {

	@Autowired
	private RestTemplate template;

	public Product getProducts() {

		//Product products = template.getForObject("http://localhost:8080/getByProductId?id="+1, Product.class);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Product> entity = new HttpEntity<Product>(headers);
		
		ResponseEntity<Product> products = template.exchange("http://localhost:8080/getByProductId?id="+1, HttpMethod.GET, entity, Product.class);
		return products.getBody();
	}

	public Product addRecord(Product products) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Product> entity = new HttpEntity<Product>(products,headers);
		// return template.postForObject("http://localhost:8080/insertRecord", HttpMethod.POST,entity Product.class);
		ResponseEntity<Product> product = template.exchange("http://localhost:8080/insertRecord", HttpMethod.POST,entity, Product.class);
		return product.getBody();
	}
}
