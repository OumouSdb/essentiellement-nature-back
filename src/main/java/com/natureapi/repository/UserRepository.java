package com.natureapi.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.natureapi.entities.User;

@Repository
public abstract class UserRepository implements JpaRepository<User, Long>{

	@Override
	public List<User> findAll() {
		
		return null;
	}

	@Override
	public  User save(User user) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Optional<User> findById(Long id) {
//		// TODO Auto-generated method stub
//		return Optional.empty();
//	}

	
	@Override
	public void deleteById(Long id) {
		
	}



	@Override
	public <S extends User> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public User getById(Long id) {
	
		return null;
	}



}
