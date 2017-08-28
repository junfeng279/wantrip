package com.manager.service;



import com.manager.domain.Article;

import java.util.List;

/**
 * Created by junfeng on 17-8-27.
 */
public interface ArticleService {
    public List<Article> getAllArticles();

    public Article findArticleByName(String name);

    public boolean createArticle(Article article) throws Exception;
}
