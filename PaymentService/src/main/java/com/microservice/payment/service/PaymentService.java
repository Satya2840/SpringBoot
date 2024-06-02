package com.microservice.payment.service;

import org.springframework.stereotype.Service;

import com.microservice.payment.dto.Product;
import com.microservice.payment.entity.TransactionDetails;

@Service
public interface PaymentService {
	
	public TransactionDetails saveDetails(TransactionDetails details);

	public TransactionDetails getById(Integer id);
	
	public Product getProducts(Integer id);

}
