package com.example.productbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.productbooking.entity.Products;
import com.example.productbooking.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	public List<Products> getproducts() {
		return  productRepository.findAll();
	}

	public List<Products> saveinfo(List<Products> product) {
		return  productRepository.saveAll(product);
	}

	public List<Products> sortinfo(String s)
	{
		return  productRepository.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	
	public List<Products> getbypage(int pgno,int pgsize)
	{
		Page<Products> p= productRepository.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
	
	public List<Products> showinfo(){
		return productRepository.show();
	}

	public void delete(Products products) {
		// TODO Auto-generated method stub
		
	}


}