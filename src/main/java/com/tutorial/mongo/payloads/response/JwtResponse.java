package com.tutorial.mongo.payloads.response;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class JwtResponse {
	private String token;
	private String type = "Bearer";
	@Getter
	@Setter
	private String id;
	@Getter
	@Setter
	private String userName;
	@Getter
	@Setter
	private String email;
	@Getter
	private List<String> roles;

	public JwtResponse(String accessToken, String id, String userName, String email, List<String> roles) {
		this.token = accessToken;
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.roles = roles;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}
}
