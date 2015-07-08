package com.snehaprojects.in;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class storeData {
	
	 public static void main(String[] args) { 
		 EmpDetails emp = new EmpDetails();
		 emp.setName("Sneha");
		 
		 EmpDetails emp1 = new EmpDetails();
		 emp1.setName("Giridhar");
		 
		 SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
	     Session session = sessionfactory.openSession();
	     Transaction t = session.beginTransaction();
	     
	     session.save(emp);
	     session.save(emp1);
	     
	     t.commit();
	 	 session.close();
	 }
}
