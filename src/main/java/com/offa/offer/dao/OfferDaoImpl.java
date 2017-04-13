package com.offa.offer.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.offa.offer.db.Offer;

public class OfferDaoImpl extends HibernateDaoSupport implements OfferDao {

	public OfferDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Offer offer) {
		getHibernateTemplate().save(offer);

	}

	@Override
	public void update(Offer offer) {
		getHibernateTemplate().update(offer);

	}

	@Override
	public void delete(Offer offer) {
		getHibernateTemplate().delete(offer);
	}

	@Override
	public Offer findOffer(String offerId) {
		List list = getHibernateTemplate().find(
                "from Stock where stockCode=?",offerId
          );
		return (Offer)list.get(0);
	}

}
