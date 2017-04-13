package com.offa.offer.api;

import java.io.IOException;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONObject;

import com.offa.offer.bo.OfferBo;
import com.offa.offer.bo.OfferBoImpl;
import com.offa.offer.db.Offer;

@Path("/offer")
public class OfferService {
	
	@Resource
	OfferBo offerBo = new OfferBoImpl();

	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject createProfile(JSONObject inputObj) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		Offer offer = mapper.readValue(inputObj.toString(), Offer.class);
		offerBo.save(offer);	
		String result = "Offer saved : " ;
		
		return inputObj;

	}
}
