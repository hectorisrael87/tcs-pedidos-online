package com.tcs.service;

import java.util.List;
import com.tcs.model.Requisition;
import com.tcs.model.RequisitionDetail;

public interface RequisitionService {

	public void addRequisitionDetail(RequisitionDetail requisitionDetail);

	public void addRequisition(Requisition requisition);
	
	public List<Requisition> listRequisition();

	public Requisition getRequisition(int ID);

	public List<RequisitionDetail> listRequisitionDetailByReq(int ID);
}
