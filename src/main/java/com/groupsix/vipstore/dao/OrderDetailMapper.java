package com.groupsix.vipstore.dao;

import com.groupsix.vipstore.pojo.OrderDetail;

public interface OrderDetailMapper {
	
	void insertOrderDetail(OrderDetail orderDetail);
	
	void deleteOrderDetail(Integer orderId);
}
