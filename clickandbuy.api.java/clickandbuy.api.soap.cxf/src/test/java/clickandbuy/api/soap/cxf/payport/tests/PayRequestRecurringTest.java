/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import static clickandbuy.api.soap.cxf.util.TestUtil.prepareMoney;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.payport.data.PayPortTestDataSupplier;
import clickandbuy.api.soap.cxf.payport.parent.PayPortParentTest;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.PayRequestRecurringDetails;
import com.clickandbuy.api.soap.cxf.PayRequestRecurringRequest;
import com.clickandbuy.api.soap.cxf.PayRequestRecurringResponse;

/**
 * Tests related to PayRequestRecurring
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class PayRequestRecurringTest extends PayPortParentTest {

	@Autowired
	PayPortTestDataSupplier	payPortTestDataSupplier;

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();

		externalId = externalId + System.nanoTime() + "_";
		logger.debug("externalId: [" + externalId + "]");
	}

	/**
	 * Tests the PayRequestRecurring operation
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

	/**
	 * Prepares an {@link PayRequestRecurringDetails} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the ${@link PayRequestRecurringDetails}
	 */
	private PayRequestRecurringDetails preparePayRequestRecurringDetails() {
		final PayRequestRecurringDetails payRequestRecurringDetails = new PayRequestRecurringDetails();

		payRequestRecurringDetails.setAmount(prepareMoney(payPortTestDataSupplier.getPayRequestRecurringAmount(), payPortTestDataSupplier.getPayRequestRecurringCurrency()));
		payRequestRecurringDetails.setExternalID(externalId);
		payRequestRecurringDetails.setRecurringPaymentAuthorizationID(payPortTestDataSupplier.getPayRequestRecurringPaymentAuthorizationID());

		return payRequestRecurringDetails;
	}

}
