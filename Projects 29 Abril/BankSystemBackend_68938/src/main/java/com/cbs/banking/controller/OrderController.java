package com.cbs.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cbs.banking.model.Order;
import com.cbs.banking.model.Vendor;
import com.cbs.banking.repository.OrderRepository;
import com.cbs.banking.repository.VendorRepository;

@RestController
public class OrderController {
	
	@Autowired
	private VendorRepository vendorRepository;

	@Autowired
	private OrderRepository orderRepository;

	@PostMapping("/order/{vid}")
	public Order postOrder(@RequestBody Order order, @PathVariable("vid") Long vid) {
		Vendor vendor = vendorRepository.getById(vid);
		order.setVendor(vendor);
		return orderRepository.save(order);
	}
}
