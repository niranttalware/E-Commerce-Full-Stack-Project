package com.ecom_project.ecom.service;

import java.util.List;

import com.ecom_project.ecom.exception.UserException;
import com.ecom_project.ecom.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
