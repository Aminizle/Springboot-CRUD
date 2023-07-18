package com.devameen.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devameen.springbootcrud.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}