/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import static clickandbuy.api.soap.cxf.util.TestUtil.prepareMoney;

import java.math.BigDecimal;
import java.text.ParseException;

import javax.xml.datatype.DatatypeConfigurationException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.payport.data.PayPortTestDataSupplier;
import clickandbuy.api.soap.cxf.payport.parent.PayPortParentTest;
import clickandbuy.api.soap.cxf.util.TestUtil;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.Money;
import com.clickandbuy.api.soap.cxf.OrderDetailItemList;
import com.clickandbuy.api.soap.cxf.OrderDetails;
import com.clickandbuy.api.soap.cxf.PayRequestDetails;
import com.clickandbuy.api.soap.cxf.PayRequestRecurringDetails;
import com.clickandbuy.api.soap.cxf.PayRequestRecurringRequest;
import com.clickandbuy.api.soap.cxf.PayRequestRecurringResponse;
import com.clickandbuy.api.soap.cxf.PayRequestRequest;
import com.clickandbuy.api.soap.cxf.PayRequestResponse;
import com.clickandbuy.api.soap.cxf.RecurringPaymentAuthorization;
import com.clickandbuy.api.soap.cxf.StatusRequestDetails;
import com.clickandbuy.api.soap.cxf.TransactionIDList;

/**
 * Tests related to PayRequestRecurring
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class PayRequestRecurringTest extends PayPortParentTest {

	private Long			transactionID;

	private Long			recurringPaymentAuthorizationID;

	@Autowired
	PayPortTestDataSupplier	payPortTestDataSupplier;

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
		recurringPaymentAuthorizationID = doPayRequest();
	}

	/**
	 * Test the PayRequestRecurring
	 * 
	 * @throws InterruptedException
	 * @throws ErrorDetails_Exception
	 */
	@Test
	public void testPayRequestRecurring() throws InterruptedException, ErrorDetails_Exception {

		logger.debug("Preparing to make a PayRequestRecurring");

		PayRequestRecurringResponse payRequestRecurringResponse = new PayRequestRecurringResponse();

		final PayRequestRecurringRequest payRequestRecurringRequest = new PayRequestRecurringRequest();
		payRequestRecurringRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		payRequestRecurringRequest.setDetails(preparePayRequestRecurringDetails());

		try {
			payRequestRecurringResponse = payPortType.payRequestRecurring(payRequestRecurringRequest);
			logger.debug("Created recurring payment with Id: " + payRequestRecurringResponse.getTransaction().getTransactionID());
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}
	}

	private Long doPayRequest() throws ParseException, DatatypeConfigurationException, ErrorDetails_Exception {
		Long recurringAuthorizationID = null;
		PayRequestResponse payRequestResponse = null;

		final PayRequestRequest payRequestRequest = new PayRequestRequest();
		payRequestRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		payRequestRequest.setDetails(preparePayRequestDetails());

		try {
			payRequestResponse = payPortType.payRequest(payRequestRequest);
			logger.debug("transaction: " + payRequestResponse.getTransaction());
			logger.debug("created reccuring payment authorization: " + payRequestResponse.getTransaction().getCreatedRecurringPaymentAuthorization());
			logger.debug("created reccuring payment authorization status: " + payRequestResponse.getTransaction().getCreatedRecurringPaymentAuthorization().getRecurringPaymentAuthorizationStatus());

			recurringAuthorizationID = payRequestResponse.getTransaction().getCreatedRecurringPaymentAuthorization().getRecurringPaymentAuthorizationID();
			transactionID = payRequestResponse.getTransaction().getTransactionID();

			logger.debug("Created transaction with Id: " + payRequestResponse.getTransaction().getTransactionID());
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}

		return recurringAuthorizationID;
	}

	/**
	 * Prepares an StatusRequestDetails. As stated in the WSDL, at this point we can add one of the following:
	 * <ul>
	 * <li>ExternalIDList</li>
	 * <li>TransactionIDList</li>
	 * </ul>
	 * 
	 * For this test we chosen the TransactionIDList
	 * 
	 * @return
	 */
	public StatusRequestDetails prepareStatusRequestDetails() {
		final StatusRequestDetails statusRequestDetails = new StatusRequestDetails();
		statusRequestDetails.setTransactionIDList(prepareTransactionIDList());
		return statusRequestDetails;
	}

	private TransactionIDList prepareTransactionIDList() {
		final TransactionIDList transactionIDList = new TransactionIDList();
		transactionIDList.getTransactionID().add(transactionID);
		return transactionIDList;

	}

	/**
	 * Prepares the soap {@link PayRequest_Request} object from given parameters
	 * 
	 * @param payRequestFormBean
	 * @return T_PayRequest_Details
	 * @throws DatatypeConfigurationException
	 * @throws ParseException
	 * @throws PayServiceException
	 */
	private PayRequestDetails preparePayRequestDetails() throws ParseException, DatatypeConfigurationException {
		// preparing the externalID
		externalId = externalId + System.nanoTime() + "_";
		logger.debug("***externalId:" + externalId);

		final PayRequestDetails payRequestDetails = new PayRequestDetails();

		// Order Details
		final OrderDetails order = new OrderDetails();
		order.setItemList(new OrderDetailItemList());
		order.setText(payPortTestDataSupplier.getPayRequestText());

		// Request Details
		payRequestDetails.setAmount(prepareMoney(payPortTestDataSupplier.getPayRequestAmount(), payPortTestDataSupplier.getPayRequestCurrency()));
		payRequestDetails.setAuthExpiration(payPortTestDataSupplier.getPayRequestAuthExpiration());
		payRequestDetails.setBasketRisk(payPortTestDataSupplier.getPayRequestBasketRisk());
		payRequestDetails.setClientRisk(payPortTestDataSupplier.getPayRequestClientRisk());
		payRequestDetails.setConfirmExpiration(payPortTestDataSupplier.getPayRequestConfirmExpiration());
		payRequestDetails.setConsumerCountry(payPortTestDataSupplier.getPayRequestConsumerNation());
		payRequestDetails.setConsumerIPAddress(payPortTestDataSupplier.getPayRequestConsumerIPAddress());
		payRequestDetails.setConsumerLanguage(payPortTestDataSupplier.getPayRequestConsumerLanguage());
		payRequestDetails.setExternalID(externalId);
		payRequestDetails.setFailureURL(payPortTestDataSupplier.getPayRequestFailureURI());
		payRequestDetails.setOrderDetails(order);
		payRequestDetails.setSuccessExpiration(payPortTestDataSupplier.getPayRequestSuccessExpiration());
		payRequestDetails.setSuccessURL(payPortTestDataSupplier.getPayRequestSuccessURI());

		payRequestDetails.setCreateRecurring(prepareRecurringPaymentAuthorization());

		return payRequestDetails;
	}

	private RecurringPaymentAuthorization prepareRecurringPaymentAuthorization() throws ParseException, DatatypeConfigurationException {
		final RecurringPaymentAuthorization recurringPaymentAuthorization = new RecurringPaymentAuthorization();

		recurringPaymentAuthorization.setDescription(payPortTestDataSupplier.getPayRequestCreateRecurringDescription());
		recurringPaymentAuthorization.setExpireDate(TestUtil.toXMLGregorianCalendar(payPortTestDataSupplier.getPayRequestCreateRecurringExpireDate()));
		recurringPaymentAuthorization.setAmountLimit(prepareMoney(BigDecimal.valueOf(100), "EUR"));
		recurringPaymentAuthorization.setNumberLimit(100);

		return recurringPaymentAuthorization;
	}

	private Money prepareAmount() {
		final Money money = new Money();

		money.setAmount(payPortTestDataSupplier.getPayRequestRecurringAmount());
		money.setCurrency(payPortTestDataSupplier.getPayRequestRecurringCurrency());

		return money;
	}

	/**
	 * @return
	 */
	private PayRequestRecurringDetails preparePayRequestRecurringDetails() {
		final PayRequestRecurringDetails payRequestRecurringDetails = new PayRequestRecurringDetails();

		// preparing the externalID
		externalId = externalId + System.nanoTime() + "_";
		logger.debug("***externalId:" + externalId);

		payRequestRecurringDetails.setAmount(prepareAmount());
		payRequestRecurringDetails.setExternalID(externalId);
		payRequestRecurringDetails.setRecurringPaymentAuthorizationID(recurringPaymentAuthorizationID);

		return payRequestRecurringDetails;
	}

}
