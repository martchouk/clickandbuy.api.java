package clickandbuy.api.soap.axis2;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

import org.apache.axis2.java.security.TrustAllTrustManager;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;
import org.apache.commons.httpclient.protocol.SSLProtocolSocketFactory;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.soap.axis2.stub.Authentication;
import com.clickandbuy.api.soap.axis2.stub.Money;
import com.clickandbuy.api.soap.axis2.stub.OrderDetailItemList;
import com.clickandbuy.api.soap.axis2.stub.OrderDetails;
import com.clickandbuy.api.soap.axis2.stub.PayRequestDetails;
import com.clickandbuy.api.soap.axis2.stub.PayRequestRequest;
import com.clickandbuy.api.soap.axis2.stub.PayRequestResponse;
import com.clickandbuy.api.soap.axis2.stub.payment.ErrorDetailsException;
import com.clickandbuy.api.soap.axis2.stub.payment.PayStub;
import com.clickandbuy.api.util.auth.SignatureHandler;

@Configuration
@ActiveProfiles("SANDBOX")
@ContextConfiguration(locations = { "classpath:/META-INF/spring/itest/clickandbuy.api.soap.axis2.spring.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class ClickandbuyApiSoapAxis2ClientTest {
	private static final Logger logger = Logger
			.getLogger(ClickandbuyApiSoapAxis2ClientTest.class);
	@Autowired
	private SignatureHandler signatureHandler;

	@Autowired
	private PayStub clickandbuyApiClient;

	/** Test data */
	@Value("${externalId}")
	private String externalId;
	@Value("${merchantId}")
	private long merchantId;
	@Value("${projectId}")
	private long projectId;
	@Value("${secretKey}")
	private String secretKey;
	@Value("${basketRisk}")
	private int basketRisk;
	@Value("${clientRisk}")
	private int clientRisk;
	@Value("${authExpiration}")
	private int authExpiration;
	@Value("${confirmExpiration}")
	private int confirmExpiration;
	@Value("${successExpiration}")
	private int successExpiration;
	@Value("${successURI}")
	private String successURI;
	@Value("${failureURI}")
	private String failureURI;
	@Value("${consumerIPAddress}")
	private String consumerIPAddress;
	@Value("${consumerLanguage}")
	private String consumerLanguage;
	@Value("${consumerNation}")
	private String consumerNation;

	@Before
	public void setUp() throws Exception {
		externalId = externalId + System.nanoTime() + "_";
		logger.debug("***externalId:" + externalId);
		SSLContext sslCtx = SSLContext.getInstance("SSL");
		sslCtx.init(null,
				new TrustManager[] { new TrustAllX509TrustManager() }, null);
		clickandbuyApiClient
				._getServiceClient()
				.getOptions()
				.setProperty(
						HTTPConstants.CUSTOM_PROTOCOL_HANDLER,
						new Protocol(
								"https",
								(ProtocolSocketFactory) new org.apache.axis2.java.security.SSLProtocolSocketFactory(
										sslCtx), 443));
		clickandbuyApiClient._getServiceClient().getOptions()
				.setProperty(HTTPConstants.CHUNKED, false);
	}

	/**
	 * Test the PayRequest
	 */
	@Test
	public void testPayRequest() {
		PayRequestResponse tx = null;
		PayRequestRequest req = new PayRequestRequest();
		req.setAuthentication(prepareAuthentication(merchantId, projectId,
				secretKey));
		req.setDetails(preparePayRequestDetails());
		try {
			tx = clickandbuyApiClient.payRequest(req);
			logger.debug("Created transaction with Id: "
					+ tx.getTransaction().getTransactionID());
		} catch (ErrorDetailsException e) {
			logger.error(e.getFaultMessage().getDescription());
		} catch (RemoteException e) {
			logger.error(e.getMessage());
		}
	}

	/**
	 * Prepares the soap {@link PayRequest_Request} object from given parameters
	 * 
	 * @param payRequestFormBean
	 * @return T_PayRequest_Details
	 * @throws PayServiceException
	 */
	private PayRequestDetails preparePayRequestDetails() {
		PayRequestDetails payRequestDetails = new PayRequestDetails();
		payRequestDetails.setBasketRisk(basketRisk);
		payRequestDetails.setClientRisk(clientRisk);
		payRequestDetails.setAuthExpiration(authExpiration);
		payRequestDetails.setConfirmExpiration(confirmExpiration);
		payRequestDetails.setSuccessExpiration(successExpiration);
		payRequestDetails.setSuccessURL(successURI);
		payRequestDetails.setFailureURL(failureURI);
		payRequestDetails.setConsumerIPAddress(consumerIPAddress);
		payRequestDetails.setExternalID(externalId);
		payRequestDetails.setConsumerLanguage(consumerLanguage);
		payRequestDetails.setConsumerCountry(consumerNation);
		// Order Details
		OrderDetails order = new OrderDetails();
		order.setItemList(new OrderDetailItemList());
		order.setText("testPurchase");
		payRequestDetails.setOrderDetails(order);

		// Amount
		Money amount = new Money();
		amount.setAmount(new BigDecimal("1.50"));
		amount.setCurrency("USD");
		payRequestDetails.setAmount(amount);
		return payRequestDetails;
	}

	/**
	 * Prepares the soap {@link Authentication} object from given parameters
	 * 
	 * @param authenticationBean
	 * @return Authentication
	 */
	private Authentication prepareAuthentication(final long merchantId,
			final long projectId, final String secretKey) {
		Authentication merchantAuth = new Authentication();
		merchantAuth.setProjectID(nullToZero(projectId));
		merchantAuth.setMerchantID(nullToZero(merchantId));
		merchantAuth.setToken(signatureHandler
				.createToken(projectId, secretKey));
		return merchantAuth;
	}

	/**
	 * @param num
	 * @return
	 */
	private long nullToZero(Long num) {
		return num == null ? 0 : num.longValue();
	}
}
