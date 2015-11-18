package com.mdl.maven.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mdl.maven.dao.UserInfoDao;
import com.mdl.maven.dao.UserInfoMapper;
import com.mdl.maven.model.UserInfo;
import com.mdl.maven.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Resource
	private UserInfoDao userInfoDao;

	@Resource
	private UserInfoMapper userInfoMapper;
	
	@Override
	public UserInfo getUser(int uid) {
		return userInfoMapper.selectByPrimaryKey(uid);
//		UserInfo user=new UserInfo();
//		user.setUid(1);
//		user.setUname("mdl");
//		user.setUnumber(12);
//		return user;
	}

}
