package org.sales.repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.sales.entity.Promotions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class PromotionsRepository {
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession(){
		return _sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<Promotions> getAllPromotions(){
		return getSession().createQuery("from Promotions").list();
	}
	
	public Promotions getPromotionsByID(Long promoID) {
		return (Promotions) getSession().createQuery("from Promotions where promoID = :promoID").
				setParameter("promoID", promoID).uniqueResult();
	}
	
	public Promotions getPromotionsByName(String promoName) {
		return (Promotions) getSession().createQuery("from Promotions where promoName = :promoName").
				setParameter("promoName", promoName).uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Promotions> getPromotionsBySubCategory(String promoSubCategory){
		return getSession().createQuery("from Promotions where promoSubCategory = :promoSubCategory").
				setParameter("promoSubCategory", promoSubCategory).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Promotions> getPromotionsByCategory(String promoCategory){
		return getSession().createQuery("from Promotions where promoCategory = :promoCategory").
				setParameter("promoCategory", promoCategory).list();
	}
}
