package com.sokfa.test.utils;

import org.springframework.beans.BeanUtils;

import com.sokfa.test.models.dto.UserDto;
import com.sokfa.test.models.entity.User;

public class AppUtils {
	
	public static UserDto entityToDTO(User user) {
		UserDto userDto = new UserDto(); 
		BeanUtils.copyProperties(user, userDto);
		return userDto; 
	}
	
	public static User dtoToEntity(UserDto userDto) {
		User user = new User(); 
		BeanUtils.copyProperties(userDto, user);
		return user; 
	}
}
