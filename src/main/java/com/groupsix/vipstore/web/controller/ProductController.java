package com.groupsix.vipstore.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.groupsix.vipstore.pojo.Product;
import com.groupsix.vipstore.pojo.TmpCart;
import com.groupsix.vipstore.pojo.User;
import com.groupsix.vipstore.service.ProductService;
import com.groupsix.vipstore.service.TmpCartService;


@Controller
@Transactional
@RequestMapping(value="/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private TmpCartService tmpCartService;
	
	@RequestMapping(value="/showProduct", method=RequestMethod.GET)
	public String showProduct(Model model) {
		
		List<Product> products = productService.findAllProduct();
		
		for(int i =0;i<products.size();i++) {
			System.out.println(products.get(i).getProductName());
		}
		
		model.addAttribute("Products", products);
		
		return "addProductN";
	}
	
	@RequestMapping(value="/addProduct")
	public String addProduct() {
		
		return "addProductN";
		
	}
	
	@RequestMapping(value="/productModelHandle")
	public String productModelHandle(
			MultipartFile pic,
			@RequestParam("commodityName") String commodityName,
			@RequestParam("commodityDescription") String commodityDescription,
			@RequestParam("commodityPrice") String commodityPrice,
			@RequestParam("commodityNumber") String commodityStock,
			@RequestParam("commodityOrigin") String commodityOrigin,
			@RequestParam("commodityType") String commodityType
			)throws IllegalStateException, IOException {
				
		Float CommodityPrice = Float.parseFloat(commodityPrice);
		
		int CommodityNumber = Integer.parseInt(commodityStock);
				
		boolean CommodityIsDelete = true;
		
		String filePath;
		
		if (!pic.isEmpty()) {
			
            String path = "/Users/pu/git/vipstore/src/main/webapp/images/";
            String originalFileName = pic.getOriginalFilename();
            // 新的图片名称
            String newFileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));
            // 新的图片
            File newFile = new File(path + newFileName);
            // 将内存中的数据写入磁盘
            pic.transferTo(newFile);
            
            filePath = newFileName;
            
            Product newProduct = new Product(commodityName,commodityDescription,CommodityPrice,CommodityNumber,CommodityIsDelete,filePath,commodityOrigin,commodityType);
            
            productService.addProduct(newProduct);
            
            System.out.println(newFile);
        }
		
		
		return "redirect:/product/showProduct";
	}
	
	@RequestMapping(value="/deleteProduct")
	public String deleteProduct(@RequestParam("productId") int theId) {
				
		System.out.println(theId);
		
		productService.delProduct(theId);
		
		return "redirect:/product/showProduct";
	}
	
	@RequestMapping(value="/productModify")
	public String modifyProduct(Model model ,@RequestParam("productId") int theId) {
		
		Product product = productService.findProduct(theId);
		
		model.addAttribute("Product", product);
		
		return "modifyProduct";
	}
	
	@RequestMapping(value="/updateProduct")
	public String updateProduct(
			@RequestParam("commodityName") String commodityName,
			@RequestParam("commodityId") String commodityId,
			@RequestParam("commodityDescription") String commodityDescription,
			@RequestParam("commodityPrice") String commodityPrice,
			@RequestParam("commodityNumber") String commodityStock,
			@RequestParam("commodityOrigin") String commodityOrigin) {
		
		Float CommodityPrice = Float.parseFloat(commodityPrice);
		
		int CommodityNumber = Integer.parseInt(commodityStock);
		
		int CommodityId = Integer.parseInt(commodityId);
				
		Product newProduct = new Product(CommodityId, commodityName, commodityDescription, CommodityPrice, CommodityNumber,commodityOrigin);
		
		productService.updeateProduct(newProduct);
		
		return "redirect:/product/showProduct";
	}
	
	// 测试按种类查找，成功
	@RequestMapping(value="/findTypeProduct")
	public String findTypeProduct(Model model,@RequestParam("Type") String type) {
		
		System.out.println(type);
		List<Product> products = productService.findProductByType(type);
		
		model.addAttribute("Products",products);
		
		return "index";
		
	}
	
	// 测试商品详情页展示
	@RequestMapping(value="/detailProduct")
	public String detailProduct(Model model,@RequestParam("id") String id) {
		
		Integer productId = Integer.parseInt(id);
		
		Product products = productService.findProduct(productId);
		
		model.addAttribute("Product",products);
		
		return "productDetail";
		
	}
	
	// 添加购物车
	@RequestMapping(value="/addShoppingCar")
	public String addShoppingCar(
			@RequestParam("productId") String ProductId,
			@RequestParam("number") String Number,
			HttpSession session) {
		
		User user = (User) session.getAttribute("currentUser");
		
		System.out.println(ProductId + Number );
		
		Integer cartProductId = Integer.parseInt(ProductId);
		
		Integer cartProductNumber = Integer.parseInt(Number);
		
		Integer userId = user.getUserId();
		
		System.out.println(userId + " " + cartProductNumber + " " + cartProductId);
				
		tmpCartService.addProductInCart(userId, cartProductId, cartProductNumber);
		
		return "redirect:/tmpcart";
	}
	
	@RequestMapping(value="/test")
	public String test() {
		return "redirect:/tmpcart";
	}

}
