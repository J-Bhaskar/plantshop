package com.Spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.models.Cart;
import com.Spring.repositories.CartRepository;
@Service
public class CartService {
	
	@Autowired
	CartRepository cartrepo;
	
	public List<Cart> prdtList()
	{
		return cartrepo.findAll();
	}
	
	public Cart findById(int pid)
	{
		return cartrepo.findById(pid).get();		
	}
	
	public boolean deleteById(int pid)
	{
		cartrepo.deleteById(pid);
		 return true;
	}
	
	public Cart addProduct(Cart ct)
	{
		return cartrepo.saveAndFlush(ct);
	}
	
	public Cart updateProduct(Cart ct)
	{
		return cartrepo.saveAndFlush(ct);
	}

}
