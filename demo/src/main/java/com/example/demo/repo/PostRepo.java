package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Group;
import com.example.demo.entity.Post;

public interface PostRepo extends JpaRepository<Post, String>{

	public Post findByTextMessage(String textMessage);

}
