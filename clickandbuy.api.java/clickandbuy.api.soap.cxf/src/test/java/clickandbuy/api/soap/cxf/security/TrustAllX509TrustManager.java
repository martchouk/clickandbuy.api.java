package clickandbuy.api.soap.cxf.security;

import javax.net.ssl.TrustManager;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;


/**
 * Trust manager which trusts everything, allowing for self-signed SSL certificates to be used.
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class TrustAllX509TrustManager implements X509TrustManager {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.net.ssl.X509TrustManager#getAcceptedIssuers()
	 */
	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.net.ssl.X509TrustManager#checkClientTrusted(java.security.cert.X509Certificate[], java.lang.String)
	 */
	public void checkClientTrusted(final X509Certificate[] certs, final String authType) {
		// empty
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.net.ssl.X509TrustManager#checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String)
	 */
	public void checkServerTrusted(final X509Certificate[] certs, final String authType) {
		// empty
	}

	/**
	 * @throws KeyManagementException
	 * @throws NoSuchAlgorithmException
	 */
	public static synchronized void install() throws KeyManagementException, NoSuchAlgorithmException {
		SSLContext context = SSLContext.getInstance("SSL");
		context.init(null, new TrustManager[] { new TrustAllX509TrustManager() }, new SecureRandom());
		HttpsURLConnection.setDefaultSSLSocketFactory(context.getSocketFactory());
	}
}