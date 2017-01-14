package org.sales.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.sales.entity.Countries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CountriesRepository {
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession(){
		return _sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<Countries> getAllCountries(){
		return getSession().createQuery("from Countries").list();
	}
	
	public Countries getCountriesByID(Integer countryID) {
		return (Countries) getSession().createQuery("from Countries where countryID = :countryID").
				setParameter("countryID", countryID).uniqueResult();
	}
	public Countries getCountriesByISOCode(String countryISOCode) {
		return (Countries) getSession().createQuery("from Countries where countryISOCode = :countryISOCode").
				setParameter("countryISOCode", countryISOCode).uniqueResult();
	}
	
	public Countries getCountriesByName(String countryName) {
		return (Countries) getSession().createQuery("from Countries where countryName = :countryName").
				setParameter("countryName", countryName).uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Countries> getCountriesByCountrySubRegion(String countrySubRegion){
		return getSession().createQuery("from Countries where countrySubRegion = :countrySubRegion").
				setParameter("countrySubRegion", countrySubRegion).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Countries> getCountriesByCountryRegion(String countryRegion){
		return getSession().createQuery("from Countries where countryRegion = :countryRegion").
				setParameter("countryRegion", countryRegion).list();
	}


}
