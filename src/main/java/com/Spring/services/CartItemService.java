package com.Spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.models.Cart_item;
import com.Spring.repositories.Cart_item_Repository;

@Service
public class CartItemService 
{
	@Autowired
	Cart_item_Repository cartitemrepo;
	
	public List<Cart_item> prdtList()
	{
		return cartitemrepo.findAll();
	}
	
	public Cart_item findById(int pid)
	{
		return cartitemrepo.findById(pid).get();		
	}
	
	public boolean deleteById(int pid)
	{
		cartitemrepo.deleteById(pid);
		 return true;
	}
	
	public Cart_item addProduct(Cart_item ct)
	{
		return cartitemrepo.saveAndFlush(ct);
	}
	
	public Cart_item updateProduct(Cart_item ct)
	{
		return cartitemrepo.saveAndFlush(ct);
	}


}
