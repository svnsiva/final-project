package com.svnsiva.hibernatepractise;

import java.util.Set;

public class Products {
	private String prName;
	private Integer prId;
	private Set<Parts> parts;

	public Products(Integer prId,String prName, Set<Parts> parts) {
		super();
		this.prId=prId;
		this.prName = prName;
		this.parts = parts;
	}
	
	public Integer getPrId() {
		return prId;
	}
	public void setPrId(Integer prId) {
		this.prId = prId;
	}
	public Products() {
		// TODO Auto-generated constructor stub
	}
	public Set<Parts> getParts() {
		return parts;
	}
	public String getPrName() {
		return prName;
	}
	public void setParts(Set<Parts> parts) {
		this.parts = parts;
	}
	
	public void setPrName(String prName) {
		this.prName = prName;
	}
}
