package com.tutorial.mongo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tutorial.mongo.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	Optional <User> findByUserName(String userName);
	Boolean existsByUserName(String userName);
	Boolean existsByEmail(String email);
}
