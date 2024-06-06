package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Stock;
import com.example.service.StockService;

@RestController
@CrossOrigin("*")
@RequestMapping("/stock")
public class StockController {
	@Autowired
	StockService ss;
	@GetMapping("/read")
	public List<Stock> read()
	{
		return ss.read();
	}
	@GetMapping("/readOne/{idd}")
	public Stock readOne(@PathVariable int idd)
	{
		return ss.readOne(idd);
	}
	//add
	@PostMapping("/add")
	public void add(@RequestBody Stock stNew)
	{
		ss.add(stNew);
	}
	//update
	@PutMapping("/update/{id}")
	public Stock update(@PathVariable int id,@RequestBody Stock stockNew)
	{
		return ss.update(id, stockNew);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		ss.delete(id);
	}
}