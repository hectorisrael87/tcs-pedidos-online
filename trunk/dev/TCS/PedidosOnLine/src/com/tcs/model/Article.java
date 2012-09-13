package com.tcs.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@Column(name = "article_price", nullable = false)
	private long articlePrice;
	
	@ManyToOne 
	@JoinColumn(name= "article_brand")
	private Brand articleBrand;
	
	public Article() {		
	}
	
	public Long getArticleId() {
		return articleId;
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

	public long getArticlePrice() {
		return articlePrice;
	}

	public void setArticlePrice(long articlePrice) {
		this.articlePrice = articlePrice;
	}

	public Brand getArticleBrand() {
		return articleBrand;
	}

	public void setArticleBrand(Brand articleBrand) {
		this.articleBrand = articleBrand;
	}
	
	@Override
	public String toString() {
		
		return this.articleBrand.getBrandName();
	}

	
}
