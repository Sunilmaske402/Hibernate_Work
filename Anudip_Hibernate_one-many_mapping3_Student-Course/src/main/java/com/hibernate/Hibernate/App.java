package com.hibernate.Hibernate;
//create two entity class Student and Course.Apply many to one and one to many relationship mapping

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.Entity.Course;
import com.hibernate.Entity.Student;

public class App 
{
	 public static void main(String[] args) 
	    {
	    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			try 
			{
			  Course c=new Course();
			  c.setName("Java Development");
			  
			  Student s1=new Student();
			  s1.setName("Vijay");
			  s1.setCourse(c);

			  Student s2=new Student();
			  s2.setName("Ajay");
			  s2.setCourse(c);
			  
			  Student s3=new Student();
			  s3.setName("Rajesh");
			  s3.setCourse(c);
			  
			  c.getStudent().add(s1);
			  c.getStudent().add(s2);
			  c.getStudent().add(s3);

			  session.save(c);
			  session.getTransaction().commit();
			
			}
			finally 
			{
				session.close();
	            sessionFactory.close();
			}
		}
}
