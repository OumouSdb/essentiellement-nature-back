package com.natureapi.repository;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.natureapi.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query("FROM User u WHERE u.email = :email")
	User findByEmail(@Param("email") String email);

}
