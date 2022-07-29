package com.tutorial.mongo.payloads.request;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

public class LoginRequest {
	@Getter
	@Setter
	@NotBlank
	private String userName;
	@Getter
	@Setter
	@NotBlank
	private String password;
}
