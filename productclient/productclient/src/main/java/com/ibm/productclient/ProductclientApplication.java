package com.ibm.productclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductclientApplication.class, args);
	}

}
