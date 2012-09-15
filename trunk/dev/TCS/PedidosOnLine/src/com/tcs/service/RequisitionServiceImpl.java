package com.tcs.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.dao.RequisitionDao;
import com.tcs.model.Requisition;
import com.tcs.model.RequisitionDetail;

@Service("requisitionService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class RequisitionServiceImpl implements RequisitionService {

	@Resource
	private RequisitionDao requisitionDao;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addRequisition(Requisition requisition) {
		requisitionDao.saveRequisition(requisition);

	}
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addRequisitionDetail(RequisitionDetail requisitionDetail){
		requisitionDao.saveRequisitionDetail(requisitionDetail);
	}

	public List<Requisition> listRequisition() {

		return requisitionDao.listRequisitions();
	}

	public Requisition getRequisition(int ID) {

		return requisitionDao.getRequisition( ID);
	}

	@Override
	public List<RequisitionDetail> listRequisitionDetailByReq(int ID) {
		// TODO Auto-generated method stub
		return requisitionDao.listRequisitionDetailByReq(ID);
	}

}
