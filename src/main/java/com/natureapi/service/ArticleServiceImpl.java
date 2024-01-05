package com.natureapi.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.natureapi.dto.ArticleDto;
import com.natureapi.dto.DtoTools;
import com.natureapi.dto.MessagerieDto;
import com.natureapi.entities.Article;
import com.natureapi.entities.Messagerie;
import com.natureapi.repository.ArticleRepository;
import com.natureapi.repository.MessagerieRepository;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	private ArticleRepository articleRepository;
	
	@Override
	@Transactional
	public ArticleDto save(ArticleDto aDto) {
		Article a = DtoTools.convert(aDto, Article.class);
		if(a.getId() == 0) {
			a = articleRepository.save(a);
		}else {
			a = articleRepository.saveAndFlush(a);
		}
		
		return aDto;
	}

	@Override
	public List<ArticleDto> findAll() {
		List<Article> a = articleRepository.findAll();
		List<ArticleDto> result = new ArrayList<ArticleDto>();
				
			for(Article m : a) {
				result.add(DtoTools.convert(m, ArticleDto.class));
			}
			return  result;
	}

	@Override
    public ArticleDto save(String title, MultipartFile image, String texte) {
        try {
            Article article = new Article();
            article.setTitle(title);
            article.setTexte(texte);

            if (image != null && !image.isEmpty()) {
                byte[] imageBytes = image.getBytes();
                article.setImage_name(image.getOriginalFilename()); // Sauvegarder le nom du fichier
                // Enregistrez le reste des données du fichier ou stockez-le selon vos besoins
            }

            article = articleRepository.save(article);

            return DtoTools.convert(article, ArticleDto.class);
           // return convertToDto(article); avec la methode ci dessous pour convertir
        } catch (IOException e) {
            throw new RuntimeException("Erreur lors du traitement du fichier", e);
        }
    }

//    private ArticleDto convertToDto(Article article) {
//        ArticleDto articleDto = new ArticleDto();
//        articleDto.setId(article.getId());
//        articleDto.setTitle(article.getTitle());
//        articleDto.setImage_name(article.getImage_name());
//        articleDto.setTexte(article.getTexte());
//        articleDto.setVersion(article.getVersion());
//        return articleDto;
//    }
	
	

	

}
