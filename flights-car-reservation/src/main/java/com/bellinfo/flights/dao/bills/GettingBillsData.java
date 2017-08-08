package com.bellinfo.flights.dao.bills;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bellinfo.flights.controller.LoginController;
import com.bellinfo.flights.dao.flights.AccountDetails;

public class GettingBillsData {
	public AccountDetails data(){
		Configuration cfg = new Configuration().configure().addAnnotatedClass(AccountDetails.class)
				.addAnnotatedClass(FlightBills.class).addAnnotatedClass(CarBills.class);
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    Transaction transaction = session.beginTransaction();
	    Query query = session.createQuery("from AccountDetails ");
	    List list = query.list();
	    AccountDetails ad = null;
	    for(int i=0;i<list.size();i++){
	    	AccountDetails ad2=(AccountDetails) list.get(i);
	    	if(ad2.getId()==LoginController.logedAd.getId()){
	    		ad=ad2;
	    		
	    	}
	    }
	    
	    return ad;
	}
}
