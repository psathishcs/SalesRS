package org.sales.repository;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.sales.entity.Times;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TimesRepository {
	
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession() {
		return _sessionFactory.getCurrentSession();
	}
	@SuppressWarnings("unchecked")
	public List<Times> getAllTimes(){
		System.out.println("===========================>  " + getSession().getEntityName(Times.class));
		return getSession().createQuery("From Times").list();
	}
	
	public Times getTimesByID(Date timeID) {
		return (Times) getSession().createQuery("From Times where timeID = :timeID").
				setParameter("timeID", timeID).uniqueResult();
	}
	

}
