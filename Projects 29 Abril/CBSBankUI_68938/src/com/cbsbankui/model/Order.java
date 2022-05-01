package com.cbsbankui.model;

import java.time.LocalDate;


public class Order {

	private Long id;
	private String orderDetails;
	private LocalDate expectedDateOffFulfillment;
	private double amount;
	private Vendor vendor;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}
	public LocalDate getExpectedDateOffFulfillment() {
		return expectedDateOffFulfillment;
	}
	public void setExpectedDateOffFulfillment(LocalDate expectedDateOffFulfillment) {
		this.expectedDateOffFulfillment = expectedDateOffFulfillment;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
	
}
