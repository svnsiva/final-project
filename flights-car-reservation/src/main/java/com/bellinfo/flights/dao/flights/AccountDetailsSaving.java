package com.bellinfo.flights.dao.flights;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bellinfo.flights.dao.bills.CarBills;
import com.bellinfo.flights.dao.bills.FlightBills;

public class AccountDetailsSaving {
	
	public void enteringAccountData(AccountDetails account){
	
   
    Configuration cfg = new Configuration().configure().addAnnotatedClass(AccountDetails.class)
    		.addAnnotatedClass(CarBills.class).addAnnotatedClass(FlightBills.class);
    SessionFactory sf = cfg.buildSessionFactory();
    Session session = sf.openSession();
    Transaction transaction = session.beginTransaction();
    session.save(account);
    transaction.commit();
    session.close();
    }
}
