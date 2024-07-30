package com.Spring.controllers;

import java.io.IOException;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Spring.models.Category;
import com.Spring.models.Product;
import com.Spring.models.orderTransactionDetails;
import com.Spring.services.ProductService;
import com.Spring.services.orderServices;

@RestController
@RequestMapping("product")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductController 
{
	
	@Autowired
	ProductService prdtserv;
	
	
	@Autowired
	private orderServices orderservices;
	
	
	@GetMapping("listprdt")
	@CrossOrigin(origins="http:/localhost:4200/")
	public ResponseEntity<List<Product>> getAllProducts()
	{		
		return ResponseEntity.ok(prdtserv.prdtList());
	}
	
	
	
	@PostMapping("addprdt")
	@CrossOrigin(origins="http:/localhost:4200/")
	public String add(@RequestPart("data") Product pt,@RequestPart("pic")  MultipartFile pic)	
	{		
		try {				
			pt.setPic(pic.getBytes());					
		} 
		catch (IOException e) {			
			e.printStackTrace();
		}
		
		prdtserv.addProduct(pt);
		
		
		return "Record is added !";
		
	}
	
	@DeleteMapping("delprdt/{id}")
	@CrossOrigin(origins="http:/localhost:4200/")
	public Boolean deleteById(@PathVariable("id")int id)
	{
		return prdtserv.deleteById(id);
	}
	
	
	@PutMapping("updateprdt")
	@CrossOrigin(origins="http:/localhost:4200/")
	public Product updateproduct(@RequestBody Product p)
	{	
		return prdtserv.updateProduct(p);
	}
	
	


}
