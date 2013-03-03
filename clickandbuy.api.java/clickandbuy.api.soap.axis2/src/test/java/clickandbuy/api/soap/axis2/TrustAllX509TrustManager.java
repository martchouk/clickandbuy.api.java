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
 * 40 * Trust manager which trusts everything, allowing for self-signed SSL
 * certificates to be used. 41 * 42 * @author <a
 * href="mailto:jason@planet57.com">Jason Dillon</a> 43 * @since 2.1.0 44
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