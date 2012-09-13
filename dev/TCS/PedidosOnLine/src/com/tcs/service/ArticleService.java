package com.tcs.service;

import java.util.List;

import com.tcs.model.Article;


public interface ArticleService {

	public void addArticle(Article article);

	public List<Article> listArticles();
	
	public List<Article> listArticlesByBrand(int ID);
}