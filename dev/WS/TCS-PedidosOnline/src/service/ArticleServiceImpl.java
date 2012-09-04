package service;

import java.util.ArrayList;
import java.util.List;

import model.Article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("articleService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ArticleServiceImpl implements ArticleService {

	// @Autowired
	//private ArticleDao articleDao;

	public ArticleServiceImpl() {
	}

	public List<Article> listArticles() {
		Article a = new Article();
		a.setArticleBrand("Nike");
		a.setArticleDesc("Zapatilla roja");
		a.setArticleName("Zapatilla");
		a.setArticlePrice("234");
		Article b = new Article();
		b.setArticleBrand("Adidas");
		b.setArticleDesc("Zapatilla negra");
		b.setArticleName("Zapatilla");
		b.setArticlePrice("654");
		List<Article> list = new ArrayList<Article>();
		list.add(a);
		list.add(b);
		return list;
	}

}