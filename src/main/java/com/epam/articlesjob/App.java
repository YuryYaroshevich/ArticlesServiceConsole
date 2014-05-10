package com.epam.articlesjob;

import com.epam.articlesjob.articleservice.ArticlesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        ArticlesService articlesService = context.getBean(ArticlesService.class);

        articlesService.add(new Article("title1", "text1"));
        articlesService.add(new Article("title2", "text2"));
        articlesService.add(new Article("title3", "text3"));

        List<Article> articles = articlesService.getArticles();
        for (Article article : articles) {
            System.out.println(article);
        }
    }
}
