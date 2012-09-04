package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article {

	@Id
	@GeneratedValue
	@Column(name = "article_id")
	private Long articleId;

	@Column(name = "article_name", nullable = false, length=20)
	private String articleName;

	@Column(name = "article_desc", nullable = false)
	private String articleDesc;
	
	@Column(name = "article_price")
	private String articlePrice;
	
	@Column(name = "article_brand")
	private String articleBrand;
	
	public Article() {		
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getArticleDesc() {
		return articleDesc;
	}

	public void setArticleDesc(String articleDesc) {
		this.articleDesc = articleDesc;
	}

	public String getArticlePrice() {
		return articlePrice;
	}

	public void setArticlePrice(String articlePrice) {
		this.articlePrice = articlePrice;
	}

	public String getArticleBrand() {
		return articleBrand;
	}

	public void setArticleBrand(String articleBrand) {
		this.articleBrand = articleBrand;
	}

	public Long getArticleId() {
		return articleId;
	}
	
	
}
