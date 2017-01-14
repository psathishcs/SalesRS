package org.sales.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.sales.entity.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CustomersRepository {
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession(){
		return _sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<Customers> getAllCustomers(){
		return getSession().createQuery("from Customers").list();
	}
	
	public Customers getCustomersByID(Long custID) {
		return (Customers) getSession().createQuery("from Customers where custID = :custID").
				setParameter("custID", custID).uniqueResult();
	}
	
/*	@SuppressWarnings("unchecked")
	public List<Customers> getByLocationID(Integer locationID){
		return getSession().createQuery("from Departments where locationID = :locationID").
				setParameter("locationID", locationID).list();
	}*/

}
