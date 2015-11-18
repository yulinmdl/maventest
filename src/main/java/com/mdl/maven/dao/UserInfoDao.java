package com.mdl.maven.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.mdl.maven.model.UserInfo;

public interface UserInfoDao {

	public int insert(UserInfo userInfo);

	@Select("SELECT * FROM user_info WHERE uid = #{uid}")
	UserInfo getUser(@Param("uid") String uid);	
	
}
