package com.khadri.hibernate.association.one2one.fk;

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

		Person person = new Person();
		person.setName("ALLEN");
		person.setAge(25);

		PhoneNumber pn1 = new PhoneNumber();
		pn1.setProvider("AIRTEL");
		pn1.setNumber("7330866400");
		pn1.setPerson(person);

		session.save(pn1);

		txn.commit();
		session.close();
	}
}
