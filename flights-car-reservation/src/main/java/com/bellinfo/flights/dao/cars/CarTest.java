package com.bellinfo.flights.dao.cars;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CarTest {
	
	public void enteringCarData(){
	
    Car c1 = new Car("Economy","Toyota Camry","28",16.99);
    Car c2 = new Car("Compact","Ford Focus","28",19.99);
    Car c3 = new Car("Fullsize","Nissan Altima","26",34.99);
    Car c4 = new Car("Premium","Ford Mustang","32",42.99);
    Configuration cfg = new Configuration().configure().addAnnotatedClass(Car.class);
    SessionFactory sf = cfg.buildSessionFactory();
    Session session = sf.openSession();
    Transaction transaction = session.beginTransaction();
    session.save(c1);
    session.save(c2);
    session.save(c3);
    session.save(c4);
    transaction.commit();
    session.close();
    
	}
	
	public List gettingCarData(){
		
		 Configuration cfg = new Configuration().configure().addAnnotatedClass(Car.class);
		    SessionFactory sf = cfg.buildSessionFactory();
		    Session session = sf.openSession();
		    Transaction transaction = session.beginTransaction();
		    Query query = session.createQuery("from Car");
		    List list = query.list();
		    		
		
		    return list;
	}	    
	}
