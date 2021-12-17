package com.brillio.springbootpractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brillio.springbootpractice.model.Product;
import com.brillio.springbootpractice.service.ProductService;

@RestController
//handle the request and make a response
public class ProductController {
   //handle the request and response in json format
	@Autowired
	private ProductService service;
	
	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct()
	{
		return service.getAllProductDetails();
	}
	
	
	@PostMapping("/saveProduct")
	public Product saveProductDetail(@RequestBody Product product)
	{
		Product product2=service.savedProductDetails(product);
		return product2;
	}
	
	@PostMapping("/addProduct")
	public Product addProductFromJsp(@RequestParam("productName") String name,@RequestParam("productDesc") String desc,@RequestParam("price") String price)
	{
		//@RequestParam ->request.getParameter
		Product product=new Product();
		product.setProductName(name);
		product.setProductDesc(desc);
		product.setPrice(price);
		return service.savedProductDetails(product);
	}
	
	@GetMapping("/findProduct/{id}")
	public Object getProductById(@PathVariable("id") Long id)
	{
		Product id2= service.getByProductId(id);
		if(id2!=null)
		{
			return id2;
		}
		return "No Product Found";
	}
	
	@DeleteMapping("/deleteProduct")
	public String deleteProduct(@RequestBody Product product)
	{
		Product byId=service.deleteProductById(product);
		if(byId !=null)
		{
			return "deleted successfully";
		}else
		{
			return "No Product Found";
		}
	}
	
	
	
}
