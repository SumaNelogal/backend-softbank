package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Transactions;
import com.example.demo.repository.TransactionsRepo;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin
public class TransactionsController {
	
	@Autowired
	private TransactionsRepo transactionsRepo;
	
	@GetMapping("/transactions")
	public List<Transactions> getAllusers(){
		return transactionsRepo.findAll();	
		
		
	}
	@PostMapping("/transactions")
	public Transactions transactions(@RequestBody Transactions transactions){
		return transactionsRepo.save(transactions);	

}
	
	

}
