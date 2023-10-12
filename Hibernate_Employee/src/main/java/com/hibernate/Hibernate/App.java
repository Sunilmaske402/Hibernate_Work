package com.hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        
        Employee e=new Employee();
        e.setId(1);
        e.setFirstName("Sunil");
        e.setLastName("Maske");
        
        session.save(e);
        transaction.commit();
        session.close();
    }
}
