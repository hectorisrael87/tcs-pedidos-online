package com.tcs.dao;

import java.util.Date;
import java.util.List;

import com.tcs.model.Article;



public interface ArticleDao {
	
	public void saveArticle ( Article Article );
	
	
	public List<Article> listArticles();
}