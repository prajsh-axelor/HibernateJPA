package HibernateJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Employee employee = new Employee(12011,"Prajjwal",65000.0,"Software Developer");
		
		entitymanager.persist(employee);
		
//		entitymanager.merge(employee);
		
		entitymanager.getTransaction().commit();
		
		emfactory.close();		

	}

}
