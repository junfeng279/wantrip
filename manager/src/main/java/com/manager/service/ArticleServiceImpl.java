package com.manager.service;


import com.manager.domain.Article;
import com.manager.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by junfeng on 17-8-27.
 */
@Service
public class ArticleServiceImpl  implements ArticleService{
    @Autowired
    private ArticleRepository articleRepository;
    @Override
    public List<Article> getAllArticles() {
        List<Article> articles = (List<Article>) articleRepository.findAll();
        return articles;
    }

    @Override
    public Article findArticleByName(String name) {
        Article existing = articleRepository.findOne(name);
        return existing;
    }

    @Override
    public boolean createArticle(Article article) throws Exception {
        Article existing = articleRepository.findOne(article.getName());
        if(existing!=null){
            throw new Exception("user already exists: " + article.getName());
        }
        articleRepository.save(article);
        return false;
    }
}
