package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IUserDAO;
import com.woniu.pojo.User;
@Repository
public class UserDAOImpl implements IUserDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(User obj) {
		// TODO Auto-generated method stub
		sessionFactory.openSession().save(obj);
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
		System.out.println("进来了dao层");
		List users = sessionFactory.getCurrentSession().createQuery("from User").list();
		System.out.println(users);
		return users;
	}

	@Override
	public User findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUname(User obj) {
		Criteria c = sessionFactory.getCurrentSession().createCriteria(User.class);
		SimpleExpression like = Restrictions.like("uname", obj.getUname());
		System.out.println("我是userDao的实现类");
		c.add(like);
		List<User> users = c.list();
		System.out.println("我是dao里的集合"+users.get(0));
		return users.get(0);
	
	}

}
