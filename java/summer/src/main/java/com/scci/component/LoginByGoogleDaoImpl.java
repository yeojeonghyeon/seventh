package com.scci.component;

public class LoginByGoogleDaoImpl implements LoginDao {
	@Override
	public String login(String user) {
		System.out.println("LoginByGoogleDaoImpl's login called");
		return "google login : " + user;
	}
}
