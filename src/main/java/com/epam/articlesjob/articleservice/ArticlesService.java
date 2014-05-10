package com.epam.articlesjob.articleservice;


import com.epam.articlesjob.Article;

import java.util.List;


public interface ArticlesService {
    void add(Article article);

    List<Article> getArticles();
}
