package com.accenture.graphQl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.graphQl.model.User;
import com.accenture.graphQl.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public User saveUser(User order) {
		return repo.save(order);
	}

	public List<User> getAllUsers(){
		return repo.findAll();
	}
}
