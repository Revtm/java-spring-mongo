package com.tutorial.mongo.payloads.request;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

public class SignupRequest {
	
	@Getter
	@Setter
	@NotBlank
	@Size(min=3, max=20)
	private String userName;
	
	@Getter
	@Setter
	@NotBlank
	@Size(max=50)
	@Email
	private String email;
	
	@Getter
	@Setter
	@NotBlank
	@Size(min=6, max=40)
	private String password;
	
	@Getter
	@Setter
	private Set<String> roles;
}
