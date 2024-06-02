package com.microservice.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.order.entity.Orders;
import com.microservice.order.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	
	@PostMapping("/placeOrder")
	public String placeOrder(@RequestBody Orders order) {
		return service.orderService(order);
	}

}
