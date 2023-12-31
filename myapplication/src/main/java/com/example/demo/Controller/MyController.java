package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class MyController 
{
	
	@Autowired
	private ProductService productservice;
	@GetMapping("/")
	public String p()
	{
		return "Raja";
	}
	
	@PostMapping("/save")
	public ResponseEntity<Product> newProduct(@RequestBody Product p)
	{
		Product product = productservice.createProduct(p);
		
		return new ResponseEntity<>(product,HttpStatus.CREATED);
	}
	
	

}
