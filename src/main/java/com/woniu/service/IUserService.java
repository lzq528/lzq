package com.woniu.service;

import java.util.List;

import com.woniu.pojo.User;

public interface IUserService {
	void save(User obj);
	void delet(User obj);
	void update(User obj);
	List<User> findAll();
	User findOne(Integer id);
	User findByUname(User obj);
}
