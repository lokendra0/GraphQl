package com.accenture.graphQl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.graphQl.model.User;
import com.accenture.graphQl.service.UserService;

@Controller
public class UserController {

	
	@Autowired
	private UserService service;
	
	@MutationMapping
	public User createUser(@Argument String name,@Argument String phone,@Argument String email,@Argument String password ) {
		User user = new User();
		user.setName(name);
		user.setPhone(phone);
		user.setPassword(password);
		user.setEmail(email);
		return service.saveUser(user);
	}
	
	@QueryMapping
	public List<User> getAllUsers(){
		return service.getAllUsers();
	}
	
}
