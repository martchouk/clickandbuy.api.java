package com.clickandbuy.api.util.auth;

import java.security.MessageDigest;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import org.apache.log4j.Logger;
import org.apache.xerces.impl.dv.util.HexBin;
import org.springframework.stereotype.Component;

/**
 *  TODO: check naming for methods
 *  Add Class Description.
 *  
 *
 */
@Component
public class SignatureHandler {
	private static final Logger	logger	= Logger.getLogger(SignatureHandler.class);

	/**
	 * Creates a valid token, for pay port authentication, based on the given input.
	 * 
	 * @param projectID
	 * @param sharedSecret
	 * @return String
	 * 
	 *         <timestamp>::<hex(sha1) hash of the string “[projectID]::[secretKey]::[timestamp]”>
	 */
	public String createTokenForPayPort(final long projectID, final String sharedSecret) {
		final TimeZone utcTimeZone = TimeZone.getTimeZone("UTC");
		final DateFormat dateFormat = CabApiUniqueDateFormat.getDateFormatForSignature();
		dateFormat.setTimeZone(utcTimeZone);
		final Calendar calendar = Calendar.getInstance(utcTimeZone);
		final String timestamp = dateFormat.format(calendar.getTime());
		final String toBeHashed = projectID + "::" + sharedSecret + "::" + timestamp;
		return timestamp + "::" + hash(toBeHashed);
	}

	/**
	 * HEX(SHA1($businessOriginID + "::" + $merchantID + "::" + $sharedSecret + "::" + $timestamp)) with $timestamp being dateTimeWithFormat('yyyyMMddHHmmss') in UTC
	 * 
	 * Creates a valid token, for pay port authentication, based on the given input.
	 * 
	 * @param projectID
	 * @param sharedSecret
	 * @return String
	 */
	public String createMerchantRegistrationToken(final String businessOriginID, final long merchantID, final String sharedSecret) {
		TimeZone utcTimeZone = TimeZone.getTimeZone("UTC");
		DateFormat dateFormat = CabApiUniqueDateFormat.getDateFormatForSignature();
		dateFormat.setTimeZone(utcTimeZone);
		Calendar calendar = Calendar.getInstance(utcTimeZone);
		final String timestamp = dateFormat.format(calendar.getTime());
		final String toBeHashed = businessOriginID + "::" + merchantID + "::" + sharedSecret + "::" + timestamp;
		return hash(toBeHashed);
	}

	/**
	 * Makes a HEX(SHA1(input)) string.
	 * 
	 * @param input
	 * @return
	 */
	private String hash(final String input) {
		try {
			final MessageDigest md = MessageDigest.getInstance("SHA1");
			md.update(input.getBytes());
			return HexBin.encode(md.digest());
		} catch (Throwable t) {
			logger.error("Could not SHA1: " + t);
			return "";
		}
	}
}
