package com.beans;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DbOperation {

	public void insert(Insurance s) {
		Configuration cfg=new Configuration();
		cfg.configure("client.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session sess=factory.openSession();
		Transaction tx=sess.beginTransaction();
		sess.save(s);
		tx.commit();
		sess.close();
		factory.close();	
}
	public boolean loginCheck(String u, String p)
	{
		String n1;
		String n2;
		int flag=0;
		Configuration cfg=new Configuration();
		cfg.configure("client.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session sess=factory.openSession();
		Transaction tx=sess.beginTransaction();

         List stu=sess.createQuery("from Insurance").list();
         for(Iterator iterator=stu.iterator();iterator.hasNext();)
         {
        	 Insurance ins=(Insurance) iterator.next();
    
        	 n1=ins.getCnumber();
        	 n2=ins.getPassword();
	
         if(n1.equalsIgnoreCase(u) && n2.equalsIgnoreCase(p)) {
        	 
        	 flag=1;
    		 break;
    	 }
    	 else {
    		 
    		 flag=0;
    	 }
         
         }
         tx.commit();
 		sess.close();
 		factory.close();
         
         if(flag==1) 
         {	 
        	 return true;
         }
         else 
         {
        	 return false;
         } 
	}

}
