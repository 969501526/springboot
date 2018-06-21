package com.clj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clj.entity.Result;
import com.clj.entity.User;
import com.clj.service.userService;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private userService userService;
	
	@GetMapping("/finAll")
	public List<User> findAll(){
		return userService.findAll();
	}
	
	@GetMapping("saveUser")
	public Result saveUser(User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("findByAge/{id}")
	public Result findByAge(@PathVariable("id") Integer id) {
		return userService.finaByAge(id);
	}
}
