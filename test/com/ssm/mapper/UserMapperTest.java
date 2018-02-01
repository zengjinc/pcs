package com.ssm.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.pojo.User;

public class UserMapperTest {
	
	private ClassPathXmlApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception {
		//µÃµ½ spring µÄÈÝÆ÷
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		UserMapper usermapper = (UserMapper) applicationContext.getBean("userMapper");
		User user = usermapper.findUserById("pcsadmin");
		System.out.println(user);
	}

}
