package com.groupsix.vipstore.web.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.groupsix.vipstore.pojo.Order;
import com.groupsix.vipstore.pojo.User;
import com.groupsix.vipstore.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "/order/manage.html", method = RequestMethod.GET)
	public String manage() { 
		return "manage";
	}
	     
	
	@RequestMapping(value = "/order/manage.html",method = RequestMethod.POST)
	public String viewOrder(HttpSession session,Model model) throws IOException {
		List<Order> orders = orderService.selectAllOrders();
		model.addAttribute("orders", orders);
		return "manage";
	}
	
	@RequestMapping(value = "/order/delete.html",method = RequestMethod.POST)
	public String delete(@RequestParam("orderId") Integer orderId,Model model) throws IOException {
		orderService.deleteOrderByOrderId(orderId);
		return "redirect:/order/userOrder.html";
	}
	
	@RequestMapping(value = "/order/delete.html",method = RequestMethod.GET)
	public String delete(@RequestParam("orderId") Integer orderId) throws IOException {
		orderService.deleteOrderByOrderId(orderId);
		return "redirect:/order/userOrder.html";
	}
	
	@RequestMapping(value = "/order/userOrder.html", method = RequestMethod.GET)
	public String userOrder(HttpSession session, Model model) { 
		User currentUser = (User)session.getAttribute("currentUser");
		if(currentUser != null) {
			User userOrders = orderService.selectUserOrders(currentUser.getUserId());
			model.addAttribute("userOrders", userOrders);
			model.addAttribute("currentUser", currentUser);
			return "userOrder";
		}
		
		else return "login";
	}
	
	@RequestMapping(value = "/order/userOrder.html",method = RequestMethod.POST)
	public String userOrder (String userId,HttpSession session,Model model)throws IOException {
		return "userOrder";
	}
	   

	@RequestMapping(value = "/order/addOrder.html", method = RequestMethod.GET)
	public String addOrder(HttpSession session,Model model) {
		Order order = new Order();
		User user = (User)session.getAttribute("currentUser");
		order.setUserId(user.getUserId());
		order.setSerialNumber(UUID.randomUUID().toString());
		order.setCreateTime(new Date());
		orderService.insertOrder(order);
		return "redirect:/order/userOrder.html";
	}
	
	@RequestMapping(value = "/order/addOrder.html",method = RequestMethod.POST)
	public String addOrder ()throws IOException {
		return "redirect:/order/userOrder.html";
	}
}
