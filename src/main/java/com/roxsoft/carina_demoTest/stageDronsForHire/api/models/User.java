package com.roxsoft.carina_demoTest.stageDronsForHire.api.models;

public class User {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;
	private String username;
	
	public User(){	
	}
	
	public User(String firstName, String lastName, String email,
			String password, String confirmPassword, String username) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", username="
				+ username + "]";
	}
	
	

}
