package com.estudo.myfirstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.myfirstproject.entities.Product;
import com.estudo.myfirstproject.repositories.ProductRepository;
import com.estudo.myfirstproject.services.exceptions.EntityNotFoundException;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;

	public Product findById(Long id) {
		return repo.findById(id).orElseThrow(
				() -> new EntityNotFoundException("Id not found: " + id));
	}
}
