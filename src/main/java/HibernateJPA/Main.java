package HibernateJPA;

import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		Persistence.generateSchema("Eclipselink_JPA", null);

	}

}
