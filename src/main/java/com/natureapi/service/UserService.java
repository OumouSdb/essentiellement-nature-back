package com.natureapi.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.natureapi.entities.User;


public interface UserService{
	
	public User save(User u);
	public User saveOrUpdate(User u);
	public List<User> getAll();
	public void deleteById(long id);
	public User getById(long id); 
	public boolean checkLogin(String email, String pass);
	

}
