package com.example.restdemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restdemo.model.CloudVendor;

@RestController

@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
	
	CloudVendor cloudVendor;
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) {
		return cloudVendor;
//				new CloudVendor("1221","Sky Digital", "Gurgaon", "121-123456");
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud vendor created successfully";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud vendor updated successfully";
	}
	
	
	@DeleteMapping
	public String updateCloudVendorDetails(String vendorId) {
		this.cloudVendor = null;
		return "Cloud vendor deleted successfully";
	}
	
	
}
