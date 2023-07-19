package com.devameen.springbootcrud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devameen.springbootcrud.entity.Product;
import com.devameen.springbootcrud.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
       return repository.save(product);
    }
  
    public List<Product> saveProducts(List<Product> products){
       return repository.saveAll(products);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }
   
    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }
    
    public Product getProductByName(String name){
        return repository.findByName(name).orElse(null);
    }
}

// minute 14:02 
// https://www.youtube.com/watch?v=IucFDX3RO9U