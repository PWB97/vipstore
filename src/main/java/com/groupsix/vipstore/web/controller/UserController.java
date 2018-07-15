package com.groupsix.vipstore.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang.RandomStringUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.groupsix.vipstore.pojo.User;
import com.groupsix.vipstore.service.UserService;

@Controller
public class UserController {

	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/user/login.html", method = RequestMethod.GET)
	public String login() { 
		return "login";
	}
	
	@RequestMapping(value = "/user/login.html",method = RequestMethod.POST)
	public String login(String loginName, String password,HttpSession session,Model model) throws IOException {
			
			User user = userService.userLogin(loginName, password);		
					
			if(user != null) {
				session.setAttribute("currentUser", user);		//当前用户存入session的"currentUser"
				if(user.getType() == 1) {
					return "redirect:/user/index.html";				
				}
				else if(user.getType() == 0) {
					return "redirect:/user/userManager";	
				}
				else {
					model.addAttribute("error", "你还未审批通过，请耐心等待.");
					model.addAttribute("loginName", loginName);
					return "login";
				}
			}
			
			else{
				model.addAttribute("error", "用户名或密码错误!");
				model.addAttribute("loginName", loginName);
				return "login";
			}
			
	}

	@RequestMapping(value = "/user/repassword.html", method = RequestMethod.GET)
	public String repassword(HttpSession session) { 
		User currentUser = (User)session.getAttribute("currentUser");
		if(currentUser == null) {
			return "redirect:/user/login.html";
		} else {
			return "repassword";
		}
		
	}
	
	@RequestMapping(value = "/user/repassword.html",method = RequestMethod.POST)
	public String repassword(String oldpassword,String newpassword,String renewpassword,HttpSession session,Model model){
			User user = (User) session.getAttribute("currentUser");	
			if(user == null)
			{
				return "redirect:/user/login.html";
			}
			else
			{
				if(oldpassword.equals(user.getPassword()) == true)
				{
					if(newpassword.equals(renewpassword) == true) {
						userService.updateUserPasswordById(user.getUserId(), newpassword);
						session.setAttribute("currentUser", user);		//当前用户存入session的"currentUser"
						return "redirect:/user/index.html";
					}
					else {
						model.addAttribute("error", "两次输入密码不匹配!");
						return "repassword";
					}
						
				}
				else {
					model.addAttribute("error", "原始密码输入错误!");
					return "repassword";
				}
			}
		}
	
	@RequestMapping("/user/index.html")
	public String index() {
		return "redirect:/";
	}
	
	

	@RequestMapping("/user/UserCenter.html")
	public String userCenter(HttpSession session) {
		User currentUser = (User)session.getAttribute("currentUser");
		if(currentUser == null) {
			return "redirect:/user/login.html";
		} else {
			return "UserCenter";
		}
			
	}
	
	
	@RequestMapping(value="/user/deleteInvited", method=RequestMethod.POST)
	public String deleteInvited(String userId, String loginName) {
		
		int i = userService.deleteInvited(Integer.parseInt(userId), loginName);
		if (i != 0) {
			return "success";
		} else {
			return "fail";
		} 
	}
	
	@RequestMapping(value="/user/checkInvitedUsers.html", method=RequestMethod.GET)
	public String toCheckInvitedUsersPage(HttpSession session, Model model, HttpServletRequest request) {
		
		User invitor = (User)session.getAttribute("currentUser");
		
		if(invitor == null) {
			return "redirect:/user/login.html";
		} else {
			User result = userService.selectInvitorIdAndInvitedUsers(invitor.getUserId());
			if(result != null) {
				List<User> invitedUsers = result.getInviteds();
				model.addAttribute("invitedUsers", invitedUsers);
			}
			return "CheckInvitedUsers";
		}
	}
	
	@RequestMapping(value="/deleteInvitedUser", method=RequestMethod.GET)
	public String deleteInvitedUser(Integer userId, String loginName) {
		if(userService.deleteInvitedUser(userId, loginName))
			return "redirect:/user/checkInvitedUsers.html";
		else
			return "fail";
	}
	
	@RequestMapping(value="/user/register.html", method=RequestMethod.GET)
	public String toRegisterPage() {
		return "Register"; 
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(String loginName,String userName, String mobile, String email, String identityCode, 
							String address, String password, String vipCode, Integer sex) {
		User user = new User();
		user.setLoginName(loginName);
		user.setEmail(email);
		user.setIdentityCode(identityCode);
		user.setPassword(password);
		user.setUserName(userName);
		user.setMobile(mobile);
		user.setAddress(address);
		user.setVipCode(RandomStringUtils.randomAlphanumeric(8));
		user.setSex(sex);
		user.setType(-1);
		user.setVipCodeUseTime(0);
		if(userService.register(user, vipCode))
			return "login";
		else
			return "fail";
	}
	
	 
	@RequestMapping(value="/user/deleteInvited", method=RequestMethod.GET)
	public String deleteInvited() {
		return "deleteInvited";
	}
	
	@RequestMapping(value="/user/changeUserInfo", method=RequestMethod.POST)
	public String changeUserInfo(String userId, String loginName, String userName, 
								String sex, String identityCode, String email,
								String mobile, String address) {
		
		int i = userService.changeUserInfo(Integer.parseInt(userId), loginName, userName,
											Integer.parseInt(sex), identityCode, email, mobile, address);
		if (i != 0) {
			return "success";
		} else {
			return "fail";
		}
	}
	
	@RequestMapping(value="/user/changeUserInfo", method=RequestMethod.GET)
	public String changeUserInfo(HttpSession session) {
		
		User currentUser = (User)session.getAttribute("currentUser");
		if(currentUser == null) {
			return "redirect:/user/login.html";
		} else {
			return "UserCenter";
		}
	}
	
	@RequestMapping(value="user/userManager", method=RequestMethod.GET)
	public String selectAllUsers(Model model) {
		List<User> users = userService.selectAllUsers();
		model.addAttribute("users", users);
		return "userManager";
	}
	
	@RequestMapping(value="user/userManager/delete", method=RequestMethod.GET)
	public String deleteUser(String userId) {
		int i = userService.deleteUser(Integer.parseInt(userId));
		if (i != 0) {
			return "success";
		} else {
			return "fail";
		}
	}
	
	@RequestMapping(value="/user/allowUser", method=RequestMethod.GET)
	public String selectTmpUsers(Model model) {
		List<User> tmpUsers = userService.selectTmpUsers();
		model.addAttribute("tmpUsers", tmpUsers);
		return "allowUserManager";
	}
	
	@RequestMapping(value="/user/allowUser/allow", method=RequestMethod.GET)
	public String allowUser(String userId) {
		userService.allowUser(Integer.parseInt(userId));
		return "redirect:/user/allowUser";
	}
	
	@RequestMapping("/user/logout")
	public String logout(HttpSession session) {
		User currentUser = (User)session.getAttribute("currentUser");
		if(currentUser == null) {
			return "redirect:/user/login.html";
		} else {
			session.invalidate();
			return "redirect:/";
		}
	}
}
