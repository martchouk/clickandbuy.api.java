package clickandbuy.api.soap.cxf.parent;

import javax.net.ssl.TrustManager;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import clickandbuy.api.soap.cxf.security.TrustAllX509TrustManager;

import com.clickandbuy.api.soap.cxf.Authentication;
import com.clickandbuy.api.util.auth.SignatureHandler;

/**
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@Configuration
@ActiveProfiles("DEVELOPMENT2")
@ContextConfiguration(locations = { "classpath:/META-INF/spring/itest/clickandbuy.api.soap.cxf.spring.xml" })
public class ParentTest {
	public static final Logger	logger	= Logger.getLogger(ParentTest.class);

	@Autowired
	protected SignatureHandler	signatureHandler;
	
	@Value("${merchantId}")
	protected long	merchantId;

	@Value("${projectId}")
	protected long	projectId;

	@Value("${secretKey}")
	protected String	secretKey;
	
	@Value("${businessOriginID}")
	protected String	businessOriginID;

	/**
	 * 
	 */
	public void configureCertificatesPolicy(Client proxy) {
		HTTPConduit conduit = (HTTPConduit) proxy.getConduit();
		TLSClientParameters tlsClientParameters = new TLSClientParameters();
		tlsClientParameters.setTrustManagers(new TrustManager[] { new TrustAllX509TrustManager() });
		tlsClientParameters.setDisableCNCheck(true);// end authentication server
		conduit.setTlsClientParameters(tlsClientParameters);
	}

	/**
	 * Prepares the soap {@link Authentication} object from given parameters
	 * 
	 * @param authenticationBean
	 * @return Authentication
	 */
	public Authentication prepareAuthenticationBasedOnProjectID() {
		Authentication merchantAuth = new Authentication();
		merchantAuth.setProjectID(nullToZero(projectId));
		merchantAuth.setMerchantID(nullToZero(merchantId));
		merchantAuth.setToken(signatureHandler.createTokenForPayPort(projectId, secretKey));
		return merchantAuth;
	}
	
	/**
	 * @param num
	 * @return
	 */
	public long nullToZero(Long num) {
		return num == null ? 0 : num.longValue();
	}
}
