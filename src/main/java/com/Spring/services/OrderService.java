package com.Spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.models.Orders;
import com.Spring.repositories.OrdersRepository;
@Service
public class OrderService 
{
	@Autowired
	OrdersRepository ordersrepo;
	
	public List<Orders> prdtList()
	{
		return ordersrepo.findAll();
	}
	
	public Orders findById(int pid)
	{
		return ordersrepo.findById(pid).get();		
	}
	
	public boolean deleteById(int pid)
	{
		ordersrepo.deleteById(pid);
		 return true;
	}
	
	public Orders addProduct(Orders ct)
	{
		return ordersrepo.saveAndFlush(ct);
	}
	
	public Orders updateProduct(Orders ct)
	{
		return ordersrepo.saveAndFlush(ct);
	}

}
