/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import static clickandbuy.api.soap.cxf.util.TestUtil.prepareMoney;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.payport.data.PayPortTestDataSupplier;
import clickandbuy.api.soap.cxf.payport.parent.PayPortParentTest;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.PayRequestRecurringDetails;
import com.clickandbuy.api.soap.cxf.PayRequestRecurringRequest;
import com.clickandbuy.api.soap.cxf.PayRequestRecurringResponse;

/**
 * Tests related to PayRequestRecurring. This test is ignored as it requires the authorization transaction to be in authorized state before running a recurring payment.
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Ignore
public class PayRequestRecurringTest extends PayPortParentTest {

	/**
	 * class logger.
	 */
	private static final Logger	logger	= Logger.getLogger(PayRequestRecurringTest.class);

	/**
	 * test setup.
	 */
	@Before
	public void setUp() {
		configureCertificatesPolicy();

		externalId = externalId + System.nanoTime() + "_";
		logger.debug("externalId: [" + externalId + "]");
	}

	/**
	 * Tests the PayRequestRecurring operation
	 * 
	 * @throws InterruptedException
	 * @throws ErrorDetails_Exception
	 *             if during communication (between the client API implementation and the ClickandBuy API system) the communication is disturbed or a logical or technical error occurs. The response from ClickandBuy system contains detailed
	 *             error messages which facilitate the localization and eradication of the problem.
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

	/**
	 * Prepares an {@link PayRequestRecurringDetails} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the ${@link PayRequestRecurringDetails}
	 */
	private PayRequestRecurringDetails preparePayRequestRecurringDetails() {
		final PayRequestRecurringDetails payRequestRecurringDetails = new PayRequestRecurringDetails();

		payRequestRecurringDetails.setAmount(prepareMoney(testData.getPayRequestRecurringAmount(), testData.getPayRequestRecurringCurrency()));
		payRequestRecurringDetails.setExternalID(externalId);
		payRequestRecurringDetails.setRecurringPaymentAuthorizationID(testData.getPayRequestRecurringPaymentAuthorizationID());

		return payRequestRecurringDetails;
	}

}
