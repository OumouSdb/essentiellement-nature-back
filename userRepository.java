package com.natureapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natureapi.entities.User;

@Repository
public interface userRepository extends JpaRepository<User, Long>{

}
