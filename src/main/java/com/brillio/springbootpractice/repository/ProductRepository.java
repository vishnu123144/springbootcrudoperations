package com.brillio.springbootpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brillio.springbootpractice.model.Product;

@Repository //create the bean store it in IOC container
public interface ProductRepository extends JpaRepository<Product,Long> {

	//data related operations
	
}
