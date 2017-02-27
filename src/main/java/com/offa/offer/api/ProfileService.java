package com.offa.offer.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/profile")
public class ProfileService {
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTrackInJSON() {

		String result = "Prack saved : " ;
		
		return Response.status(201).entity(result).build();

	}
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createProfile() {

		String result = "Prack saved : " ;
		
		return Response.status(201).entity(result).build();

	}

}
