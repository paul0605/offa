package com.offa.offer.bo;

import com.offa.offer.db.Offer;

public interface OfferBo {

	void save(Offer offer);
	void update(Offer offer);
	void delete(Offer offer);
	Offer findOffer(String offerId);
	
}
