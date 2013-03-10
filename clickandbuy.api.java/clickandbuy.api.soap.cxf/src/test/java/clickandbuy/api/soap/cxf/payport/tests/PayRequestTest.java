/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import static clickandbuy.api.soap.cxf.util.TestUtil.prepareMoney;
import static clickandbuy.api.soap.cxf.util.TestUtil.toXMLGregorianCalendar;

import java.math.BigDecimal;
import java.text.ParseException;

import javax.xml.datatype.DatatypeConfigurationException;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.payport.data.PayPortTestDataSupplier;
import clickandbuy.api.soap.cxf.payport.parent.PayPortParentTest;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.OrderDetailItemList;
import com.clickandbuy.api.soap.cxf.OrderDetails;
import com.clickandbuy.api.soap.cxf.PayRequestDetails;
import com.clickandbuy.api.soap.cxf.PayRequestRequest;
import com.clickandbuy.api.soap.cxf.PayRequestResponse;
import com.clickandbuy.api.soap.cxf.RecurringPaymentAuthorization;

/**
 * Tests related to PayRequest
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class PayRequestTest extends PayPortParentTest {

	/**
	 * Class logger.
	 */
	private static final Logger	logger	= Logger.getLogger(PayRequestTest.class);

	/**
	 * 
	 */
	public PayRequestTest() {
		super();
	}

	/**
	 * Test setup.
	 */
	@Before
	public void setup() {
		configureCertificatesPolicy();

		externalId = externalId + System.nanoTime() + "_";
		logger.debug("externalId: [" + externalId + "]");
	}

	/**
	 * Test the PayRequest operation
	 * 
	 * @return the transaction ID
	 * 
	 * @throws ErrorDetails_Exception
	 */
	@Test
	public void testPayRequest() throws ErrorDetails_Exception {
		PayRequestResponse payRequestResponse = null;

		final PayRequestRequest payRequestRequest = new PayRequestRequest();
		payRequestRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		payRequestRequest.setDetails(preparePayRequestDetails());

		try {
			payRequestResponse = payPortType.payRequest(payRequestRequest);

			Assert.assertNotNull("payRequestResponse should not be null!", payRequestResponse);
			Assert.assertNotNull("payRequestResponse.getTransaction() should not be null!", payRequestResponse.getTransaction());
			Assert.assertNotNull("payRequestResponse.getTransaction().getTransactionID() should not be null!", payRequestResponse.getTransaction().getTransactionID());
			Assert.assertNotNull("payRequestResponse.getTransaction().getRedirectURL() should not be null!", payRequestResponse.getTransaction().getRedirectURL());

			logger.debug("Created transaction with ID: [" + payRequestResponse.getTransaction().getTransactionID() + "]");
			logger.info("You can use the Transaction ID: [" + payRequestResponse.getTransaction().getTransactionID() + "] to make a Refund Request, after you complete the flow you'll find here ["
					+ payRequestResponse.getTransaction().getRedirectURL() + "]");
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}
	}

	/**
	 * Test the PayRequest operation for obtaining RecurringPaymentAuthorization
	 * 
	 * @return the transaction ID
	 * 
	 * @throws ParseException
	 * @throws DatatypeConfigurationException
	 * @throws ErrorDetails_Exception
	 */
	@Test
	public void testPayRequestForRecurringAuthorization() throws ParseException, DatatypeConfigurationException, ErrorDetails_Exception {
		PayRequestResponse payRequestResponse = null;

		final PayRequestRequest payRequestRequest = new PayRequestRequest();
		payRequestRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		payRequestRequest.setDetails(preparePayRequestDetailsForRecurringAuthorization());

		try {
			payRequestResponse = payPortType.payRequest(payRequestRequest);

			Assert.assertNotNull("payRequestResponse should not be null!", payRequestResponse);
			Assert.assertNotNull("payRequestResponse.getTransaction() should not be null!", payRequestResponse.getTransaction());
			Assert.assertNotNull("payRequestResponse.getTransaction().getTransactionID() should not be null!", payRequestResponse.getTransaction().getTransactionID());
			Assert.assertNotNull("payRequestResponse.getTransaction().getRedirectURL() should not be null!", payRequestResponse.getTransaction().getRedirectURL());
			Assert.assertNotNull("payRequestResponse.getTransaction().getCreatedRecurringPaymentAuthorization() should not be null!", payRequestResponse.getTransaction().getCreatedRecurringPaymentAuthorization());
			Assert.assertNotNull("payRequestResponse.getTransaction().getCreatedRecurringPaymentAuthorization().getRecurringPaymentAuthorizationID() should not be null!", payRequestResponse.getTransaction()
					.getCreatedRecurringPaymentAuthorization().getRecurringPaymentAuthorizationID());
			Assert.assertNotNull("payRequestResponse.getTransaction().getCreatedRecurringPaymentAuthorization().getRecurringPaymentAuthorizationStatus() should not be null!", payRequestResponse.getTransaction()
					.getCreatedRecurringPaymentAuthorization().getRecurringPaymentAuthorizationStatus());

			logger.debug("Created transaction with ID: [" + payRequestResponse.getTransaction().getTransactionID() + "]");
			logger.debug("Created a recurring payment authorization with ID: [" + payRequestResponse.getTransaction().getCreatedRecurringPaymentAuthorization().getRecurringPaymentAuthorizationID() + "] and status ["
					+ payRequestResponse.getTransaction().getCreatedRecurringPaymentAuthorization().getRecurringPaymentAuthorizationStatus() + "]");
			logger.info("You can use the payment authorization with ID: [" + payRequestResponse.getTransaction().getCreatedRecurringPaymentAuthorization().getRecurringPaymentAuthorizationID()
					+ "] to make a Recurring Payment Request, after you complete the flow you'll find here [" + payRequestResponse.getTransaction().getRedirectURL() + "]");
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}
	}

	/**
	 * Prepares an {@link PayRequestDetails} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the ${@link PayRequestDetails}
	 */
	private PayRequestDetails preparePayRequestDetails() {
		final PayRequestDetails payRequestDetails = new PayRequestDetails();

		payRequestDetails.setAmount(prepareMoney(testData.getPayRequestAmount(), testData.getPayRequestCurrency()));
		payRequestDetails.setAuthExpiration(testData.getPayRequestAuthExpiration());
		payRequestDetails.setBasketRisk(testData.getPayRequestBasketRisk());
		payRequestDetails.setClientRisk(testData.getPayRequestClientRisk());
		payRequestDetails.setConfirmExpiration(testData.getPayRequestConfirmExpiration());
		payRequestDetails.setConsumerCountry(testData.getPayRequestConsumerNation());
		payRequestDetails.setConsumerIPAddress(testData.getPayRequestConsumerIPAddress());
		payRequestDetails.setConsumerLanguage(testData.getPayRequestConsumerLanguage());
		payRequestDetails.setExternalID(externalId);
		payRequestDetails.setFailureURL(testData.getPayRequestFailureURI());
		payRequestDetails.setOrderDetails(prepareOrderDetails());
		payRequestDetails.setSuccessExpiration(testData.getPayRequestSuccessExpiration());
		payRequestDetails.setSuccessURL(testData.getPayRequestSuccessURI());

		return payRequestDetails;
	}

	/**
	 * Prepares an {@link PayRequestDetails} for normal payment requests (not recurring) based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the ${@link PayRequestDetails}
	 * 
	 * @throws ParseException
	 * @throws DatatypeConfigurationException
	 */
	private PayRequestDetails preparePayRequestDetailsForRecurringAuthorization() throws ParseException, DatatypeConfigurationException {
		final PayRequestDetails payRequestDetails = preparePayRequestDetails();

		payRequestDetails.setCreateRecurring(prepareRecurringPaymentAuthorization());

		return payRequestDetails;
	}

	/**
	 * Prepares an {@link OrderDetails} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the ${@link OrderDetails}
	 */
	private OrderDetails prepareOrderDetails() {
		final OrderDetails orderDetails = new OrderDetails();

		orderDetails.setItemList(new OrderDetailItemList());
		orderDetails.setText(testData.getPayRequestText());

		return orderDetails;
	}

	/**
	 * Prepares an {@link RecurringPaymentAuthorization} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the ${@link RecurringPaymentAuthorization}
	 * 
	 * @throws ParseException
	 * @throws DatatypeConfigurationException
	 */
	private RecurringPaymentAuthorization prepareRecurringPaymentAuthorization() throws ParseException, DatatypeConfigurationException {
		final RecurringPaymentAuthorization recurringPaymentAuthorization = new RecurringPaymentAuthorization();

		recurringPaymentAuthorization.setDescription(testData.getPayRequestCreateRecurringDescription());
		recurringPaymentAuthorization.setExpireDate(toXMLGregorianCalendar(testData.getPayRequestCreateRecurringExpireDate()));
		recurringPaymentAuthorization.setAmountLimit(prepareMoney(BigDecimal.valueOf(100), "EUR"));
		recurringPaymentAuthorization.setNumberLimit(100);

		return recurringPaymentAuthorization;
	}
}
