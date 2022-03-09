package com.example.springjwt.dto;

import org.springframework.http.HttpStatus;

public class LoginStatus extends Status {
	
	private HttpStatus httpstatus;
	private String username;
	private String email;
	public HttpStatus getHttpstatus() {
		return httpstatus;
	}
	public void setHttpstatus(HttpStatus httpstatus) {
		this.httpstatus = httpstatus;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

