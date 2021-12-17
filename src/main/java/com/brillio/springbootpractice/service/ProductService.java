package com.brillio.springbootpractice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brillio.springbootpractice.model.Product;
import com.brillio.springbootpractice.repository.ProductRepository;

@Service
//write business logic
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	//PR(@Repository)  /PS(@Service) ->bean will be created ->Ioc Container
	//@Autowired ->it will take object(bean) from Ioc container -->it will give to ProductService
	public Product savedProductDetails(Product product)
	{
		return repository.save(product); //insert into product values
	}
	
	public List<Product> getAllProductDetails()
	{
		List<Product> findAll=repository.findAll();
		return findAll;
	}
	
	public Product getByProductId(Long id)
	{
		
	    Optional<Product> prod=repository.findById(id); //optional is used to check for null values
		//select * from product where id=?
	    if(prod.isPresent())
		{
			return prod.get();
		}else
		{
			return null;
		}
	}
	
	public Product deleteProductById(Product product)
	{
		Product productDelete=getByProductId(product.getId());
		if(productDelete!=null)
		{
			repository.delete(productDelete);
			
		}
		return product;
	}

}
