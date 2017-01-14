package org.sales.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.sales.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProductsRepository {
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession(){
		return _sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<Products> getAllProducts(){
		return getSession().createQuery("from Products").list();
	}
	
	public Products getProductsByID(Long prodID) {
		return (Products) getSession().createQuery("from Products where prodID = :prodID").
				setParameter("prodID", prodID).uniqueResult();
	}
	
	public Products getProductsByName(String prodName) {
		return (Products) getSession().createQuery("from Products where prodName = :prodName").
				setParameter("prodName", prodName).uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Products> getProductsBySubCategory(String prodSubCategory) {
		return getSession().createQuery("from Products where prodSubCategory = :prodSubCategory").
				setParameter("prodSubCategory", prodSubCategory).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Products> getProductsByCategory(String prodCategory) {
		return getSession().createQuery("from Products where prodCategory = :prodCategory").
				setParameter("prodCategory", prodCategory).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Products> getProductsByPriceRange(Double minPrice, Double maxPrice ) {
		return getSession().createQuery("from Products where prodListPrice >= :minPrice and prodListPrice <= :maxPrice").
				setParameter("minPrice", minPrice).
				setParameter("maxPrice", maxPrice).
				list();
	}
}
