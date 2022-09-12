package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Group;

public interface GroupService {

	public void save(Group group);

	public void deleteEmployee(String name);

	public List<Group> findAll();

}
