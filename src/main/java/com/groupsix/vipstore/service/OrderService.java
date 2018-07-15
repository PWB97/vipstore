package com.groupsix.vipstore.service;

import java.util.List;

import com.groupsix.vipstore.pojo.Order;
import com.groupsix.vipstore.pojo.User;

public interface OrderService {

	/**
	 * 查询所有订单信息包括每条订单的每个商品的详情(不含用户信息）
	 * @param userId
	 * @return
	 */
	List<Order> selectOrders(Integer userId);
	
	/**
	 * 查询用户所有订单
	 * @param userId
	 * @return
	 */
	User selectUserOrders(Integer userId);
	
	/**
	 * 查询一条订单信息及其明细（包含用户信息)
	 * @param orderId
	 * @return
	 */
	User selectOrderAndDetail(Integer orderId);
	
	/**
	 * 查询订单表所有订单(只查询订单表)
	 * @return
	 */
	List<Order> selectAllOrders();
	
	/**
	 * 查询所有用户订单
	 * @return
	 */
	List<User> selectAllUserOrders();
	
	/**
	 * 更新订单
	 * @param order
	 */
	void  updateOrder(Order order);
		
	/**
	 * 插入订单 ，生成订单详情 ， 删除购物车
	 * @param order
	 */
	void insertOrder(Order order);
	
	/**
	 * 删除订单
	 * @param orderId
	 */
	void deleteOrderByOrderId(Integer orderId);
	
}
