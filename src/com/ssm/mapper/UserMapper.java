package com.ssm.mapper;

import com.ssm.pojo.User;

public interface UserMapper {
	//�����û�id��ѯ�û���Ϣ
	public User findUserById(String id) throws Exception;
}
