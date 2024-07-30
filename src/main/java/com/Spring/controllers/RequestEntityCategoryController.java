package com.Spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.models.Category;
import com.Spring.services.CategoryService;

@RestController
@RequestMapping("requestentitycategory")
public class RequestEntityCategoryController 
{
	@Autowired
	CategoryService catserv;
	
		
	@GetMapping("catlist")
	public ResponseEntity<List<Category>> getList()
	{		
		try
		{
			List<Category> L = catserv.catList();
			if (L == null )
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			
			return ResponseEntity.ok(L);			
		}
		catch(Exception e)
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}			
	}
	
	
	
	@GetMapping("findcat/{id}")
	public ResponseEntity<Category> find(@PathVariable("id") int id)
	{
		try
		{
			Category C = catserv.findById(id);
			if (C ==null )
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
			return ResponseEntity.ok(C);			
		}
		catch(Exception e)
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	@DeleteMapping("deletecat/{id}")
	public ResponseEntity<Boolean> deleteCategory(@PathVariable("id") int id)
	{
		try
		{
			Boolean b = catserv.deleteById(id);
			if (!b)
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
			return ResponseEntity.ok(b);			
		}
		catch(Exception e)
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
		
	
	@PostMapping("addcat")
	public ResponseEntity<Category> addCategory(@RequestBody Category cg)	
	{	
		try {
				catserv.addCategory(cg);
				return ResponseEntity.status(HttpStatus.CREATED).body(cg);					
			}
		catch(DataIntegrityViolationException e)
		{
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
		catch(Exception e)
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}			
	}
	
	
	@PutMapping("updatecat")
	public ResponseEntity<Category> updateCategory(@RequestBody Category cg)
	{
		try {
			catserv.updateCategory(cg);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(cg);					
		}
	catch(DataIntegrityViolationException e)
	{
		return ResponseEntity.status(HttpStatus.CONFLICT).build();
	}
	catch(Exception e)
	{
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	}
	
	
}
