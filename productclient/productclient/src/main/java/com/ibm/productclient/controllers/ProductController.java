package com.ibm.productclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductController {
@Value("${server.port}")
private String port;

@GetMapping("/products")
public String getProducts() {
	return "Product running on" +port;
	
}

@GetMapping("/info")
public String getInfo() {
	return "Product running on" +port;
}
}
