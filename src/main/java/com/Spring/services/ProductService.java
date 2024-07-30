package com.Spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.models.Product;
import com.Spring.repositories.ProductRepository;

@Service
public class ProductService 
{
	
	@Autowired
	ProductRepository prdtrepo;
	
	public List<Product> prdtList()
	{
		return prdtrepo.findAll();
	}
	
	public Product findById(int pid)
	{
		return prdtrepo.findById(pid).get();		
	}
	
	public boolean deleteById(int pid)
	{
		prdtrepo.deleteById(pid);
		 return true;
	}
	
	public Product addProduct(Product ct)
	{
		return prdtrepo.saveAndFlush(ct);
	}
	
	public Product updateProduct(Product ct)
	{
		return prdtrepo.saveAndFlush(ct);
	}

}
