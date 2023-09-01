package com.example.productbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.productbooking.entity.Products;
import com.example.productbooking.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	@GetMapping("/show")
	public List<Products> showinfo()
	{
		return productService.getproducts();
	}
	@PostMapping("/post")
	public List<Products> putinfo(@RequestBody List<Products> products)
	{
		return productService.saveinfo(products);
	}
	@GetMapping("sort/{name}")
    public List<Products> getsortinfo(@PathVariable String name)
    {
   	 return productService.sortinfo(name);

    }
         
        @DeleteMapping("/delete")
        public String delete(Products products)
        {
        	productService.delete(products);
                return "Deleted Successfully";
        }
   @GetMapping("paging/{pageno}/{pagesize}")
	public List<Products> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
	{
		return productService.getbypage(pageno, pagesize);
	}
	@GetMapping("/que")
	public List<Products> displayAllProducts(){
		return productService.showinfo();
	
	}
}