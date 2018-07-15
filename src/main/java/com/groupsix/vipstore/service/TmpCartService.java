/**
 * PWB
 */
package com.groupsix.vipstore.service;

import java.util.List;

import com.groupsix.vipstore.pojo.TmpCart;

public interface TmpCartService {

	/**
	 * PWB
	 * 查找用户的购物车
	 * @param userId
	 * @return 购物车列表
	 */
	public List<TmpCart> selectTmpCartByUserId(Integer userId);
	
	/**
	 * PWB
	 * 添加商品进购物车
	 * @param userId
	 * @param productId
	 * @return
	 */
	public boolean addProductInCart(Integer userId, Integer productId, Integer quantity);
	
	/**
	 * PWB
	 * 设置购物车数量
	 * @param userId
	 * @param productId
	 * @param quantity
	 * @return
	 */
	public boolean setProductNumberInCart(Integer userId, Integer productId, Integer quantity);
	
	/**
	 * PWB
	 * 删除购物车商品
	 * @param userId
	 * @param productId
	 * @return
	 */
	public boolean deleteProductInCart(Integer userId, Integer productId);
}
