package clickandbuy.api.soap.axis2;

import javax.net.ssl.TrustManager;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

/**
 * @author Nicolae.Petridean
 * @author Ciprian.Ileana
 */
public class TrustAllX509TrustManager implements X509TrustManager {

	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}

	public void checkClientTrusted(final X509Certificate[] certs,
			final String authType) {
		// empty
	}

	public void checkServerTrusted(final X509Certificate[] certs,
			final String authType) {
		// empty
	}

	public static synchronized void install() throws KeyManagementException,
			NoSuchAlgorithmException {
		// FIXME: Install for a specific thread and its children, not for the
		// entire JVM?
		SSLContext context = SSLContext.getInstance("SSL");
		context.init(null,
				new TrustManager[] { new TrustAllX509TrustManager() },
				new SecureRandom());
		HttpsURLConnection.setDefaultSSLSocketFactory(context
				.getSocketFactory());
	}
}