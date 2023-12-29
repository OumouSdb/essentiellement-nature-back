package com.natureapi.controller;

import java.util.List;
import java.util.Optional;

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

import com.natureapi.dto.LoginDto;
import com.natureapi.dto.UserDto;
import com.natureapi.entities.User;
import com.natureapi.service.UserService;


@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController{
	
	@Autowired
	private UserService userService;
	
	

	@GetMapping(value = "/", produces = "application/json")
	public List<UserDto> findAll() throws Exception{
		return userService.getAll();
	}
	
	@GetMapping("/{id}")
	public UserDto findById(@PathVariable("id") long id){
		return userService.findById(id);
	}
	
	@PostMapping("/")
	public ResponseEntity<UserDto> save(@RequestBody UserDto u) {
		u =  userService.save(u);
		return ResponseEntity.status(HttpStatus.CREATED).body(u);
	}
	
	@PostMapping(value="/login", consumes="application/json", produces="application/json")
	public LoginDto checklogin(@RequestBody LoginDto l) throws Exception{

		
		return	userService.checkLogin(l);
		
	}
	
	@PutMapping(value="/{id}", consumes="application/json", produces="application/json")
	public UserDto update(@RequestBody UserDto u){
		
		return userService.saveOrUpdate(u);

		
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Long> deleteById(@PathVariable("id") long id) {
		userService.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body(id);
	}

}
