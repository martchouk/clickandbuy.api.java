package clickandbuy.api.soap.cxf.payport.tests;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.Money;
import com.clickandbuy.api.soap.cxf.OrderDetailItemList;
import com.clickandbuy.api.soap.cxf.OrderDetails;
import com.clickandbuy.api.soap.cxf.PayRequestDetails;
import com.clickandbuy.api.soap.cxf.PayRequestRequest;
import com.clickandbuy.api.soap.cxf.PayRequestResponse;

/**
 * Tests related to PayRequest
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class PayRequestTest extends PayPortParentTest {

	/** Test data */
	@Value("${merchantId}")
	private long	merchantId;

	@Value("${projectId}")
	private long	projectId;

	@Value("${secretKey}")
	private String	secretKey;

	@Value("${payPort.payRequest.externalId}")
	private String	externalId;

	@Value("${payPort.payRequest.basketRisk}")
	private int		basketRisk;

	@Value("${payPort.payRequest.clientRisk}")
	private int		clientRisk;

	@Value("${payPort.payRequest.authExpiration}")
	private int		authExpiration;

	@Value("${payPort.payRequest.confirmExpiration}")
	private int		confirmExpiration;

	@Value("${payPort.payRequest.successExpiration}")
	private int		successExpiration;

	@Value("${payPort.payRequest.successURI}")
	private String	successURI;

	@Value("${payPort.payRequest.failureURI}")
	private String	failureURI;

	@Value("${payPort.payRequest.consumerIPAddress}")
	private String	consumerIPAddress;

	@Value("${payPort.payRequest.consumerLanguage}")
	private String	consumerLanguage;

	@Value("${payPort.payRequest.consumerNation}")
	private String	consumerNation;
			
	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();

		externalId = externalId + System.nanoTime() + "_";
		logger.debug("***externalId:" + externalId);
	}

	/**
	 * Test the PayRequest
	 */
	@Test
	public void testPayRequest() {
		PayRequestResponse payRequestResponse = null;

		PayRequestRequest payRequestRequest = new PayRequestRequest();
		payRequestRequest.setAuthentication(prepareAuthentication(merchantId, projectId, secretKey));
		payRequestRequest.setDetails(preparePayRequestDetails());

		try {
			payRequestResponse = payPortType.payRequest(payRequestRequest);
			logger.debug("Created transaction with Id: " + payRequestResponse.getTransaction().getTransactionID());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
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

		// TODO fill in necessary test data

		// Amount
		Money amount = new Money();
		amount.setAmount(new BigDecimal("1.50"));
		amount.setCurrency("USD");

		// Billing Address
		// LegalEntity billing = prepareLegalEntity(payRequestFormBean.getBillingAddress(),
		// payRequestFormBean.isUseBillingAddress());
		// payRequestDetails.setBilling(billing);

		// RecurringAuthorization
		// RecurringPaymentAuthorization createRecurring = prepareRecurringAuthorization(payRequestFormBean.getCreateRecurring(),
		// payRequestFormBean.isUseRecurringAuthorization());
		// payRequestDetails.setCreateRecurring(createRecurring);

		// Shipping Address
		// LegalEntity shipping = prepareLegalEntity(payRequestFormBean.getShippingAddress(),
		// payRequestFormBean.isUseShippingAddress());
		// payRequestDetails.setShipping(shipping);

		// Order Details
		OrderDetails order = new OrderDetails();
		order.setItemList(new OrderDetailItemList());
		order.setText("testPurchase");

		// Request Details
		payRequestDetails.setAmount(amount);
		payRequestDetails.setAuthExpiration(authExpiration);
		payRequestDetails.setBasketRisk(basketRisk);

		// payRequestDetails.setBilling(value);

		payRequestDetails.setClientRisk(clientRisk);
		payRequestDetails.setConfirmExpiration(confirmExpiration);
		payRequestDetails.setConsumerCountry(consumerNation);
		payRequestDetails.setConsumerIPAddress(consumerIPAddress);
		payRequestDetails.setConsumerLanguage(consumerLanguage);

		// payRequestDetails.setCreateRecurring(value);

		payRequestDetails.setExternalID(externalId);
		payRequestDetails.setFailureURL(failureURI);
		payRequestDetails.setOrderDetails(order);

		// payRequestDetails.setShipping(value);

		payRequestDetails.setSuccessExpiration(successExpiration);
		payRequestDetails.setSuccessURL(successURI);

		return payRequestDetails;
	}
}
