package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;

	@Override
	public void save(User userService) {
		userRepo.save(userService);

	}

	@Override
	public List<User> findAll() {
		
		return userRepo.findAll();
	}

	

}
