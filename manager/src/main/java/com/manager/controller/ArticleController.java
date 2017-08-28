package com.manager.controller;


import com.manager.domain.Article;
import com.manager.domain.ResultData;
import com.manager.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by junfeng on 17-8-27.
 */
@RestController
@RequestMapping("/manager")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public ResultData createArticle(@RequestParam(value = "article")Article article) {
        ResultData result = new ResultData();
        if(article!=null){
            article.setCreateDate(new Date());
            try {
                if(articleService.createArticle(article)){
                    result.setData("success");
                }else{
                    result.setData("fail");
                }
            } catch (Exception e) {
                result.setData("fail");
                e.printStackTrace();
            }
        }
        return result;
    }

    @RequestMapping(value="/getAll", method=RequestMethod.GET)
    @ResponseBody
    public ResultData getAllArticles(){
        ResultData result = new ResultData();
        List<Article> artices = articleService.getAllArticles();
        result.setData(artices);
        return result;
    }
    @RequestMapping(value = "/queryByName", method = RequestMethod.POST)
    @ResponseBody
    public ResultData queryArticleByName(@RequestParam(value = "name")String name){
        ResultData result = new ResultData();
        Article article = articleService.findArticleByName(name);
        result.setData(article);
        return result;
    }
}
