package com.epam.articlesjob.articleservice;

import com.epam.articlesjob.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
class ArticleServiceMemoryStorage implements ArticlesService {
    private List<Article> articles;

    ArticleServiceMemoryStorage() {
        this.articles = new ArrayList<Article>();
    }

    @Override
    public void add(Article article) {
        articles.add(article);
    }

    @Override
    public List<Article> getArticles() {
        return articles;
    }
}
