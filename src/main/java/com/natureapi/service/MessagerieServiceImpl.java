package com.natureapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natureapi.dto.DtoTools;
import com.natureapi.dto.MessagerieDto;
import com.natureapi.dto.UserDto;
import com.natureapi.entities.Messagerie;
import com.natureapi.entities.User;
import com.natureapi.repository.MessagerieRepository;

@Service
public class MessagerieServiceImpl implements MessagerieService{

	@Autowired
	private MessagerieRepository messagerieRepo;
	
	@Override
	public MessagerieDto save(MessagerieDto mDto) {
		Messagerie m = DtoTools.convert(mDto, Messagerie.class);
		if(m.getId() == 0) {
			m = messagerieRepo.save(m);
		}else {
			m = messagerieRepo.saveAndFlush(m);
		}
		
		return mDto;
	}

	@Override
	public List<MessagerieDto> findAll() {
		List<Messagerie> msg = messagerieRepo.findAll();
		List<MessagerieDto> result = new ArrayList<MessagerieDto>();
				
			for(Messagerie m : msg) {
				result.add(DtoTools.convert(m, MessagerieDto.class));
			}
			return  result;
	}


}
