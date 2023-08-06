package com.example.demo.ProductServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;
import com.example.demo.repo.productrepo;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	private productrepo repo;

	@Override
	public Product createProduct(Product p)
	{
		// TODO Auto-generated method stub
		return repo.save(p);
	}

}
