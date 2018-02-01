package com.ssm.mapper;

import com.ssm.pojo.User;

public interface UserMapper {
	//根据用户id查询用户信息
	public User findUserById(String id) throws Exception;
}
