package com.example.apizuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@Ena
@EnableDiscoveryClient
public class ApiZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiZuulApplication.class, args);
	}

}
