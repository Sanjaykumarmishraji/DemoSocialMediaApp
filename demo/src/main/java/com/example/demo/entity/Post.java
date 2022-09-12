package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String textMessage;

	public Post(String textMessage) {
		super();
		this.textMessage = textMessage;
	}

	public Post() {
		super();
	}

	public String getTextMessage() {
		return textMessage;
	}

	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}

	@Override
	public String toString() {
		return "Post [textMessage=" + textMessage + "]";
	}
	
	
	

}
