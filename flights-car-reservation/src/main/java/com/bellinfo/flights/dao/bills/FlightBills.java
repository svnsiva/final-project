package com.bellinfo.flights.dao.bills;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.bellinfo.flights.model.FlightDetails;

@Entity
public class FlightBills {
	
	private String name;
	@Id
	private String card; 
	private String phone; 
	private String mm; 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMm() {
		return mm;
	}
	public void setMm(String mm) {
		this.mm = mm;
	}
	public String getYy() {
		return yy;
	}
	public void setYy(String yy) {
		this.yy = yy;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	private String yy;
	private String cvv; 
	private String amount;
	@Embedded
	private FlightDetails fd;
	
	public FlightDetails getFd() {
		return fd;
	}
	public void setFd(FlightDetails fd) {
		this.fd = fd;
	}
	public FlightBills() {
		// TODO Auto-generated constructor stub
	}
	
	
}
