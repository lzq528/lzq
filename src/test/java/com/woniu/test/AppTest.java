package com.woniu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.woniu.dao.IUserDAO;
import com.woniu.pojo.User;

public class AppTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserDAO ud = ac.getBean(IUserDAO.class);
		User user = new User();
		user.setUname("bbb");
		user.setUpwd("222");
		ud.save(user);
	}

}
