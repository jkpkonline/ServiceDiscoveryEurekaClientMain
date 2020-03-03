package com.jk.spring.servicediscoveryservereureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/testHello")
    public String testHello() {
        return "Test: " + restTemplate.getForObject("http://eureka-client/hello", String.class);
    }
}
