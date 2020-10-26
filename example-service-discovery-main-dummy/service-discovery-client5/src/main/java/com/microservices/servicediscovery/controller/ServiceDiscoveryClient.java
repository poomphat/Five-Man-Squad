package com.microservices.servicediscovery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.microservices.servicediscovery.bean.Book;

@Component
public class ServiceDiscoveryClient {

	@Autowired
	private DiscoveryClient discoveryClient;

    public Book getBook(String bookId) {
        RestTemplate restTemplate = new RestTemplate();
        List<ServiceInstance> instances = discoveryClient.getInstances("Bookservice");

        if (instances.size()==0) return null;
        String serviceUri = String.format("%s/v1/Book/%s",instances.get(0).getUri().toString(), bookId);
    
        ResponseEntity< Book > restExchange =
                restTemplate.exchange(
                        serviceUri,
                        HttpMethod.GET,
                        null, Book.class, bookId);

        return restExchange.getBody();
    }
}
