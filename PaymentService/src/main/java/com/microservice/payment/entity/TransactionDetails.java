package com.microservice.payment.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TransactionDetails {
	
	@Id
	private Integer id;
	
	private String paymentMode;
	
	private String status;
	
	private Integer amount;
	
	private String tranactionDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getTranactionDate() {
		return tranactionDate;
	}

	public void setTranactionDate(String tranactionDate) {
		this.tranactionDate = tranactionDate;
	}
	
	
	
}
