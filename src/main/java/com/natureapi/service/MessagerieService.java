package com.natureapi.service;

import java.util.List;

import com.natureapi.dto.MessagerieDto;


public interface MessagerieService {
	
	public MessagerieDto save(MessagerieDto mDto);
	public List<MessagerieDto> findAll();

}
