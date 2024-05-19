package com.sb.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.app.dto.Bill;
import com.sb.app.dto.GeneratedBill;
import com.sb.app.entity.Products;
import com.sb.app.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo repo;
	
	@Override
	public Bill getProducts(Integer productId, Integer noOfTimes) {
		Products product = repo.findById(productId).get();	
		Bill bill = new Bill();
		bill.setProductName(product.getProductName());
		bill.setProductCost(product.getPrice());
		bill.setProductweight(product.getWeight());
		bill.setDiscount(product.getDiscount());
		bill.setNoOfItems(noOfTimes);
		Integer discountAmount = (product.getDiscount()*product.getPrice())/100;
		Integer sellingPrice = product.getPrice() - discountAmount;
		bill.setSellingPrice(sellingPrice);
		bill.setDiscountOnProduct(discountAmount);
		Integer totalCost = noOfTimes*sellingPrice;
		bill.setTotalCost(totalCost);
		bill.setTotalSavings(noOfTimes*discountAmount);
		return bill;
	}

	@Override
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return (List<Products>) repo.findAll();
	}

	@Override
	public GeneratedBill generateBill(Integer noOfTimes) {
		List<Products> products =  (List<Products>) repo.findAll();
		List<Bill> bills = new ArrayList<>();
		GeneratedBill generatedBill = new GeneratedBill();
		Integer totalBillSaving =0;
		Integer totalBillCost=0;
		for(Products product: products) {
			Bill bill = new Bill();
			bill.setProductName(product.getProductName());
			bill.setProductCost(product.getPrice());
			bill.setProductweight(product.getWeight());
			bill.setDiscount(product.getDiscount());
			bill.setNoOfItems(noOfTimes);
			Integer discountAmount = (product.getDiscount()*product.getPrice())/100;
			Integer sellingPrice = product.getPrice() - discountAmount;
			bill.setSellingPrice(sellingPrice);
			bill.setDiscountOnProduct(discountAmount);
			Integer totalCost = noOfTimes*sellingPrice;
			bill.setTotalCost(totalCost);
			bill.setTotalSavings(noOfTimes*discountAmount);
			bills.add(bill);
			totalBillSaving = totalBillSaving + (noOfTimes*discountAmount);
			totalBillCost = totalBillCost + totalCost;
			generatedBill.setBill(bills);
			generatedBill.setTotalSavingOnBill(totalBillSaving);
			generatedBill.setTotalBillCost(totalBillCost);
			
			
		}
		return generatedBill;
	}

	@Override
	public Products getProductsByName(String name) {
		
		return repo.findByProductName(name);
	}

	@Override
	public Products getProductsByPrice(Integer price) {
		// TODO Auto-generated method stub
		return repo.findByprice(price);
	}

	@Override
	public Products getProductsByProductNameAndPrice(String name, Integer price) {
		// TODO Auto-generated method stub
		return repo.findByProductNameAndPrice(name, price);
	}

	@Override
	public List<Products> getProductsByProductNameOrPrice(String name, Integer price) {
		// TODO Auto-generated method stub
		return repo.findByProductNameOrPrice(name, price);
	}

	@Override
	public List<Products> getProductsByPriceGreaterthan(Integer price) {
		// TODO Auto-generated method stub
		return repo.findByPriceGreaterThan(price);
	}

	@Override
	public List<Products> getProductsByPriceLessthan(Integer price) {
		// TODO Auto-generated method stub
		return repo.findByPriceLessThan(price);
	}


}
