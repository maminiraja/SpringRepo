package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Product;

public interface productrepo extends JpaRepository<Product, Integer> {

}
