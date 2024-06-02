package com.microservice.order.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.order.entity.Orders;

@Repository
public interface Orderrepo extends CrudRepository<Orders, Integer>{

}
