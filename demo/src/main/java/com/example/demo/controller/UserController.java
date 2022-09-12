package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;


@RestController
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	UserRepo userRepo;
	
	
	@GetMapping("/userAll")
	public List<User> findAll() {
		return userService.findAll();

	}

	@PostMapping("/users/userController")
	public User addUser(@RequestBody User user) {
		userService.save(user);
		return user;

	}

	@PutMapping("/userController/{name}")
	public ResponseEntity<User> updateUser(@PathVariable String name, @RequestBody User userDetails) {
		User updateUser = userRepo.findByName(name);

		updateUser.setName(userDetails.getName());
		updateUser.setProfilePicUrl(userDetails.getProfilePicUrl());
		updateUser.setEmailId(userDetails.getEmailId());

		userRepo.save(updateUser);

		return ResponseEntity.ok(updateUser);
	}

}
