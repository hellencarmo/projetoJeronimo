package br.com.tc.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author Jeronimo
 * @since 29/05/2017
 */
public class Convert {
	
	/**
	 * @author Jeronimo
	 * @since 29/05/2017
	 * @param d date
	 * @return date_string
	 */
	public static <D extends java.util.Date>String dateToString(D d) {
		DateFormat df = new SimpleDateFormat("yyyy-dd-MM");
		return df.format(d);
	}
	
	/**
	 * @author Jeronimo
	 * @since 29/05/2017
	 * @param i integer
	 * @return integer_string
	 */
	public static String integerToString(Integer i) {
		return Integer.toString(i);
	}
}
