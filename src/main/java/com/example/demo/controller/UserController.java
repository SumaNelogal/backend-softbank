package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;



@RestController
@RequestMapping("/api/v1/")
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/users")
	public List<User> getAllusers(){
		return userRepo.findAll();	
		
		
	}
	@PostMapping("/register")
	public User register(@RequestBody User user){
		return userRepo.save(user);	
		
		
	}
	
	@PostMapping("/login")
	public Boolean login(@RequestBody User user){
		return userRepo.findByUsername(user.getUsername(), user.getPassword()).size()==1;
		
		
	}
	
	
	
}
