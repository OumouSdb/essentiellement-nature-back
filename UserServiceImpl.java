package com.natureapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natureapi.entities.User;
import com.natureapi.repository.userRepository;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	userRepository userRepo;
	
	User u = new User();
	
	@Override
	public User save(User u) {
		if(u.getId() == 0) {
		u =	userRepo.save(u);
		}else {
		u =	userRepo.saveAndFlush(u);
		}
		
		return u;
	}

	@Override
	public User saveOrUpdate(User u) {
		if(u.getId() != 0) {
			userRepo.saveAndFlush(u);
		}
		return u;
	}

	@Override
	public List<User> getAll() {
	List<User> user = userRepo.findAll();
	List<User> result = new ArrayList<User>();
			
		for(User u : user) {
			result.add(u);
		}
		return  result;
	}

	@Override
	public void deleteById(long id) {
		
		userRepo.deleteById(id);
		
	}

	@Override
	public User getById(long id) {
		userRepo.getById(u.getId());
		return u;
	}

}
