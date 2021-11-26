package com.sokfa.test.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sokfa.test.models.dto.UserDto;
import com.sokfa.test.models.entity.User;
import com.sokfa.test.models.repository.IUserRepository;
import com.sokfa.test.utils.AppUtils;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class UserService {
	
	@Autowired
	private IUserRepository userRepo; 
	
	
	public Flux<UserDto> getUsers(){
		return userRepo.findAll().map(AppUtils::entityToDTO); 
	}
	public Mono<UserDto> getUser(String id){
		return userRepo.findById(id).map(AppUtils::entityToDTO); 
	}
	public Mono<UserDto> saveUser(Mono<UserDto> userDto){
		return userDto.map(AppUtils::dtoToEntity)
		.flatMap(userRepo::insert)
		.map(AppUtils::entityToDTO);
	}
}
