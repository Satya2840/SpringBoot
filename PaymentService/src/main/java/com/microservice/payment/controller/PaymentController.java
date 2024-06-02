package com.microservice.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.payment.dto.Product;
import com.microservice.payment.entity.TransactionDetails;
import com.microservice.payment.service.PaymentService;
import com.microservice.payment.service.ProductService;

@RestController
public class PaymentController {

	@Autowired
	private PaymentService service;

	@Autowired
	private ProductService pService;

	@PostMapping("/savePaymentDetails")
	public TransactionDetails savePaymentDetails(@RequestBody TransactionDetails details) {
		return service.saveDetails(details);
	}

	@GetMapping("/getById")
	public TransactionDetails getByTransactionId(@RequestParam Integer id) {
		return service.getById(id);
	}

	@GetMapping("/getProduct")
	public Product getProducts() {
		return pService.getProducts();
	}

	@GetMapping("/getProducts")
	public Product getProductsById(@RequestParam Integer id) {
		return service.getProducts(id);

	}

	@PostMapping("/addRecord")
	public Product addProduct(@RequestBody Product products) {

		return pService.addRecord(products);

	}

}
