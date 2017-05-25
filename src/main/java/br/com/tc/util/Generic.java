package br.com.tc.util;

import java.lang.reflect.Field;

/**
 * @author Jeronimo
 * @since 25/05/2017
 */
public class Generic {
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param t => object
	 * @return  fields
	 */
	public static <T extends Object>Field[] fields(T t) {
		return t.getClass().getDeclaredFields();
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param f field
	 * @param t object
	 * @param v value
	 * @throws Exception
	 */
	public static <T extends Object, V extends Object>void set(Field f, T t, V v) throws Exception {
		f.setAccessible(true);
		f.set(v, t);
		f.setAccessible(false);
	}
	
	/**
	 * @author Jeronimo
	 * @since 25/05/2017
	 * @param f field
	 * @param t object
	 * @return v value
	 * @throws Exception
	 */
	public static <T extends Object, V extends Object>V get(Field f, T t) throws Exception {
		f.setAccessible(true);
		V v = (V) f.get(t);
		f.setAccessible(false);
		return v;
	}
}
