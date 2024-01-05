package com.natureapi.controller;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.natureapi.dto.ArticleDto;
import com.natureapi.dto.MessagerieDto;
import com.natureapi.entities.Article;
import com.natureapi.entities.Messagerie;
import com.natureapi.repository.MessagerieRepository;
import com.natureapi.service.ArticleService;
import com.natureapi.service.MessagerieService;

@RestController
@RequestMapping("/article")
@CrossOrigin
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	
	@PostMapping("/save")
    public ResponseEntity<ArticleDto> saveArticle(
            @RequestParam("title") String title,
            @RequestParam("image") MultipartFile image,
            @RequestParam("texte") String texte) {
        
        ArticleDto savedArticle = articleService.save(title, image, texte);

        return ResponseEntity.ok(savedArticle);
    }
	 
	@GetMapping(produces = "application/json")
	public List<ArticleDto> findAll() throws Exception{
		
		return articleService.findAll();
	}

}
