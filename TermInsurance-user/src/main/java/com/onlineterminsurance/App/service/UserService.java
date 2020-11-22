package com.onlineterminsurance.App.service;

import java.util.List;

import com.onlineterminsurance.App.entity.User;
import com.onlineterminsurance.App.exception.ResourceNotFoundException;

public interface UserService {
	public List<User> getAllUsers();
	public User findUserById(Integer userid) throws ResourceNotFoundException;
	public boolean deleteUserById(Integer userid)throws ResourceNotFoundException;
	public User saveUser(User user);
	public User updateUser(Integer userid,User user)throws ResourceNotFoundException;

}
