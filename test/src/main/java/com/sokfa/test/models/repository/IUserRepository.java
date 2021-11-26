package com.sokfa.test.models.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.sokfa.test.models.entity.User;

@Repository
public interface IUserRepository extends ReactiveMongoRepository<User, String>{
	
}
