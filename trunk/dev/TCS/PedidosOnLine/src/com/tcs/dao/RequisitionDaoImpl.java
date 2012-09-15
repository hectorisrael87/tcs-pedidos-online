package com.tcs.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcs.model.Article;
import com.tcs.model.Brand;
import com.tcs.model.Requisition;
import com.tcs.model.RequisitionDetail;

@Repository("orderDao")
public class RequisitionDaoImpl implements RequisitionDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void saveRequisition(Requisition requisition) {
		sessionFactory.getCurrentSession().saveOrUpdate(requisition);
		
	}
	
	public void saveRequisitionDetail (RequisitionDetail requisitionDetail){
		sessionFactory.getCurrentSession().saveOrUpdate(requisitionDetail);
	}

	@SuppressWarnings("unchecked")
	public List<Requisition> listRequisitions() {
		
		return (List<Requisition>) sessionFactory.getCurrentSession().createCriteria(Requisition.class).list();
	}


	public Requisition getRequisition(int ID) {
		Requisition requisition = (Requisition)sessionFactory.getCurrentSession().createQuery("FROM Requisition R WHERE R.requisitionId = "+ ID +"").uniqueResult();
		return  requisition ;
	}

	@SuppressWarnings("unchecked")
	public List<RequisitionDetail> listRequisitionDetailByReq(int ID) {
		List <RequisitionDetail>list =(List<RequisitionDetail>) sessionFactory.getCurrentSession().createCriteria(RequisitionDetail.class).list();
		List <RequisitionDetail>subList = new ArrayList<RequisitionDetail>();
		for (int i = 0; i < list.size(); i++) {
			if( (list.get(i)).getRequisition().getRequisitionId()==ID){
				subList.add(list.get(i));
			}
		}
		return subList;
	}
	
	

}
