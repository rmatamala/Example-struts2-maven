package com.example.action;


public class LoginAction   {
	/**
	 * 
	 */
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String execute() {

		return "SUCCESS";

	}
}
