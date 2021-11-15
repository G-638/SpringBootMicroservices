package com.example.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/home")
    public String show(){
        String product = restTemplate.getForObject("http://PRODUCT-MICROSERVICE/product",String.class);
        return product;
    }
}
