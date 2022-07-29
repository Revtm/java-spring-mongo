package com.tutorial.mongo.model;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "users")
public class User {
	@Id
	@Getter
	@Setter
	private String id;
	
	@Getter
	@Setter
	@NotBlank
	@Size(max=20)
	private String userName;
	
	@Getter
	@Setter
	@NotBlank
	@Size(max=50)
	@Email
	private String email;
	
	@Getter
	@Setter
	@Size(max=120)
	private String password;
	
	@Getter
	@Setter
	@DBRef
	private Set<Role> roles = new HashSet<>();
	
	public User() {
	}
	
	public User(String userName, String email, String password) {
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
}
