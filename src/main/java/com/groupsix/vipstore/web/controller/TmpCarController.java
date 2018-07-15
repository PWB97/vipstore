package com.groupsix.vipstore.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.groupsix.vipstore.pojo.TmpCart;
import com.groupsix.vipstore.pojo.User;
import com.groupsix.vipstore.service.TmpCartService;

@Controller
public class TmpCarController {

	@Autowired
	private TmpCartService tmpCartService;
	
	/**
	 * pwb
	 * @param userId 你们要使用session的话就将string userid改成httpsession 获取userid
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/tmpcart", method=RequestMethod.GET)
	public String showTmpCart(HttpSession session, Model model) {
		
		User user = (User)session.getAttribute("currentUser");
		if (user == null) {
			return "redirect:/user/login.html";
		} else {
			List<TmpCart> tmpCartList = tmpCartService.selectTmpCartByUserId(user.getUserId());
			System.out.println(JSON.toJSONString(tmpCartList));
			model.addAttribute("tmpCartList", tmpCartList);
			return "cart";
		}
	}
	
	
	@RequestMapping(value="/tmpcart/number", method=RequestMethod.GET)
	public String setProductNumberInCart(String userId, String productId, String quantity) {
		
		if (tmpCartService.setProductNumberInCart(Integer.parseInt(userId), Integer.parseInt(productId), Integer.parseInt(quantity)))
			return "success";
		else 
			return "fail";
	}
	
	@RequestMapping(value="/tmpcart/delete", method=RequestMethod.GET)
	public String deleteProductInCart(String userId, String productId) {
		
		if (tmpCartService.deleteProductInCart(Integer.parseInt(userId), Integer.parseInt(productId)))
			return "success";
		else 
			return "fail";
		
	}
	
}
