package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.User;

public interface IUserDAO {
	void save(User obj);
	void delet(User obj);
	void update(User obj);
	List<User> findAll();
	User findOne(Integer id);
	User findByUname(User obj);

}
