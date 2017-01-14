 package org.sales.repository;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.sales.entity.Channels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ChannelsRepository {
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession(){
		return _sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<Channels> getAllChannels(){
		return getSession().createQuery("from Channels").list();
	}
	
	public Channels getChannelsByID(Integer channelID) {
		return (Channels) getSession().createQuery("from Channels where channelID = :channelID").
				setParameter("channelID", channelID).uniqueResult();
	}
}
