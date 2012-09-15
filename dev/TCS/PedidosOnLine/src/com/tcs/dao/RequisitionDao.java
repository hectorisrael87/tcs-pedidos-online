package com.tcs.dao;

import java.util.List;

import com.tcs.model.Brand;
import com.tcs.model.Requisition;
import com.tcs.model.RequisitionDetail;

public interface RequisitionDao {

	public void saveRequisition (Requisition order);
	
	public void saveRequisitionDetail (RequisitionDetail requisitionDetail);
	
	public List<Requisition> listRequisitions();

	public Requisition getRequisition(int ID);
	
	public List<RequisitionDetail> listRequisitionDetailByReq(int ID);
}
