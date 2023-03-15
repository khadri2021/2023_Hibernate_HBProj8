package com.khadri.hibernate.association.one2many.fk;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		Store store1 = new Store();
		store1.setGstNumber(1234);
		store1.setLocation("KADIRI");
		store1.setName("KADIR-BYPASS");
		

		Store store2 = new Store();
		store2.setGstNumber(5678);
		store2.setLocation("GORANTLA");
		store2.setName("GORANTLA-BYPASS");

		Set<Store> set = new HashSet<>();
		set.add(store1);
		set.add(store2);

		Merchant merchant = new Merchant();
		merchant.setName("RELIENCE-TRENDS");
		merchant.setOwner("AMBANI");
		merchant.setStores(set);

		store1.setMerchant(merchant);
		store2.setMerchant(merchant);
		
		session.save(merchant);

		txn.commit();
		session.close();
		factory.close();
	}
}
