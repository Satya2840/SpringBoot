package com.microservice.payment.service;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.payment.dto.Product;
import com.microservice.payment.entity.TransactionDetails;
import com.microservice.payment.repo.PaymentRepo;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	private PaymentRepo repo;
	
	@Autowired
	private RestTemplate template;
	
	public String url="http://localhost:8080/getByProductId?id=";
	
	
	@Override
	public TransactionDetails saveDetails(TransactionDetails details) {
		// TODO Auto-generated method stub
		
		details.setTranactionDate(Instant.now().toString());
		return repo.save(details);
	}

	@Override
	public TransactionDetails getById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
	
	@Override
	public Product getProducts(Integer id) {
		System.out.println(url+id);
		 return template.getForObject(url+id, Product.class);
	}
	

}
