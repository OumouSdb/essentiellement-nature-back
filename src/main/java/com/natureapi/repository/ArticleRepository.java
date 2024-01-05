package com.natureapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.natureapi.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{

	

	

}
