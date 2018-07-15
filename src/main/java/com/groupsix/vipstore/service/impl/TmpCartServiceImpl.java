/**
 * PWB
 */
package com.groupsix.vipstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupsix.vipstore.dao.ProductMapper;
import com.groupsix.vipstore.dao.TmpCartMapper;
import com.groupsix.vipstore.pojo.TmpCart;
import com.groupsix.vipstore.service.TmpCartService;

@Service("tmpCartService")
public class TmpCartServiceImpl implements TmpCartService {
	
	@Autowired
	private TmpCartMapper tmpCarMapper;
	
	@Autowired
	private ProductMapper productMapper;

	@Override
	public List<TmpCart> selectTmpCartByUserId(Integer userId) {
		List<TmpCart> tmpCarts = tmpCarMapper.selectTmpCartByUserId(userId);
		for (TmpCart tmpCart : tmpCarts) {
			tmpCart.setProduct(productMapper.findProductById(tmpCart.getProductId()));
		}
		return tmpCarts;
	}

	@Override
	public boolean addProductInCart(Integer userId, Integer productId, Integer quantity) {
		
		if (tmpCarMapper.addProductInCart(userId, productId, quantity) != 0) return true;
		else return false;
	}

	@Override
	public boolean setProductNumberInCart(Integer userId, Integer productId, Integer quantity) {
		
		if (tmpCarMapper.setProductNumberInCart(userId, productId, quantity) != 0) return true;
		else return false;
	}

	@Override
	public boolean deleteProductInCart(Integer userId, Integer productId) {
	
		if (tmpCarMapper.deleteProductInCart(userId, productId) != 0) return true;
		else return false;
	}

}
