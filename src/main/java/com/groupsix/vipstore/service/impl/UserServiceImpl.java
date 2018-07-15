package com.groupsix.vipstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupsix.vipstore.dao.InvitedMapper;
import com.groupsix.vipstore.dao.UserMapper;
import com.groupsix.vipstore.pojo.Invited;
import com.groupsix.vipstore.pojo.User;
import com.groupsix.vipstore.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private InvitedMapper invitedMapper;
	
	@Override
	public User userLogin(String loginName, String password) {
		return userMapper.userLogin(loginName, password);
	}
	
	@Override
	public void updateUserPasswordById(Integer userId, String password) {
		userMapper.updateUserPasswordById(userId, password);
	}

	/**
	 * PWB
	 * 删除被邀请人：先删除邀请表上被邀请人，在删除user表上未正式成为会员的被邀请人
	 */
	@Override
	public int deleteInvited(Integer userId, String loginName) {
		invitedMapper.deleteInvited(userId, loginName);
		return userMapper.deleteUserByLoginName(loginName);
	}

	/**
	 * PWB
	 */
	@Override
	public int changeUserInfo(Integer userId, String loginName, String userName,
								Integer sex, String identityCode, String email, 
								String mobile, String address) {
		
		User user = new User();
		user.setUserId(userId);
		user.setLoginName(loginName);
		user.setUserName(userName);
		user.setSex(sex);
		user.setIdentityCode(identityCode);
		user.setEmail(email);
		user.setMobile(mobile);
		user.setAddress(address);
		return userMapper.changeUserInfo(user);
	}
	
	/**
	 * PWB
	 */
	@Override
	public List<User> selectAllUsers() {
		
		List<User> users = userMapper.selectAllUsers();
		return users;
	}
	
	/**
	 * PWB
	 */
	@Override
	public int deleteUser(Integer userId) {
		String loginName = userMapper.selectLoginNameById(userId);
		invitedMapper.deleteInvited(userId, null);
		invitedMapper.deleteInvited(null, loginName);
		return userMapper.deleteUserByUserId(userId);	
	}

	@Override
	public boolean register(User user, String vipCode) {
		User invitor = userMapper.selectUserByVipCode(vipCode);
		if(invitor != null) {
			if(userMapper.saveUser(user) > 0)
			{
				Invited invited = new Invited();
				invited.setUserId(invitor.getUserId());
				invited.setLoginName(user.getLoginName());
				if(invitedMapper.saveInvited(invited) > 0)
					return true;
				else
					return false;
			}
			else
				return false;
		}
		else
			return false;
	}

	@Override
	public User selectInvitorIdAndInvitedUsers(Integer userId) {
		User invitorUser = userMapper.selectInvitorIdAndInvitedUsers(userId);
		return invitorUser;
	}
	
	@Override
	public boolean deleteInvitedUser(Integer userId, String loginName) {
		// TODO Auto-generated method stub
		if((invitedMapper.deleteInvitedXH(loginName) > 0) && (userMapper.deleteUserByUserId(userId) > 0))
			return true;
		else
			return false;
	}

	@Override
	public List<User> selectTmpUsers() {
		return userMapper.selectTmpUsers();
	}

	@Override
	public void allowUser(Integer userId) {
		// TODO Auto-generated method stub
		User user = userMapper.selectUserByUserId(userId);
		userMapper.updateTypeByUserId(userId);
		Invited invited = invitedMapper.selectInvited(user.getLoginName());
		User update = new User();
		User origin = userMapper.selectUserByUserId(invited.getUserId());
		update.setUserId(invited.getUserId());
		update.setVipCodeUseTime(origin.getVipCodeUseTime() + 1);
		userMapper.changeUserVipCodeUserTime(update);
		invitedMapper.deleteInvitedXH(invited.getLoginName());
	}
}
