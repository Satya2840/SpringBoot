package com.sb.app.dto;

public class Bill {
	
	private String productName;
	private Integer productCost;
	private Integer productweight;
	private Integer discount;
	private Integer discountOnProduct;
	
	private Integer sellingPrice;
	private Integer noOfItems;
	private Integer totalSavings;
	private Integer totalCost;
	
	
	public Integer getDiscountOnProduct() {
		return discountOnProduct;
	}
	public void setDiscountOnProduct(Integer discountOnProduct) {
		this.discountOnProduct = discountOnProduct;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductCost() {
		return productCost;
	}
	public void setProductCost(Integer productCost) {
		this.productCost = productCost;
	}
	public Integer getProductweight() {
		return productweight;
	}
	public void setProductweight(Integer productweight) {
		this.productweight = productweight;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public Integer getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(Integer sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public Integer getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(Integer noOfItems) {
		this.noOfItems = noOfItems;
	}
	public Integer getTotalSavings() {
		return totalSavings;
	}
	public void setTotalSavings(Integer totalSavings) {
		this.totalSavings = totalSavings;
	}
	public Integer getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Integer totalCost) {
		this.totalCost = totalCost;
	}
	
	
	

}
