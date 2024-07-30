package com.Spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.repositories.CategoryRepository;
import com.Spring.models.Category;

@Service
public class CategoryService 
{
	@Autowired
	CategoryRepository catrepo;
	
	public List<Category> catList()
	{
		return catrepo.findAll();
	}
	
	public Category findById(int catid)
	{
		return catrepo.findById(catid).get();		
	}
	
	public boolean deleteById(int catid)
	{
		 catrepo.deleteById(catid);
		 return true;
	}
	
	public Category addCategory(Category ct)
	{
		return catrepo.saveAndFlush(ct);
	}
	
	public Category updateCategory(Category ct)
	{
		return catrepo.saveAndFlush(ct);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
