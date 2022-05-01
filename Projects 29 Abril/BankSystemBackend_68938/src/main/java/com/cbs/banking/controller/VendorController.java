package com.cbs.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cbs.banking.model.Vendor;
import com.cbs.banking.repository.VendorRepository;

@RestController
public class VendorController {

		@Autowired
		private VendorRepository vendorRepository;
		
		@PostMapping("/vendor/add")
		public Vendor addVendor(@RequestBody Vendor vendor) {
			return vendorRepository.save(vendor);
		}
		
		@GetMapping("/vendor")
		public List<Vendor> showAllVendors(){
			return vendorRepository.findAll();
		}
}