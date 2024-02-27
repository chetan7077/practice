package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustomerRepository;
import com.dao.ProductRepository;
import com.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepo;
	
	@Override
	public Product addProduct(Product p) {
		
		return productRepo.save(p);
	}

	 public List<Product> getProducts() {
	        return productRepo.findAll();
	    }
	   
}
