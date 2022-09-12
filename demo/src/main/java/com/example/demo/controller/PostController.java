package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Post;
import com.example.demo.repo.PostRepo;
import com.example.demo.service.PostService;

@RestController
public class PostController {
	
	@Autowired
	PostService postService;
	
	@Autowired
	PostRepo postRepo;
	

	@GetMapping("/postAll")
	public List<Post> findAll() {
		return postService.findAll();

	}
	
	@PostMapping("/post")
	public Post addPost(@RequestBody Post post) {
		postService.save(post);
		return post;

	}
	@PutMapping("/postController/{name}")
	public ResponseEntity<Post> updateUser(@PathVariable String textMessage, @RequestBody Post postDetails) {
		Post updatePost = postRepo.findByTextMessage(textMessage);

		updatePost.setTextMessage(postDetails.getTextMessage());
		
		postRepo.save(updatePost);

		return ResponseEntity.ok(updatePost);
	}

}
