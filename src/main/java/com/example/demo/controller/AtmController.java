package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Atmpin;
import com.example.demo.repository.AtmRepo;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin

public class AtmController {
	@Autowired
	private AtmRepo atmRepo;
	
	@GetMapping("/atm")
	public List<Atmpin> getAllusers(){
		return atmRepo.findAll();	
		
		
	}
	@PostMapping("/atm")
	public Atmpin atmpin(@RequestBody Atmpin atmpin){
		return atmRepo.save(atmpin);	

}
	
	
	
	

}
