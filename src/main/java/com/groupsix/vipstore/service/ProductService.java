package com.groupsix.vipstore.service;

import java.util.List;

import com.groupsix.vipstore.pojo.Product;

public interface ProductService {
	
	public void addProduct(Product newProduct);
	
	public void delProduct(int productId);
	
	public void updeateProduct(Product newProduct);
	
	public List<Product> findAllProduct();
	
	public Product findProduct(int productId);
	
	public List<Product> findProductByType(String Type);

}
