package com.cbsbankui.controller;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.cbsbankui.model.Vendor;
import com.cbsbankui.utility.CredentialsUtility;

@Controller
public class VendorController {

	private RestTemplate restTemplate = new RestTemplate();
	
	@RequestMapping("/vendor")
	public String showVendor() {
		return "vendor";
	}
	
	@RequestMapping("/add-vendor")
	public String addVendor() {
		return "add-vendor";
	}
	
	@RequestMapping("/process-add-vendor")
	public String processAddVendor(@RequestParam("name") String name, @RequestParam("email") String email,
									@RequestParam("contact") String contact, @RequestParam("address") String address,
									@RequestParam("city") String city, @RequestParam("spec") String spec,
									Model model) {
		Vendor vendor =  new Vendor();
		vendor.setName(name);
		vendor.setEmail(email);
		vendor.setContact(contact);
		vendor.setAddress(address);
		vendor.setCity(city);
		vendor.setSpecs(spec);
		
		restTemplate.postForObject("http://localhost:8088/vendor/add", vendor, Vendor.class);
		model.addAttribute("msg", "Vendor added to the system...");
		
		return "add-vendor";
	}
	
	@RequestMapping("/vendor-list")
	public String showVendorList(Model model) {
		//Call the API to fetch all vendor info
		
		HttpEntity<String> entity = new HttpEntity<>(CredentialsUtility.getHeaders());
		ResponseEntity<List> response = restTemplate.exchange("http://localhost:8088/vendor", HttpMethod.GET, entity, List.class);
		
		List<Vendor> list = response.getBody();
		model.addAttribute("list", list);
		
		return "vendor-list";
	}
}
