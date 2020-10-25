package com.microservices.servicediscovery.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.servicediscovery.bean.Book;

@RestController
public class BookService {
	
	@Autowired
	private ServiceDiscoveryClient serviceDiscoveryClient;

	@RequestMapping("/v1/Book/bookReport")
	public List<Book> getStudentReport() {
		List<String> lookups = Arrays.asList("001", "002", "003");
		List<Book> l = new ArrayList<Book>();
		lookups.forEach(obj -> {
			l.add(serviceDiscoveryClient.getBook(obj));
		});
		return l;
	}
}
