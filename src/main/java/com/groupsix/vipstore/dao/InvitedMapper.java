package com.groupsix.vipstore.dao;

import org.apache.ibatis.annotations.Param;

import com.groupsix.vipstore.pojo.Invited;

public interface InvitedMapper {
	
	public int saveInvited(Invited invited);
	
	public int deleteInvitedXH(String loginName);
	
	public int deleteInvited(@Param("userId")Integer userId, @Param("loginName") String loginName);
	
	public Invited selectInvited(String loginName);
}
