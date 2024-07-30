package com.Spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.services.EmailService;

@RestController
@RequestMapping("email")
public class EmailController 
{
	@Autowired
	EmailService emserv;
	

	@RequestMapping("/sendmail")
	@CrossOrigin(origins = "*")
	public String checkEmail()
	{
	emserv.sendEmail("bhaskar1017j@gmail.com", "Subject : Test Mail", "Checking Email @ Test Content");
	return "MessageSend";
	}

}


