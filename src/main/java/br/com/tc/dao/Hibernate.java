package br.com.tc.dao;

import org.hibernate.Session;
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
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @return session
	 */
	public static Session session() {
		return sf.openSession();
	}
	
	/**
	 * @author Jeronimo
	 * @since 28/05/2017
	 * @param s session
	 */
	public static void closeSession(Session s) {
		if (s != null && s.isOpen()) {
			s.close();
		}
	}
}
