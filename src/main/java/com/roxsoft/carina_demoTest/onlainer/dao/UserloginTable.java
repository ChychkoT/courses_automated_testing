package com.roxsoft.carina_demoTest.onlainer.dao;


public class UserloginTable {

	private int id;
     private String login;
     private String password;
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
     
	
    @Override
	public String toString() {
		return   login + password;
	}

}
