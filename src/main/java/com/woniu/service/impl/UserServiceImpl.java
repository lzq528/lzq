package com.woniu.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.IUserDAO;
import com.woniu.pojo.User;
import com.woniu.service.IUserService;
@Service
@Transactional
public class UserServiceImpl implements IUserService {
	@Autowired
	IUserDAO userDAO;
	@Override
	public void save(User obj) {
		// TODO Auto-generated method stub
		userDAO.save(obj);
	}

	@Override
	public void delet(User obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findAll() {
		return userDAO.findAll();
	
	}

	@Override
	public User findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUname(User obj) {
		return userDAO.findByUname(obj);
	}

}
