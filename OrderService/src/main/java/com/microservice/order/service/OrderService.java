package com.microservice.order.service;

import org.springframework.stereotype.Service;

import com.microservice.order.entity.Orders;

@Service
public interface OrderService {
	
	public String orderService(Orders order);

}
