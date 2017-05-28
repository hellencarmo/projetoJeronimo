package br.com.tc.control;

import br.com.tc.dao.MasterDAO;

import java.util.List;

/**
 * @author Jeronimo
 * @since 27/05/2017
 */
public abstract class MasterControl<T extends Object> {
	
	protected MasterDAO<T> dao;
	protected T t;
	
	public MasterControl() {
		String p = getClass().getPackage().getName().replace("Control", "dao");
		String c = getClass().getSimpleName().replace("Manter", "");
		try {
			dao = (MasterDAO<T>) Class.forName(p + c).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void persist() {
		dao.persistir(t);
	}
	
	public T find() {
		return dao.buscar(t);
	}
	
	public List<T> list() {
		return dao.listar(t);
	}
}
