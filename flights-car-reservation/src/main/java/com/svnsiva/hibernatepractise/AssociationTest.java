package com.svnsiva.hibernatepractise;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bellinfo.flights.dao.bills.CarBills;
import com.bellinfo.flights.dao.bills.FlightBills;
import com.bellinfo.flights.dao.flights.AccountDetails;


public class AssociationTest {
	public static void main(String[] args) {
		Parts part1 = new Parts();
			part1.setPartId("1");
			part1.setPartName("Monitor");
		Parts part2 = new Parts();
		part2.setPartId("2");
		part2.setPartName("Keyboard");
		Parts part3 = new Parts();
		part3.setPartId("3");
		part3.setPartName("Mouse");
		
		System.out.println(part1.toString()+
		part2.toString()+
		part3.toString());
		
		Set<Parts> parts=new HashSet<Parts>();
		parts.add(part1);
		parts.add(part2);
		parts.add(part3);		
		
		Products p1 = new Products(1,"Desktop",parts);
		
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    Transaction transaction = session.beginTransaction();
		
	    session.save(p1);
	    transaction.commit();
	    session.close();
	    sf.close();
		
	}

}
