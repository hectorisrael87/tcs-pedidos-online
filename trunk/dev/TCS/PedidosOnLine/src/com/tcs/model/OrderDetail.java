package com.tcs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderDetail")
public class OrderDetail {

	@Id
	@GeneratedValue
	@Column(name = "order_detail_id")
	private long id;
	
	@Column(name = "order_detail_quantity")
	private int quantity;
	
	@Column(name = "order_detail_subtotal")
	private float subtotal;

	public OrderDetail() {
		
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public long getId() {
		return id;
	}	

}
