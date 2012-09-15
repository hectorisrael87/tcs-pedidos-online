package com.tcs.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue(value="CL")
public class Client extends User{

	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Requisition> listRequisition = new ArrayList<Requisition>();

	public Client() {
		
	}

	public Client(long userId, String username, String password,
			String firstName, String lastName, boolean valid,
			Permission permission, List<Requisition> listReq) {
		super(userId, username, password, firstName, lastName, valid, permission);
		this.listRequisition =listReq;
	}

	public List<Requisition> getListRequisition() {
		return listRequisition;
	}

	public void setListRequisition(List<Requisition> listRequisition) {
		this.listRequisition = listRequisition;
	}

	


	
	
	
}
