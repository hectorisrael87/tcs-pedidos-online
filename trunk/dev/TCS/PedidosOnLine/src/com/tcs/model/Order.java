package com.tcs.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "order")
public class Order implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "order_id", nullable = false)
	private long orderId;

	@Column(name = "order_date", nullable = false)
	private String orderDate;

	public Order() {
		
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public long getOrderId() {
		return orderId;
	}

	


}
