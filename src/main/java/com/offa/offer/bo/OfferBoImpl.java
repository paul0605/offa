package com.offa.offer.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.offa.offer.dao.OfferDao;
import com.offa.offer.db.Offer;

@Component
public class OfferBoImpl implements OfferBo {
	
	@Autowired
	OfferDao offerDao;

	

	public OfferDao getOfferDao() {
		return offerDao;
	}

	public void setOfferDao(OfferDao offerDao) {
		this.offerDao = offerDao;
	}

	
	public void save(Offer offer) {
		offerDao.save(offer);
		
	}

	
	public void update(Offer offer) {
		//offerDao.update(offer);
		
	}

	
	public void delete(Offer offer) {
		//offerDao.delete(offer);
		
	}

	
	public Offer findOffer(String offerId) {
		//return offerDao.findOffer(offerId);
		return null;
	}

}
