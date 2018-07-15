package com.groupsix.vipstore.dao;

import java.util.List;

import com.groupsix.vipstore.pojo.Product;

public interface ProductMapper {
	
	public void addProduct(Product newProduct);
	
	public void delProduct(Integer productId);
	
	public void updateProduct(Product newProduct);
	
	public List<Product> findAllProduct();
	
	public Product findProductById(Integer productId);
	
	public List<Product> findProductByType(String type);
}
