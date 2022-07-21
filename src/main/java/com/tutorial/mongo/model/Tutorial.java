package com.tutorial.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "tutorials")
public class Tutorial {
	
	@Getter
	@Id
	private String id;
	@Getter	@Setter	private String title;
	@Getter	@Setter private String description;
	@Setter private boolean published;
	public Tutorial() {
		
	}
	public Tutorial(String title, String description, boolean published) {
		this.title = title;
		this.description = description;
		this.published = published;
	}
	
	public boolean isPublished() {
		return this.published;
	}
	
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
	}
	
}
