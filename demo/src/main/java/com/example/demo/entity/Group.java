package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Group {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String name;

	private String profilePic;

	public Group(String name, String profilePic) {
		super();
		this.name = name;
		this.profilePic = profilePic;
	}

	public Group() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	@Override
	public String toString() {
		return "Group [name=" + name + ", profilePic=" + profilePic + "]";
	}

}
