package com.microservice.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.order.entity.Orders;
import com.microservice.order.repo.Orderrepo;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private Orderrepo repo;
	
	@Override
	public String orderService(Orders order) {
		// TODO Auto-generated method stub
		repo.save(order);
		return "Your Order is Successful";
		
		
	}

}
