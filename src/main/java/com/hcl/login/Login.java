package com.hcl.login;

import java.util.ArrayList;
import java.util.List;

import com.hcl.user.User;

public class Login {

	private static List<User> UserList = new ArrayList<>();

	static {
		UserList.add(new User("Mark", "pass", "emp"));
		UserList.add(new User("Jane", "pass", "admin"));
		UserList.add(new User("Brad", "pass", "emp"));
	}

	public boolean authentication(String username, String password) {
		for (User u : UserList) {
			if (u.getPassword().equals(password) && u.getUsername().equals(username)) {
				System.out.println("Login Successful!");
				return true;
			}
		}
		return false;
	}

	public boolean authorization(String username) {
		for (User u : UserList) {
			if (u.getUsername().equals(username) && u.getPrivilege().equalsIgnoreCase("admin")) {
				System.out.println("Administrative Access Unlocked for " + u.getUsername());
				return true;
			}
		}
		System.out.println("Access Level: Employee");
		return false;
	}

}