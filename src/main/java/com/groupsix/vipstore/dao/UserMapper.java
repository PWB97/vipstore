package com.groupsix.vipstore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.groupsix.vipstore.pojo.User;

public interface UserMapper {

	public boolean deleteInvited();
	
	//根据登录名和密码登录
	public User userLogin(
			@Param("loginName")	String loginName, 
			@Param("password")	String password);
	
	//通过用户Id修改用户密码
	public void updateUserPasswordById(
			@Param("userId")	Integer userId,
			@Param("password")	String password);
	
	
	public int changeUserInfo(User user);
	
	public List<User> selectAllUsers();
	
	public String selectLoginNameById(Integer userId);
	
	public int saveUser(User user);

	//根据用户Id查询用户
	public User selectUserByUserId(Integer userId);
	
	//根据登录名查询用户
	public User selectUserByLoginName(String loginName);
	
	public User selectUserByVipCode(String vipCode);
	
	public User selectInvitorIdAndInvitedUsers(Integer userId);
	
	public int deleteUserByUserId(Integer userId);
	
	public int deleteUserByLoginName(String loginName);
	
	public List<User> selectTmpUsers();
	
	public int updateTypeByUserId(Integer userId);

	public void changeUserVipCodeUserTime(User update);
}
