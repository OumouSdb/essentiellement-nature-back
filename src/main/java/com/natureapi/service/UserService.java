package com.natureapi.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.natureapi.entities.User;


public interface UserService{
	
	public User save();
	public User saveOrUpdate();
	public List<User> getAll();
	public User deleteById(long id);
	public User getById(long id);
	

}
