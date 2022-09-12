package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Group;
import com.example.demo.repo.GroupRepo;
import com.example.demo.service.GroupService;

@RestController
public class GroupController {

	@Autowired
	GroupService groupService;

	@Autowired
	GroupRepo groupRepo;
	

	@GetMapping("/groupAll")
	public List<Group> findAll() {
		return groupService.findAll();

	}

	@PostMapping("/users")
	public Group addUser(@RequestBody Group group) {
		groupService.save(group);
		return group;

	}

	@DeleteMapping("/userDelete/{name}")
	public String deleteEmployee(@PathVariable String name) {
		groupService.deleteEmployee(name);
		return "User has been deleted successfully";
	}

	@PutMapping("{name}")
	public ResponseEntity<Group> updateGroup(@PathVariable String name, @RequestBody Group groupDetails) {
		Group updateGroup = groupRepo.findByName(name);

		updateGroup.setName(groupDetails.getName());
		updateGroup.setProfilePic(groupDetails.getProfilePic());

		return ResponseEntity.ok(updateGroup);
	}
}
