package com.offa.offer.api;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.offa.offer.bo.ExampleParser;
import com.offa.offer.bo.OfferBo;
import com.offa.offer.dao.OfferDao;
import com.offa.offer.db.Offer;

@Component
@Path("/offer")
public class OfferService {
	
	@Autowired
	ExampleParser oEx;
	
	@Autowired
	OfferBo offerBo;

	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject createProfile(JSONObject inputObj) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		Offer offer = mapper.readValue(inputObj.toString(), Offer.class);
		oEx.getStatistics();
		offerBo.save(offer);	
		String result = "Offer saved : " ;
		
		return inputObj;

	}
}
