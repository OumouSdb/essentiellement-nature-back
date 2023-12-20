package com.natureapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natureapi.entities.User;
import com.natureapi.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepo;
	
	User u = new User();
	
	@Override
	public User save() {
		
		userRepo.save(u);
		return u;
	}

	@Override
	public User saveOrUpdate() {
		if(u.getId() != 0) {
			userRepo.saveAndFlush(u);
		}
		return u;
	}

	@Override
	public List<User> getAll() {
		userRepo.findAll();
		
		return (List<User>) u;
	}

	@Override
	public User deleteById(long id) {
		
		userRepo.deleteById(u.getId());
		return null;
	}

	@Override
	public User getById(long id) {
		userRepo.getById(u.getId());
		return u;
	}

}
