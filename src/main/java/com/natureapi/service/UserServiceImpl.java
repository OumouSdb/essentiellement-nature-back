package com.natureapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natureapi.dto.DtoTools;
import com.natureapi.dto.LoginDto;
import com.natureapi.dto.UserDto;
import com.natureapi.entities.User;
import com.natureapi.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepo;
	
	@Override
	public UserDto save(UserDto uDto) {
		
		User u = DtoTools.convert(uDto, User.class);
		if(u.getId() == 0) {
		u =	userRepo.save(u);
		}else {
		u =	userRepo.saveAndFlush(u);
		}
		
		return uDto;
	}

	@Override
	public UserDto saveOrUpdate(UserDto uDto) {
		if(uDto.getId() != 0) {
			
			User u = DtoTools.convert(uDto, User.class);
			userRepo.saveAndFlush(u);
		}
		return uDto;
	}

	@Override
	public List<UserDto> getAll() {
	List<User> user = userRepo.findAll();
	List<UserDto> result = new ArrayList<UserDto>();
			
		for(User u : user) {
			result.add(DtoTools.convert(u, UserDto.class));
		}
		return  result;
	}

	@Override
	public void deleteById(long id) {
		
		userRepo.deleteById(id);
		
	}

	@Override
	public UserDto findById(long id) {
	Optional<User> u = userRepo.findById(id);
		if(u.isPresent()) {
			return DtoTools.convert(u.get(), UserDto.class);
		}
		return null;
	}

	@Override
	public LoginDto checkLogin(LoginDto l) throws Exception{
	
		User u = userRepo.findByEmail(l.getEmail());
		
		 if (u != null) {
		        if (l.getEmail() != null && l.getPassword().equals(u.getPassword())) {
		            return l;
		        }else {
		        	throw new Exception("Error : invalid credentials !");
		        }
		
	}
 throw new Exception("Error : invalid credentials !");
}
}