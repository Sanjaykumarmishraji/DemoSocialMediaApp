package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Group;
import com.example.demo.repo.GroupRepo;

@Service
public class GroupServiceImpl  implements GroupService {

	@Autowired
	GroupRepo groupRepo;
	
	@Override
	public void save(Group group) {
		groupRepo.save(group);
		
	}

	@Override
	public void deleteEmployee(String name) {
		groupRepo.deleteById(name);
		
	}

	@Override
	public List<Group> findAll() {
		
		return groupRepo.findAll();
	}

}
