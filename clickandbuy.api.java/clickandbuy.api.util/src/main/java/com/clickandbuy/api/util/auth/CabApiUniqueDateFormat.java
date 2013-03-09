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
	 * Prevent utils class instantiation
	 */
	public CabApiUniqueDateFormat() {
	}

	/**
	 * date formatter for client signature generation.
	 */
	public static final DateFormat getDateFormatForWsClientSignature() {
		return new SimpleDateFormat("yyyyMMddHHmmss");
	}

	/**
	 * day specific date formatter.
	 */
	public static final DateFormat getDayYYYYMMdd() {
		return new SimpleDateFormat("yyyyMMdd");
	}

}
