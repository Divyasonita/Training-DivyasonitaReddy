package com.hybernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cf = new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Student ronak = new Student();
		ronak.setId(01);
		ronak.setName("Divya  ");
		ronak.setAge("21");
		ronak.setMarks("98");
		
		Transaction tx = se.beginTransaction();
		se.save(ronak);
		tx.commit();
		
		se.close();
		sf.close();
	}


}
