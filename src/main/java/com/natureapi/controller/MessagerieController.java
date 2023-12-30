package com.natureapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.natureapi.dto.MessagerieDto;
import com.natureapi.repository.MessagerieRepository;

@RestController
@RequestMapping("/messagerie")
public class MessagerieController {
	
	@Autowired
	private MessagerieRepository messagerieRepository;
	
	@PostMapping(consumes="application/json", produces = "application/json")
	public ResponseEntity<MessagerieDto> save(@RequestBody MessagerieDto mDto){
		
		messagerieRepository.save(mDto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(mDto);
		
	}
	 
	@GetMapping(produces = "application/json")
	public List<MessagerieDto> findAll() throws Exception{
		
		return messagerieRepository.findAll();
	}

}
