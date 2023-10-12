package com.hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
         
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Song s=new Song();
        s.setSongId(1);
        s.setSongName("rim zim barse");
        s.setSinger("Kishore Kumare");
      
        session.save(s);
        
        tx.commit();
        session.close();
    }
}
