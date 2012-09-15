package com.tcs.dao;

import java.util.List;

import com.tcs.model.Article;

public interface ArticleDao {

	public void saveArticle(Article Article);

	public List<Article> listArticles();

	public List<Article> listArticlesByBrand(int ID);

	public Article getArticle(int ID);
}