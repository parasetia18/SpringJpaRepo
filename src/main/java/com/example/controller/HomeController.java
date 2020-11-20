package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserRepo;
import com.example.model.User;

import service.UserService;

@RestController
public class HomeController {
	
	@Autowired UserRepo repo;
	@Autowired UserService serve;

	@RequestMapping("/")
	public String home()
	{
		System.out.println(" home page");
		return "index";
		
	}
	
	@PostMapping("/save")
	public String insert(User user)
	
	{
		return serve.save(user);
		
	}
	
	@GetMapping("/getdata")
	public List<User> getData(){
		return serve.getUser();
	}
	
		
		
}
