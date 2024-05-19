package com.sb.app.dto;

import java.util.List;

public class GeneratedBill {
	
	
	private List<Bill> bill;
	private Integer totalSavingOnBill;
	private Integer totalBillCost;
	public List<Bill> getBill() {
		return bill;
	}
	public void setBill(List<Bill> bill) {
		this.bill = bill;
	}
	public Integer getTotalSavingOnBill() {
		return totalSavingOnBill;
	}
	public void setTotalSavingOnBill(Integer totalSavingOnBill) {
		this.totalSavingOnBill = totalSavingOnBill;
	}
	public Integer getTotalBillCost() {
		return totalBillCost;
	}
	public void setTotalBillCost(Integer totalBillCost) {
		this.totalBillCost = totalBillCost;
	}
	

}
