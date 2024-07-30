package com.Spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.models.Order_status;
import com.Spring.repositories.Order_status_Repository;
@Service
public class OrderStatusService 
{
	@Autowired
	Order_status_Repository orderstatrepo;
	
	public List<Order_status> prdtList()
	{
		return orderstatrepo.findAll();
	}
		
	public Order_status addProduct(Order_status ct)
	{
		return orderstatrepo.saveAndFlush(ct);
	}
	
	public Order_status updateProduct(Order_status ct)
	{
		return orderstatrepo.saveAndFlush(ct);
	}
	
}
