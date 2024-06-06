package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	List<String> names=new ArrayList();
	public MainController() {
		names.add("Dheeraj");names.add("Naina");names.add("Ajju");
	}
	//read
	//@RequestMapping(value="/read",method=RequestMethod.GET)
	@GetMapping("/read")
	public List<String> read() {
		return names;
	}
	//add
	@PostMapping("/add") 
		public void add() {
			names.add("Sanskar");
		}
	//update
	@PutMapping("/update") 
	public void update() {
		names.add(2,"Lakshya");
	}
	//delete
	@DeleteMapping("/delete") 
	public void delete() {
		names.remove(2);
	}
}

