package com.details.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flightreport")
public class FlightReport {
	@Id
	private int flightnumber;
	private int noofticketsbooked;
	private String flightstatus;
	
	public FlightReport(int flightnumber, int noofticketsbooked, String flightstatus) {
		super();
		this.flightnumber = flightnumber;
		this.noofticketsbooked = noofticketsbooked;
		this.flightstatus = flightstatus;
	}
	public FlightReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightReport(String string, int i, int j) {
		// TODO Auto-generated constructor stub
	}
	public FlightReport(int i) {
		// TODO Auto-generated constructor stub
	}
	public FlightReport(String string) {
		// TODO Auto-generated constructor stub
	}
	public int getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(int flightnumber) {
		this.flightnumber = flightnumber;
	}
	public int getNoofticketsbooked() {
		return noofticketsbooked;
	}
	public void setNoofticketsbooked(int noofticketsbooked) {
		this.noofticketsbooked = noofticketsbooked;
	}
	public String getFlightstatus() {
		return flightstatus;
	}
	public void setFlightstatus(String flightstatus) {
		this.flightstatus = flightstatus;
	}
	@Override
	public String toString() {
		return "FlightReport [flightnumber=" + flightnumber + ", noofticketsbooked=" + noofticketsbooked
				+ ", flightstatus=" + flightstatus + "]";
	}
	
	
}