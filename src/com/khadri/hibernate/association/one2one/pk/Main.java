package com.khadri.hibernate.association.one2one.pk;

import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		AdhaarCard card = new AdhaarCard();
		card.setAdhaarNumber("3434-2323-2313");
		card.setAddress("KADIRI");

		Citizen citizen = new Citizen();
		citizen.setName("JEEELAN");
		citizen.setAge(21);
		citizen.setAdhaarCard(card);
		
		card.setCitizen(citizen);// which is required to make available citizen object to adhaar card object

		session.save(citizen);
		 

		txn.commit();
		session.close();

	}
}
