package com.lti.resources;

import java.time.LocalDate;
import java.util.List;

public class Pnr {
	private int pnr;
	private int trainNo;
	private LocalDate travelDate;
	private List<Passenger> passenger;
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public LocalDate getLocaldate() {
		return travelDate;
	}
	public void setLocaldate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}
	public List<Passenger> getPassenger() {
		return passenger;
	}
	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}
	public Pnr(int pnr, int trainNo, LocalDate travelDate) {
		super();
		this.pnr = pnr;
		this.trainNo = trainNo;
		this.travelDate = travelDate;
	}
	
	public Pnr() {}
}
