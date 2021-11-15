package com.example.employee;

import org.bouncycastle.jcajce.util.PrivateKeyAnnotator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NameService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CircuitBreakerFactory circuitBreakerFactory;

    public String callNameService(){

        return circuitBreakerFactory.create("nameServiceBreaker").run(()->restTemplate.getForObject("http://localhost:8081/api/name",String.class),throwable -> fallbackNameService());

//        String name = restTemplate.getForObject("http://localhost:8081/api/name",String.class);
//        return name;
    }

    @Bean
    public String fallbackNameService(){
        return "fallbackNameService";
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
