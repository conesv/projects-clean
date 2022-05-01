package com.cbs.banking.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_info")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 1000)
	private String orderDetails;
	
	private LocalDate expectedDateOffFulfillment;
	
	private double amount;
	
	@OneToOne
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
