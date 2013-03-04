package com.clickandbuy.api.util.auth;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Unique date formatter for CAB Api.
 * 
 * @author Nicolae.Petridean
 * @author Ciprian I. Ileana
 */
public class CabApiUniqueDateFormat {
	
	/**
	 * date formatter for signature generation.
	 */
	public static final DateFormat getDateFormatForSignature() {
		return new SimpleDateFormat("yyyyMMddHHmmss");
	}
	
	/**
	 * day specific date formatter.
	 */
	public static final DateFormat getDayDateFormatter() {
		return new SimpleDateFormat("yyyyMMdd");
	}

}
