package br.com.tc.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Junior on 25/05/17.
 */
public class Hibernate {
	
	private static final SessionFactory sf;
	
	static {
		sf = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
	}
	
	public static SessionFactory sessionFactory() {
		return sf;
	}
}
