package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired UserRepo repo;

	@RequestMapping("/")
	public String home()
	{
		System.out.println(" home page");
		return "index";
		
	}
	
	@PostMapping("/save")
	public String insert(User user)
	
	{
		try {
		repo.save(user);
		return "inserted successfully";
		}
		catch(Exception e){
			return e.toString();
		}
		
	}
	
	@GetMapping("/getdata")
	public List<User> getData(){
		return (List<User>) repo.findAll();
	}
	
		
		
}
