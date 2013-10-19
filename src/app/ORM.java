package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ORM {
	public static String driverName = "jpa";
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory(driverName);
	public static EntityManager em = emf.createEntityManager();
	public static EntityTransaction et = em.getTransaction();
}
