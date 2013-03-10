package com.clickandbuy.api.util.auth;

import java.security.MessageDigest;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import org.apache.log4j.Logger;
import org.apache.xerces.impl.dv.util.HexBin;
import org.springframework.stereotype.Component;

/**
 * Signature handler class. Used as Spring bean. Can be used to generate authentication tokens for Cab web service and as merchant registration token util.
 * 
 * @author Ciprian I.Ileana
 * @author Nicolae.Petridean
 */
@Component
public class SignatureHandler {
	/**
	 * class logger.
	 */
	private static final Logger	logger				= Logger.getLogger(SignatureHandler.class);

	/**
	 * sha1 alghoritm.
	 */
	private static final String	SHA1_ALGORITHM		= "SHA1";

	/**
	 * signature timezone.
	 */
	private static final String	SIGNATURE_TIMEZONE	= "UTC";

	/**
	 * signature timezone.
	 */
	private static final String	TOKEN_SEPARATOR		= "::";

	/**
	 * Creates a valid token, for Cab ws client authentication, based on projectId and sharedSecret.
	 * 
	 * @param projectID
	 *            the ID of the project
	 * @param sharedSecret
	 *            the obtained shared secret
	 * @return String <timestamp>::<hex(sha1) hash of the string “[projectID]::[secretKey]::[timestamp]”>
	 */
	public String createAuthenticationToken(final long projectID, final String sharedSecret) {
		final TimeZone utcTimeZone = TimeZone.getTimeZone(SIGNATURE_TIMEZONE);
		final DateFormat dateFormat = CabApiUniqueDateFormat.getDateFormatForWsClientSignature();
		dateFormat.setTimeZone(utcTimeZone);
		final Calendar calendar = Calendar.getInstance(utcTimeZone);
		final String timestamp = dateFormat.format(calendar.getTime());
		final String toBeHashed = projectID + TOKEN_SEPARATOR + sharedSecret + TOKEN_SEPARATOR + timestamp;
		return timestamp + TOKEN_SEPARATOR + hash(toBeHashed);
	}

	/**
	 * Creates a merchant registration token, based on businessOrigin id, merchant Id and shared secret. BusinessOriginId is a parameter specific for web shops.
	 * 
	 * $timestamp + "::" + HEX(SHA1($businessOriginID + "::" + $merchantID + "::" + $sharedSecret + "::" + $timestamp)) with $timestamp being dateTimeWithFormat('yyyyMMddHHmmss') in UTC
	 * 
	 * @param projectID
	 *            the ID of the project
	 * @param sharedSecret
	 *            the obtained shared secret
	 * @return String the registration token as described
	 */
	public String createRegistrationToken(final String businessOriginID, final long merchantID, final String sharedSecret) {
		final TimeZone utcTimeZone = TimeZone.getTimeZone(SIGNATURE_TIMEZONE);
		final DateFormat dateFormat = CabApiUniqueDateFormat.getDateFormatForWsClientSignature();
		dateFormat.setTimeZone(utcTimeZone);
		final Calendar calendar = Calendar.getInstance(utcTimeZone);
		final String timestamp = dateFormat.format(calendar.getTime());
		final String toBeHashed = businessOriginID + TOKEN_SEPARATOR + merchantID + TOKEN_SEPARATOR + sharedSecret + TOKEN_SEPARATOR + timestamp;
		return timestamp + TOKEN_SEPARATOR + hash(toBeHashed);
	}

	/**
	 * Makes a HEX(SHA1(input)) string.
	 * 
	 * @param input
	 *            what to be hashed
	 * @return hashed as described above
	 */
	private String hash(final String input) {
		try {
			final MessageDigest md = MessageDigest.getInstance(SHA1_ALGORITHM);
			md.update(input.getBytes());
			return HexBin.encode(md.digest());
		} catch (final Throwable t) {
			logger.error("Could not encode : " + input, t);
			throw new RuntimeException("Could not encode: " + input + ". Please be sure you use an offical Java Runtime Environment release.", t);
		}
	}
}
