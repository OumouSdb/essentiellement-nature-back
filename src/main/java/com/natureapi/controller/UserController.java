package com.natureapi.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.natureapi.entities.User;
import com.natureapi.service.UserService;
import com.natureapi.service.UserServiceImpl;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController{
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/", produces = "application/json")
	public List<User> findAll() throws Exception{
		return userService.getAll();
	}
	
	@GetMapping("/users/{id}")
	public User findById(@PathParam("id") long id){
		return userService.getById(id);
	}
	
	@PostMapping("/")
	public User save() {
		return userService.saveOrUpdate();
	}
	
	@PutMapping("/{id}")
	public User update(@PathParam("id") long id){
		
		return userService.saveOrUpdate();
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<User> deleteById(User u) {
		userService.deleteById(u.getId());
		return ResponseEntity.status(HttpStatus.OK).body(u);
	}

}
