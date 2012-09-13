package com.tcs.service;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.dao.ArticleDao;
import com.tcs.model.Article;

@Service("articleService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ArticleServiceImpl implements ArticleService {

	@Resource
	private ArticleDao articleDao;

	public ArticleServiceImpl() {
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addArticle(Article article) {
		articleDao.saveArticle(article);
	}

	public List<Article> listArticles() {
		return articleDao.listArticles();
	}
	
	public List<Article> listArticlesByBrand(int ID) {
		return articleDao.listArticlesByBrand(ID);
	}

}