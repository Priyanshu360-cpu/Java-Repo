package com.ibm.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {
@Autowired
private RestTemplate restTemplate;
@GetMapping("/customers")
public String getCustomers() {
	return "Customer service";
}
@GetMapping("/customer-products")
public String getProducts() {
	String response=restTemplate.getForObject("http://PRODUCTCLIENT/products", String.class);
	
	return "Customer Products recieved: "+response;
}

}
