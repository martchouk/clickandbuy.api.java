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

	/**
	 * class logger.
	 */
	private static final Logger	logger	= Logger.getLogger(ParentTest.class);

	/**
	 * signature handler service.
	 */
	@Autowired
	protected SignatureHandler	signatureHandler;

	/**
	 * current merchant id.
	 */
	@Value("${merchantId}")
	protected long				merchantId;

	/**
	 * project id.
	 */
	@Value("${projectId}")
	protected long				projectId;

	/**
	 * secret key.
	 */
	@Value("${secretKey}")
	protected String			secretKey;

	/**
	 * business origin id. (Specific for web shop systems).
	 */
	@Value("${businessOriginID}")
	protected String			businessOriginID;

	/**
	 * external id.
	 */
	@Value("${externalId}")
	protected String			externalId;

	/**
	 * 
	 */
	protected void configureCertificatesPolicy(final Client proxy) {
		logger.debug("Configuring certificates policy for [" + proxy + "]");
		
		final HTTPConduit conduit = (HTTPConduit) proxy.getConduit();
		final TLSClientParameters tlsClientParameters = new TLSClientParameters();
		tlsClientParameters.setTrustManagers(new TrustManager[] { new TrustAllX509TrustManager() });
		tlsClientParameters.setDisableCNCheck(true);
		conduit.setTlsClientParameters(tlsClientParameters);
	}

	/**
	 * Prepares the soap {@link Authentication} object from given parameters
	 * 
	 * @param authenticationBean
	 * @return Authentication
	 */
	protected Authentication prepareAuthenticationBasedOnProjectID() {
		final Authentication merchantAuth = new Authentication();
		merchantAuth.setProjectID(nullToZero(projectId));
		merchantAuth.setMerchantID(nullToZero(merchantId));
		merchantAuth.setToken(signatureHandler.createTokenForPayPort(projectId, secretKey));
		return merchantAuth;
	}

	/**
	 * @param num
	 * @return
	 */
	protected long nullToZero(final Long num) {
		return num == null ? 0 : num.longValue();
	}
}
