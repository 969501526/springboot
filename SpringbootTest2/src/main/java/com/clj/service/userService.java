package com.clj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clj.dao.UserDao;
import com.clj.entity.Result;
import com.clj.entity.User;
import com.clj.util.UserUtil;

@Service
public class userService {

	
	@Autowired
	private UserDao userDao;
	
	public List<User> findAll(){
		return userDao.findAll();
	}
	
	public Result saveUser(User user) {
		if(user.getAge()<16 || user.getAge()>60) {
			
			return UserUtil.error(100, "年龄在16-60之间,你的年龄不符合要求");
		}else {
			User user1=userDao.save(user);
			return UserUtil.success(user1);
		}
	}
	
	public Result finaByAge(Integer id) {
		User user = userDao.findOne(id);
		Integer age = user.getAge();
		if(age<16 || age>60){
			return UserUtil.error(100, "年龄在16-60之间,你的年龄不符合要求");
		}else {
			return UserUtil.success(user);
		}
	}
}
