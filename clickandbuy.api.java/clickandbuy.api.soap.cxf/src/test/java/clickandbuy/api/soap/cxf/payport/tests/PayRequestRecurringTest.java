/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.payport.parent.PayPortParentTest;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.PayRequestRecurringDetails;
import com.clickandbuy.api.soap.cxf.PayRequestRecurringRequest;
import com.clickandbuy.api.soap.cxf.PayRequestRecurringResponse;

/**
 * Tests related to PayRequestRecurring
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class PayRequestRecurringTest extends PayPortParentTest {

	/** Test data */
	@Value("${externalId}")
	private String	externalId;

	@Value("${basketRisk}")
	private int		basketRisk;

	@Value("${clientRisk}")
	private int		clientRisk;

	@Value("${successExpiration}")
	private int		successExpiration;

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the PayRequestRecurring
	 */
	@Test
	public void testPayRequestRecurring() {
		PayRequestRecurringResponse payRequestRecurringResponse = null;

		PayRequestRecurringRequest payRequestRecurringRequest = new PayRequestRecurringRequest();
		payRequestRecurringRequest.setAuthentication(prepareAuthentication(merchantId, projectId, secretKey));
		payRequestRecurringRequest.setDetails(preparePayRequestRecurringDetails());

		try {
			payRequestRecurringResponse = payPortType.payRequestRecurring(payRequestRecurringRequest);
			logger.debug("Created transaction with Id: " + payRequestRecurringResponse.getTransaction().getTransactionID());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	private PayRequestRecurringDetails preparePayRequestRecurringDetails() {
		PayRequestRecurringDetails payRequestRecurringDetails = new PayRequestRecurringDetails();

		// TODO fill in necessary test data

		// payRequestRecurringDetails.setAmount(value);
		payRequestRecurringDetails.setBasketRisk(basketRisk);
		// payRequestRecurringDetails.setBilling(value);
		payRequestRecurringDetails.setClientRisk(clientRisk);
		payRequestRecurringDetails.setExternalID(externalId);
		// payRequestRecurringDetails.setOrderDetails(value);
		// payRequestRecurringDetails.setRecurringPaymentAuthorizationID(value);
		// payRequestRecurringDetails.setShipping(value);
		payRequestRecurringDetails.setSuccessExpiration(successExpiration);

		return payRequestRecurringDetails;
	}
}
