package com.tcs.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order implements Serializable{

	@Id
	@GeneratedValue
	@Column(name = "order_id")
	private long id;
	
	@Column(name = "order_date", nullable = false)
	private Date date;
	
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	// EAGER indica que al momento de recuperar de la base de datos al pedido se trae a todas las relaciones
	private List<OrderDetail> orderDetail = new ArrayList<OrderDetail>();


	public Order() {
		super();
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public List<OrderDetail> getOrderDetail() {
		return orderDetail;
	}


	public void setOrderDetail(List<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}


	public long getId() {
		return id;
	}

	
}
