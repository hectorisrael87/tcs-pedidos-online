package com.tcs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "requisitionDetail")
public class RequisitionDetail {

	@Id
	@GeneratedValue
	@Column(name = "requisitionDetail_id", nullable = false)
	private long requisitionDetailID;

	@Column(name = "requisitionDetail_date", nullable = false)
	private Date requisitionDetailDate;

	@Column(name = "requisitionDetail_total", nullable = false)
	private int requisitionDetailTotal;

	@ManyToOne
	@JoinColumn(name = "requisitiondetail_requisition")
	private Requisition requisition;

	@ManyToOne
	private Article article;

	public RequisitionDetail() {

	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Date getRequisitionDetailDate() {
		return requisitionDetailDate;
	}

	public void setRequisitionDetailDate(Date requisitionDetailDate) {
		this.requisitionDetailDate = requisitionDetailDate;
	}

	public int getRequisitionDetailTotal() {
		return requisitionDetailTotal;
	}

	public void setRequisitionDetailTotal(int requisitionDetailTotal) {
		this.requisitionDetailTotal = requisitionDetailTotal;
	}

	public Requisition getRequisition() {
		return requisition;
	}

	public void setRequisition(Requisition requisition) {
		this.requisition = requisition;
	}

	public long getRequisitionDetailID() {
		return requisitionDetailID;
	}

}
