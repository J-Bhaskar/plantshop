package com.Spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.models.orderTransactionDetails;
import com.Spring.services.CartService;
import com.Spring.services.orderServices;

@RestController
@RequestMapping("cart")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CartController {

	@Autowired
	CartService cartserv;
	
	@Autowired
	private orderServices orderservices;
	
/*****************************  RazorPay EndPoint ********************/
	
	@GetMapping("/getTransaction/{amount}")
	@CrossOrigin(origins = "*")
	public orderTransactionDetails getTransaction(@PathVariable("amount") 
	double amount)
	{
	return orderservices.orderCreateTransaction(amount);
	}
	
	
}
