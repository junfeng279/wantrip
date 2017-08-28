package com.manager.repository;

import com.manager.domain.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by junfeng on 17-8-27.
 */
@Repository
public interface ArticleRepository extends CrudRepository<Article, String>{

}
