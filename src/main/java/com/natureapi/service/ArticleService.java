package com.natureapi.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.natureapi.dto.ArticleDto;
import com.natureapi.entities.Article;



public interface ArticleService {
	
	public ArticleDto save(ArticleDto aDto);
	public List<ArticleDto> findAll();
	
	
public ArticleDto save(String title, MultipartFile image, String texte);
	//public ArticleDto save(String formData);
	
}
