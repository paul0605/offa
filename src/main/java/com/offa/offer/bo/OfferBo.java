package com.offa.offer.bo;

import com.offa.offer.db.Offer;

public interface OfferBo {

	public void save(Offer offer) ;
	public void update(Offer offer);
	public void delete(Offer offer);
	public Offer findOffer(String offerId);
	
}
