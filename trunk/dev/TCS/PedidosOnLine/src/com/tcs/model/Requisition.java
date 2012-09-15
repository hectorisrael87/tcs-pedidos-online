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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "requisition")
public class Requisition {

	@Id
	@GeneratedValue
	@Column(name = "requisition_id", nullable = false)
	private int requisitionId;
	
	@Column(name = "requisition_date", nullable = false)
	private Date requisitionDate;
	
	@OneToMany(mappedBy = "requisition", cascade = CascadeType.ALL)
	// EAGER indica que al momento de recuperar de la base de datos a la marca
	// se traen sus articulos.
	private List<RequisitionDetail> listRequisitionDetail = new ArrayList<RequisitionDetail>();
	
	
	
	
	public Requisition() {		
	}
	public Date getRequisitionDate() {
		return requisitionDate;
	}
	public void setRequisitionDate(Date requisitionDate) {
		this.requisitionDate = requisitionDate;
	}
	public int getRequisitionId() {
		return requisitionId;
	}
	

	
	
	}
