package com.tcs.dao;


import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcs.model.Article;

@Repository("articleDao")
public class ArticleDaoImpl implements ArticleDao {

	@Autowired
	private SessionFactory sessionFactory;

	
	public void saveArticle(Article article) {
		sessionFactory.getCurrentSession().saveOrUpdate(article);
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Article> listArticles() {		
		return (List<Article>) sessionFactory.getCurrentSession().createCriteria(Article.class).list();
	}
}