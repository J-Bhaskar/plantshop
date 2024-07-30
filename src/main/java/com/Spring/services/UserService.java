package com.Spring.services;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.models.Product;
import com.Spring.models.Users;
import com.Spring.repositories.UsersRepo;

@Service
public class UserService 
{
	@Autowired
	UsersRepo usr;
	
		
	public Users addUser(Users ct)
	{
		return usr.saveAndFlush(ct);
	}
	public boolean checkuser(Users u)
	{
		Users us = usr.findAll().stream()
		.filter(m->m.getUsername().toLowerCase().equals(u.getUsername().toLowerCase()))
		.collect(Collectors.toList()).get(0);
		
		if(us!=null)
			return true;
		else
			return false;		
	}
}
