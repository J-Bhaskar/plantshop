package com.Spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("category")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoryController 
{
	@Autowired
	CategoryService catserv;
	
		
	@GetMapping("catlist")
	@CrossOrigin(origins="http:/localhost:4200/")
	public List<Category> getList()
	{		
		return catserv.catList();
	
	}
	
	
	@PostMapping("addcat")
	@CrossOrigin(origins="http:/localhost:4200/")
	public List<Category> addCategory(@RequestBody Category cg)	
	{		
		catserv.addCategory(cg);
		return catserv.catList();
	}
	
	
	@DeleteMapping("deletecat/{id}")
	@CrossOrigin(origins="http:/localhost:4200/")
	public String deleteCategory(@PathVariable("id") int id)
	{
		catserv.deleteById(id);
		return "Record is deleted !";
	}
	
	
	@GetMapping("findcat/{id}")
	@CrossOrigin(origins="http:/localhost:4200/")
	public Category find(@PathVariable("id") int id)
	{
		return catserv.findById(id);
	}
	
	
	@PutMapping("updatecat")
	@CrossOrigin(origins="http:/localhost:4200/")
	public String updateCategory(@RequestBody Category cg)
	{
		catserv.updateCategory(cg);
		return "Record is updated !";
	}
	
		
}
