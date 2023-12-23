package com.natureapi.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natureapi.entities.User;
import com.natureapi.service.UserService;


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
	public ResponseEntity<User> save(@RequestBody User u) {
		u =  userService.save(u);
		return ResponseEntity.status(HttpStatus.CREATED).body(u);
	}
	
	@PostMapping(value="/login", consumes="application/json", produces="application/json")
	public boolean checklogin(@RequestBody String email, String pass){

		
		return	userService.checkLogin(email, pass);
		
	}
	
	@PutMapping(value="/{id}", consumes="application/json", produces="application/json")
	public User update(@RequestBody User u){
		
		return userService.saveOrUpdate(u);

		
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Long> deleteById(@PathVariable("id") long id) {
		userService.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body(id);
	}

}
