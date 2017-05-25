package br.com.tc.dao;

import org.hibernate.Session;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Junior on 25/05/17.
 */
public abstract class MasterDAO<T extends Object> {
	
	protected Class<T> c;
	protected Session s;
	
	public MasterDAO() {
		c = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		s = Hibernate.sessionFactory().openSession();
	}
	
	public void persistir(T t) {
		s.beginTransaction();
		s.saveOrUpdate(t);
		s.close();
	}
	
	public T buscar(T t) {
		s.beginTransaction();
		T objeto = s.find(c, t);
		s.close();
		return objeto;
	}
	
	public List<T> listar(T t) {
		s.beginTransaction();
		List<T> lista = s.createCriteria(c).list();
		s.close();
		return lista;
	}
}
