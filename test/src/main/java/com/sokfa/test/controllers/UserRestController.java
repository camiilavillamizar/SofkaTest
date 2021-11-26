package com.sokfa.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sokfa.test.models.dto.UserDto;
import com.sokfa.test.models.service.UserService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserRestController {
	
	@Autowired
	private UserService userService; 
	
	@GetMapping("")
	public Flux<UserDto> getUsers(){
		return userService.getUsers(); 
	}
	
	@GetMapping("/{id}")
	public Mono<UserDto> getUser(@PathVariable String id){
		return userService.getUser(id); 
	}
	
	@PostMapping("")
	public Mono<UserDto> saveUser(@RequestBody Mono<UserDto> userDto){
		return userService.saveUser(userDto); 
	}
	
	
}
