package clickandbuy.api.soap.cxf.payport.tests;

import static clickandbuy.api.soap.cxf.util.TestUtil.prepareMoney;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.OrderDetailItemList;
import com.clickandbuy.api.soap.cxf.OrderDetails;
import com.clickandbuy.api.soap.cxf.PayRequestDetails;
import com.clickandbuy.api.soap.cxf.PayRequestRequest;
import com.clickandbuy.api.soap.cxf.PayRequestResponse;

/**
 * Tests related to PayRequest
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class PayRequestTest extends PayPortParentTest {

	/** Test data */
	@Value("${merchantId}")
	private long		merchantId;

	@Value("${projectId}")
	private long		projectId;

	@Value("${secretKey}")
	private String		secretKey;

	@Value("${payPort.payRequest.amount.amout}")
	private BigDecimal	amount;

	@Value("${payPort.payRequest.amount.currency}")
	private String		currency;

	@Value("${payPort.payRequest.orderDetails.text}")
	private String		text;

	@Value("${payPort.payRequest.externalId}")
	private String		externalId;

	@Value("${payPort.payRequest.basketRisk}")
	private int			basketRisk;

	@Value("${payPort.payRequest.clientRisk}")
	private int			clientRisk;

	@Value("${payPort.payRequest.authExpiration}")
	private int			authExpiration;

	@Value("${payPort.payRequest.confirmExpiration}")
	private int			confirmExpiration;

	@Value("${payPort.payRequest.successExpiration}")
	private int			successExpiration;

	@Value("${payPort.payRequest.successURI}")
	private String		successURI;

	@Value("${payPort.payRequest.failureURI}")
	private String		failureURI;

	@Value("${payPort.payRequest.consumerIPAddress}")
	private String		consumerIPAddress;

	@Value("${payPort.payRequest.consumerLanguage}")
	private String		consumerLanguage;

	@Value("${payPort.payRequest.consumerNation}")
	private String		consumerNation;

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();

		externalId = externalId + System.nanoTime() + "_";
		logger.debug("***externalId:" + externalId);
	}

	/**
	 * Test the PayRequest
	 * 
	 * @return the transaction ID
	 */
	@Test
	public long testPayRequest() {
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

		return payRequestResponse.getTransaction().getTransactionID();
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
		order.setText(text);

		// Request Details
		payRequestDetails.setAmount(prepareMoney(amount, currency));
		payRequestDetails.setAuthExpiration(authExpiration);
		payRequestDetails.setBasketRisk(basketRisk);
		payRequestDetails.setClientRisk(clientRisk);
		payRequestDetails.setConfirmExpiration(confirmExpiration);
		payRequestDetails.setConsumerCountry(consumerNation);
		payRequestDetails.setConsumerIPAddress(consumerIPAddress);
		payRequestDetails.setConsumerLanguage(consumerLanguage);
		payRequestDetails.setExternalID(externalId);
		payRequestDetails.setFailureURL(failureURI);
		payRequestDetails.setOrderDetails(order);
		payRequestDetails.setSuccessExpiration(successExpiration);
		payRequestDetails.setSuccessURL(successURI);

		// payRequestDetails.setBilling(value);
		// payRequestDetails.setCreateRecurring(value);
		// payRequestDetails.setShipping(value);

		return payRequestDetails;
	}
}
