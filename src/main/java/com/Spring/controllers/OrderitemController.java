package com.Spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.services.OrderitemService;

@RestController
@RequestMapping("orderitem")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OrderitemController {

	@Autowired
	OrderitemService orderitemserv;
	
	
}
