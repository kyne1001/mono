package com.kms.quanlieu.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


@Path("/hello")
public class Hello {
	@GET
	@Path("/{parameter}")
	public Response responseMsg( @PathParam("parameter") String parameter,
			@DefaultValue("Nothing to say") @QueryParam("value") String value) {

		String output = "Hello from: " + parameter + " : " + value;

		return Response.status(200).entity(output).build();
	}
}
