package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Post;
import com.example.demo.repo.PostRepo;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	PostRepo postRepo;

	@Override
	public void save(Post post) {
		postRepo.save(post);

	}

	@Override
	public List<Post> findAll() {

		return postRepo.findAll();
	}

}
