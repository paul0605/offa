package com.offa.offer.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.offa.offer.db.Offer;

public class OfferDaoImpl extends AbstractDao implements OfferDao {

	public OfferDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	
	public void save(Offer offer) {
		persist(offer);

	}

	
	/*public void update(Offer offer) {
		getHibernateTemplate().update(offer);

	}

	
	public void delete(Offer offer) {
		getHibernateTemplate().delete(offer);
	}

	
	public Offer findOffer(String offerId) {
		List list = getHibernateTemplate().find(
                "from Stock where stockCode=?",offerId
          );
		return (Offer)list.get(0);
	}*/

}
