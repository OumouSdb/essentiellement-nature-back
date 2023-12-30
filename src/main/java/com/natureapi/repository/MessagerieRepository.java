package com.natureapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natureapi.dto.MessagerieDto;
import com.natureapi.entities.Messagerie;

@Repository
public interface MessagerieRepository extends JpaRepository<Messagerie, Long>{

	

}
