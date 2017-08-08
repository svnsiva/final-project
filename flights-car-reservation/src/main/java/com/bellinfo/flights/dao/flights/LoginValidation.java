package com.bellinfo.flights.dao.flights;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bellinfo.flights.dao.bills.CarBills;
import com.bellinfo.flights.dao.bills.FlightBills;
import com.bellinfo.flights.dao.cars.Car;

public class LoginValidation {
	
	public AccountDetails login(String username,String password){
		AccountDetails ad = new AccountDetails();
		Configuration cfg = new Configuration().configure().addAnnotatedClass(AccountDetails.class)
				.addAnnotatedClass(CarBills.class).addAnnotatedClass(FlightBills.class);
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    Transaction transaction = session.beginTransaction();
	    Query query = session.createQuery("from AccountDetails ");
	    List list = query.list();
	    for(int i=0;i<list.size();i++){
	    	ad=(AccountDetails) list.get(i);
	    	if(ad.getUsername().equalsIgnoreCase(username) && ad.getPassword().equalsIgnoreCase(password)){
	    		
	    		return ad;
	    	}
	    }
	    transaction.commit();
	    session.close();
	    return null;
	}
	
}
