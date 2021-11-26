package com.sokfa.test.models.dto;

public class UserDto {
	
	private String id; 
	private String username; 
	private String name; 
	private String password; 
	private String language;
	
	public UserDto() {
		super();
	}

	public UserDto(String id, String username, String name, String password, String language) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.password = password;
		this.language = language;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

} 
