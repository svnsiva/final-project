package com.bellinfo.flights.dao.flights;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.bellinfo.flights.dao.bills.CarBills;
import com.bellinfo.flights.dao.bills.FlightBills;

@Entity
public class AccountDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String firstname;
	
	private String lastName;

	private int age;
	
	private String email;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<CarBills> cb = new ArrayList<CarBills>();
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<FlightBills> fb = new ArrayList<FlightBills>();
	
	public List<CarBills> getCb() {
		return cb;
	}
	public void setCb(List<CarBills> cb) {
		this.cb = cb;
	}
	public List<FlightBills> getFb() {
		return fb;
	}
	public void setFb(List<FlightBills> fb) {
		this.fb = fb;
	}
	
	private String username;
	
	private String password;
	
	private String gender;
	
	private String number;
	public int getId() {
		return id;
	}
	
	public AccountDetails(){
		
	}
	
	
	public AccountDetails(String firstname, String lastName, int age,
			String email, String username, String password, String gender,
			String number) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.number = number;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "AccountDetails [firstname=" + firstname + ", lastName="
				+ lastName + ", age=" + age + ", email=" + email
				+ ", username=" + username + ", password=" + password
				+ ", gender=" + gender + ", number=" + number + "]";
	}
	
	
}
