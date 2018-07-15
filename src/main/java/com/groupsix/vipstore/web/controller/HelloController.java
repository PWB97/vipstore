package com.groupsix.vipstore.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.groupsix.vipstore.pojo.Product;
import com.groupsix.vipstore.service.ProductService;


@Controller
public class HelloController {
		
	@Autowired
    private ProductService productService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String hello(Model theModel,HttpSession session) {
		
		
		List<Product> theProduct = productService.findAllProduct();
				
		theModel.addAttribute("Products", theProduct);
		
		return "index";
	}
	
}
