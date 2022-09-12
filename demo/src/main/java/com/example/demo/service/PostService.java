package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Post;

public interface PostService {

	public void save(Post post);

	public List<Post> findAll();

}
