package com.microservice.payment.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.payment.entity.TransactionDetails;

@Repository
public interface PaymentRepo extends CrudRepository<TransactionDetails, Integer>{

}
