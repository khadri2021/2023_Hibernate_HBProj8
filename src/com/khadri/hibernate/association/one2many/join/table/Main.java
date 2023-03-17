package com.khadri.hibernate.association.one2many.join.table;

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
		
		Set<Store2> set = new HashSet<>();
		Store2 store1= new Store2();
		store1.setGstNumber(1234);
		store1.setLocation("Electronic city");
		store1.setName("BLR Brewing Co - Electronic City");
		
		Store2 store2= new Store2();
		store2.setGstNumber(323424);
		store2.setLocation("Sarjapura main road");
		store2.setName("BLR Brewing Co - Sarjapura");
		
		
		set.add(store1);
		set.add(store2);
		
		
		Merchant2 merchant = new Merchant2();
		merchant.setName("BLR Brewing Co");
		merchant.setOwner("BLR");
		merchant.setStores(set);
		
		store1.setMerchant(merchant);
		store2.setMerchant(merchant);
		
		session.save(merchant);
		
		txn.commit();
		session.close(); 
		factory.close();
		
		
		
	}
}
