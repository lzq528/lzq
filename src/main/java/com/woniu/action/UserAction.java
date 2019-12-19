package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.User;
import com.woniu.service.IUserService;
@Controller
public class UserAction {
	@Autowired
	private IUserService us;
	private List<User> users;
	private User user;
	
	public UserAction() {
		super();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	@Override
	public String toString() {
		return "UserAction [us=" + us + ", users=" + users + ", user=" + user + "]";
	}
	

	//登录
		public String login() {
			User u = us.findByUname(user);
			if (u!=null&&user.getUpwd().equals(u.getUpwd())) {
				return "success";
			}
			return "false";
		}
//		展示所有的user
		public String findAll(){
			System.out.println("恭喜你进来了findAll的Action方法");
			users = us.findAll();
			return "success";
		
		}
	

}
