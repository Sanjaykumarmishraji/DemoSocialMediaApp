package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.User;

public interface UserService {

	public void save(User employeeService);

	public List<User> findAll();

	//public User findByName(String name);

}
