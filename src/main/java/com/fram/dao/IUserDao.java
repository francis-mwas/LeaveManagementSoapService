package com.fram.dao;

import java.util.List;

import com.fram.models.User;

public interface IUserDao {
	public User createUSer(User user);
	public List<User> getAllUsers();
	public User getUserDetails(String employeeId);
}
