package com.Spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.models.Order_item;
import com.Spring.repositories.Order_itemRepository;
@Service
public class OrderitemService 
{
	
	@Autowired
	Order_itemRepository orderitemrepo;
	
	public List<Order_item> prdtList()
	{
		return orderitemrepo.findAll();
	}
	
	public Order_item findById(int pid)
	{
		return orderitemrepo.findById(pid).get();		
	}
	
	public boolean deleteById(int pid)
	{
		orderitemrepo.deleteById(pid);
		 return true;
	}
	
	public Order_item addProduct(Order_item ct)
	{
		return orderitemrepo.saveAndFlush(ct);
	}
	
	public Order_item updateProduct(Order_item ct)
	{
		return orderitemrepo.saveAndFlush(ct);
	}


}
