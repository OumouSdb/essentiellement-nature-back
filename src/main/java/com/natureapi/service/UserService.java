package com.natureapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.natureapi.dto.LoginDto;
import com.natureapi.dto.UserDto;
import com.natureapi.entities.User;


public interface UserService{
	
	public UserDto save(UserDto u);
	public UserDto saveOrUpdate(UserDto u);
	public List<UserDto> getAll();
	public void deleteById(long id);
	public UserDto findById(long id); 
	public LoginDto checkLogin(LoginDto l) throws Exception;
	

}
