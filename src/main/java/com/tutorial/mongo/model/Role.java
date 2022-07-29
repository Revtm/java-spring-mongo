package com.tutorial.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "roles")
public class Role {
	@Id
	@Getter 
	@Setter 
	private String id;
	
	@Getter
	@Setter
	private ERole name;
	
	public Role(){
	}
	
	public Role(ERole name) {
		this.name = name;
	}
}
