package com.offa.offer.bo;

import com.offa.offer.dao.OfferDao;
import com.offa.offer.db.Offer;

public class OfferBoImpl implements OfferBo {
	
	OfferDao offerDao;

	

	public OfferDao getOfferDao() {
		return offerDao;
	}

	public void setOfferDao(OfferDao offerDao) {
		this.offerDao = offerDao;
	}

	@Override
	public void save(Offer offer) {
		offerDao.save(offer);
		
	}

	@Override
	public void update(Offer offer) {
		offerDao.update(offer);
		
	}

	@Override
	public void delete(Offer offer) {
		offerDao.delete(offer);
		
	}

	@Override
	public Offer findOffer(String offerId) {
		return offerDao.findOffer(offerId);
	}

}
