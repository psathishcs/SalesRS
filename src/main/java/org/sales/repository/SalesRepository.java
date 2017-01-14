package org.sales.repository;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.sales.entity.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional
public class SalesRepository {
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession(){
		return _sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<Sales> getAllSales(){
		return getSession().createQuery("from Sales").list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Sales> getSalesByProdID(Long prodID){
		return getSession().createQuery("from Sales where salesPK.prodID = :prodID").
				setParameter("prodID", prodID).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Sales> getSalesByCustID(Integer custID){
		return getSession().createQuery("from Sales where salesPK.custID = :custID").
				setParameter("custID", custID).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Sales> getSalesByTimeID(Date timeID){
		return getSession().createQuery("from Sales where salesPK.timeID = :timeID").
				setParameter("timeID", timeID).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Sales> getSalesByChannelID(Integer channelID){
		return getSession().createQuery("from Sales where salesPK.channelID = :channelID").
				setParameter("channelID", channelID).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Sales> getSalesByPromoID(Long promoID){
		return getSession().createQuery("from Sales where promoID = :promoID").
				setParameter("promoID", promoID).list();
	}

}
