package br.com.tc.model;

import br.com.tc.util.Generic;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * Created by Junior on 25/05/17.
 */
public abstract class Master implements Serializable, Cloneable {
	
	public Master() {}
	
	public Field[] fields() {
		return Generic.fields(this);
	}
	
	public <V extends Object>void set(Field f, V v) throws Exception {
		Generic.set(f, this, v);
	}
	
	public <V extends Object>V get(Field f) throws Exception {
		return Generic.get(f, this);
	}
}
