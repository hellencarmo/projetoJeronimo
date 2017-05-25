package br.com.tc.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Jeronimo
 * @since 25/05/2017
 */
public class Hibernate {
	
	private static final SessionFactory sf;
	
	static {
		sf = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @return sf SessionFactory
	 */
	public static SessionFactory sessionFactory() {
		return sf;
	}
}
