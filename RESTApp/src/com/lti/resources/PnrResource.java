package com.lti.resources;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.lti.resources.Passenger.Gender;
import com.lti.resources.Passenger.Status;
//assume you are working for IRCTC and responsible for developing the PNR API

@Path("/pnr")
public class PnrResource {
	
	@GET
//	@Produces("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Pnr check(@QueryParam("pnrNo") int pnrNo, @Context HttpServletResponse response) {
		//enabling cors
		response.setHeader("Access-Control-Allow-Origin", "*");
		
		//for the time, we will return hardcoded data
		//in a real app, from here we will hit the DB and fetch the DB automatically
		
		Pnr pnr = new Pnr();
		pnr.setPnr(pnrNo);
		pnr.setTrainNo(12345);
		pnr.setLocaldate(LocalDate.of(2020, 12, 25));
		
		List<Passenger> passengers = new ArrayList<Passenger>();
		passengers.add(new Passenger("Aayush", Gender.MALE, Status.CONFIRMED));
		passengers.add(new Passenger("Sonu", Gender.MALE, Status.RAC));
		passengers.add(new Passenger("Arora", Gender.MALE, Status.WAITING));
		pnr.setPassenger(passengers);
		
		return pnr;
	}
}
