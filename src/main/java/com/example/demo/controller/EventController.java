package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Events;
import com.example.demo.repository.EventRepo;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin

public class EventController {
	
	
	@Autowired
	private EventRepo eventRepo;
	
	@GetMapping("/events")
	public List<Events> getAllusers(){
		return eventRepo.findAll();	
		
		
	}
	@PostMapping("/events")
	public Events events(@RequestBody Events events){
		return eventRepo.save(events);	

}

}
