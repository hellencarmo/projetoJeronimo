package br.com.tc.util;

import java.lang.reflect.Field;

/**
 * Created by Junior on 25/05/17.
 */
public class Generic {
	
	public static <T extends Object>Field[] fields(T t) {
		return t.getClass().getDeclaredFields();
	}
	
	public static <T extends Object, V extends Object>void set(Field f, T t, V v) throws Exception {
		f.setAccessible(true);
		f.set(v, t);
		f.setAccessible(false);
	}
	
	public static <T extends Object, V extends Object>V get(Field f, T t) throws Exception {
		f.setAccessible(true);
		V v = (V) f.get(t);
		f.setAccessible(false);
		return v;
	}
}
