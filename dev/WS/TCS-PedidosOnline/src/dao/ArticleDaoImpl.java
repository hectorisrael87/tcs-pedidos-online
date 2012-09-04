package dao;



import java.util.List;

import model.Article;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("articleDao")
public class ArticleDaoImpl implements ArticleDao {

	@Autowired
//	private SessionFactory sessionFactory;

	// To Save the article detail
//	public void saveArticle(Article article) {
//		sessionFactory.getCurrentSession().saveOrUpdate(article);
//	}
//	
	// To get list of all articles
	@SuppressWarnings("unchecked")
	public List<Article> listArticles() {		
		//return (List<Article>) sessionFactory.getCurrentSession().createCriteria(Article.class).list();
	    return null;
	
	}
}