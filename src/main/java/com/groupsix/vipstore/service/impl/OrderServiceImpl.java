package com.groupsix.vipstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupsix.vipstore.dao.OrderDetailMapper;
import com.groupsix.vipstore.dao.OrderMapper;
import com.groupsix.vipstore.dao.ProductMapper;
import com.groupsix.vipstore.dao.TmpCartMapper;
import com.groupsix.vipstore.pojo.Order;
import com.groupsix.vipstore.pojo.OrderDetail;
import com.groupsix.vipstore.pojo.Product;
import com.groupsix.vipstore.pojo.TmpCart;
import com.groupsix.vipstore.pojo.User;
import com.groupsix.vipstore.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private TmpCartMapper tmpCartMapper;
	@Autowired
	private ProductMapper productMapper;
	@Autowired
	private OrderDetailMapper orderDetailMapper;
	
	
	@Override
	public void deleteOrderByOrderId(Integer orderId) {
		orderDetailMapper.deleteOrderDetail(orderId);
		orderMapper.deleteOrderByOrderId(orderId);
	}
	
	@Override
	public User selectUserOrders(Integer userId) {
		return orderMapper.selectUserOrders(userId);
	}
	
	public void updateOrder(Order order) {
		orderMapper.updateOrder(order);
	}
	
	@Override
	public List<Order> selectAllOrders(){
		return orderMapper.selectAllOrders();
	}
	
	@Override
	public void insertOrder(Order order) {
		orderMapper.insertOrder(order);
		float orderPrice = 0;
		Product newProduct = new Product();
		List<TmpCart> cartItems = tmpCartMapper.selectTmpCartByUserId(order.getUserId());
		
		for(TmpCart cartItem : cartItems) {
			OrderDetail orderDetail = new OrderDetail();
		
			orderDetail.setProductId(cartItem.getProductId());
			
			orderDetail.setQuantity(cartItem.getQuantity());
			Product product = productMapper.findProductById(cartItem.getProductId());
		
			orderDetail.setCost(cartItem.getQuantity() * product.getProductPrice());
			orderDetail.setOrderId(order.getOrderId());
			orderDetailMapper.insertOrderDetail(orderDetail);
			newProduct.setProductId(product.getProductId());
			newProduct.setProductStock(Integer.valueOf(product.getProductStock() - orderDetail.getQuantity()));
			productMapper.updateProduct(newProduct);
			tmpCartMapper.deleteProductInCart(order.getUserId(), product.getProductId());
			orderPrice += orderDetail.getCost();
		}
		orderMapper.updateOrderCostByOrderId(order.getOrderId(), orderPrice);
	}
	
	@Override
	public List<User> selectAllUserOrders(){
		return orderMapper.selectAllUserOrder();
	}
	
	@Override
	public User selectOrderAndDetail(Integer orderId) {
		return orderMapper.selectOrderAndDetail(orderId);
	}
	
	@Override
	public List<Order> selectOrders(Integer userId) {
		
		return orderMapper.selectOrders(userId);
	}
	
}
