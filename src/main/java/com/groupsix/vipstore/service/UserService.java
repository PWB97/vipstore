package com.groupsix.vipstore.service;

import java.util.List;

import com.groupsix.vipstore.pojo.User;

public interface UserService {
	
	//修改用户密码
	public void updateUserPasswordById(Integer userId, String password);
	
	//用户登录
	public User userLogin(String loginName, String password);
	
	
	/**
	 * PWB
	 * @return查找所有User---用户管理
	 */
	public List<User> selectAllUsers();
	
	/**
	 * PWB
	 * 修改User信息---会员管理
	 * @param userId
	 * @param loginName
	 * @param userName
	 * @param sex
	 * @param identityCode
	 * @param email
	 * @param mobile
	 * @param address
	 * @return
	 */
	public int changeUserInfo(Integer userId, String loginName, String userName,
								Integer sex, String identityCode, String email,
								String mobile, String address);
	
	/**
	 * PWB
	 * 删除User---用户管理
	 * @param id
	 * @return
	 */
	public int deleteUser(Integer id);

	/**
	 * PWB
	 * 删除被邀请人---会员管理
	 * @param userId
	 * @param loginName
	 * @return
	 */
	int deleteInvited(Integer userId, String loginName);
	
	/**
	 * 注册方法 By beautiful_boy
	 * @param user 保存会员注册信息的对象
	 * @param vipCode 会员注册时填入的邀请码
	 * @return 是否注册成功
	 */
	boolean register(User user, String vipCode);
	
	/**
	 * 查找当前会员邀请的所有人 By beautiful_boy
	 * @param userId 当前正式会员的userId
	 * @return 一个User对象<br>其中包含当前正式会员的userId<br>与当前正式会员邀请但未被管理员通过的所有会员的<br>userId, loginName, userName, sex, identityCode, email, mobile
	 */
	User selectInvitorIdAndInvitedUsers(Integer userId);
	
	/**
	 * 删除被邀请人  By beautiful_boy
	 * @param userId 被邀请人Id
	 * @param loginName 被邀请人loginName
	 * @return
	 */
	public boolean deleteInvitedUser(Integer userId, String loginName);
	
	/**
	 * 查找未通过申请用户——管理员
	 * @return
	 */
	List<User> selectTmpUsers();

	/**
	 * 通过申请用户——管理员
	 * @param userId
	 * @return
	 */
	public void allowUser(Integer userId);
}
