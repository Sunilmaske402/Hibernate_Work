package hibernate.connections.maven.One_To_Many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Department;
import com.entity.Employee;

public class App {
  public static void main(String[] args) {
	  	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try 
		{
		  Department dept = new Department();
		  dept.setDeptname("Comp Eng");
		  
		  Employee emp=new Employee();
		  emp.setEmpName("Rohit");
		  emp.setEmpDepartment(dept);
		  
		  Employee emp1=new Employee();
		  emp1.setEmpName("Mohit");
		  emp1.setEmpDepartment(dept);
		  
		  dept.getEmployees().add(emp);
		  dept.getEmployees().add(emp1);
		  
		  session.save(dept);
		  session.getTransaction().commit();
		
		 
		}
		finally 
		{
			session.close();
          sessionFactory.close();
		}
	}
}