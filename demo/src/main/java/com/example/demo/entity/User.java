package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String name;
	
	private String emailId;
	private String profilePicUrl;

	public User(String name, String emailId, String profilePicUrl) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.profilePicUrl = profilePicUrl;
	}

	public User() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getProfilePicUrl() {
		return profilePicUrl;
	}

	public void setProfilePicUrl(String profilePicUrl) {
		this.profilePicUrl = profilePicUrl;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", emailId=" + emailId + ", profilePicUrl=" + profilePicUrl + "]";
	}

}
