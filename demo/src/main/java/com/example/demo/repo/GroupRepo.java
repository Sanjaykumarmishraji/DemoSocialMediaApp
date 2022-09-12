package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Group;
import com.example.demo.entity.User;

public interface GroupRepo extends JpaRepository<Group, String> {

	Group findByName(String name);

}
