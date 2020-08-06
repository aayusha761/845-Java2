package com.lti.resources;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/hello")
public class HelloResource {

//	@GET
//	public String hello(@QueryParam("name") String name) {
//		return "Hello "+name+", Welcome";
//	}
	
//	@Path("/{name}")
//	@GET
//	public String hello(@PathParam("name") String name) {
//		return "Hello "+name+", Welcome";
//	}
	
	@GET
//	@Path("/{name}")
	public String hello(@MatrixParam("name") String name) {
		return "Hello "+name+", Welcome";
	}
}