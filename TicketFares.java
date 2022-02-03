package com.details.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ticketfares")
public class TicketFares {
	@Id
	private int flightnumber;
	private int Economy;
	private int premium;
	private int business;

	
	public int getFlightnumber() {
		return flightnumber;
	}
	public TicketFares(int flightnumber, int economy, int premium, int business) {
	super();
	this.flightnumber = flightnumber;
	Economy = economy;
	this.premium = premium;
	this.business = business;
}
	
	public TicketFares() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setFlightnumber(int flightnumber) {
		this.flightnumber = flightnumber;
	}
	public int getEconomy() {
		return Economy;
	}
	public void setEconomy(int economy) {
		Economy = economy;
	}
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	public int getBusiness() {
		return business;
	}
	public void setBusiness(int business) {
		this.business = business;
	}
	@Override
	public String toString() {
		return "TicketFares [flightnumber=" + flightnumber + ", Economy=" + Economy + ", premium=" + premium
				+ ", business=" + business + "]";
	}
	

}
