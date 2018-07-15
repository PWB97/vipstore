package com.groupsix.vipstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupsix.vipstore.dao.ProductMapper;
import com.groupsix.vipstore.pojo.Product;
import com.groupsix.vipstore.service.ProductService;


@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public void addProduct(Product newProduct) {
		
		productMapper.addProduct(newProduct);

	}

	@Override
	public void delProduct(int productId) {

		productMapper.delProduct(productId);
		
	}

	@Override
	public void updeateProduct(Product newProduct) {

		productMapper.updateProduct(newProduct);
	}

	@Override
	public List<Product> findAllProduct() {

		return productMapper.findAllProduct();
	}

	@Override
	public Product findProduct(int productId) {
		
		return productMapper.findProductById(productId);
	}

	@Override
	public List<Product> findProductByType(String Type) {
		
		return productMapper.findProductByType(Type);
	}

}
