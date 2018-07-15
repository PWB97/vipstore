package com.groupsix.vipstore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.groupsix.vipstore.pojo.Order;
import com.groupsix.vipstore.pojo.User;

public interface OrderMapper {
	
	Order selectOrder(Integer orderId);					//单独查询订单
	List<Order> selectOrders(Integer userId);			//根据用户Id查询用户订单
	List<Order> selectAllOrders();						//查询订单表所有订单
	User selectOrderAndDetail(Integer orderId);			//查询一个订单及其明细
	User selectUserOrders(Integer userId);				//查询用户订单及其明细
	List<User> selectAllUserOrder();					//查询用户所有订单
	void deleteOrderByOrderId(Integer orderId);			//根据订单编号删除订单
	int insertOrder(Order order);						//添加订单
	void updateOrderCostByOrderId(@Param("orderId")Integer orderId,	//更新订单cost
			  					  @Param("cost")Float cost);		
	void updateOrder(Order order);						//更新订单
	
	void deleteOrderDetailByOrderId(Integer orderId);	//删除订单详细表
}
