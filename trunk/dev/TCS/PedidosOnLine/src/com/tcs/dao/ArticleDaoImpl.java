package com.tcs.dao;


import java.util.ArrayList;
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
	
	@SuppressWarnings("unchecked")
	public List<Article> listArticlesByBrand(int ID) {	
		//(List<Article>) sessionFactory.getCurrentSession().createCriteria("FROM Article A WHERE A.articleId =7");
		List <Article>list =(List<Article>) sessionFactory.getCurrentSession().createCriteria(Article.class).list();
		List <Article>subList = new ArrayList<Article>();
		for (int i = 0; i < list.size(); i++) {
			if( (list.get(i)).getArticleBrand().getBrandId()==ID){
				subList.add(list.get(i));
			}
		}
		return subList;
	}
	
}