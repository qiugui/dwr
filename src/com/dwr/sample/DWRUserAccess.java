package com.dwr.sample;

public class DWRUserAccess {
	UserDAO userDAO = new UserDAO();

	public boolean save(User user) {
		return userDAO.save(user);
	}

	public User find(String id) {
		return userDAO.find(id);
	}
}
