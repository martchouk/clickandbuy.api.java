package clickandbuy.api.soap.cxf.payport.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.soap.cxf.CreditRequestDetails;
import com.clickandbuy.api.soap.cxf.CreditRequestRequest;
import com.clickandbuy.api.soap.cxf.CreditRequestResponse;
import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;

/**
 * Tests related to CreditRequest
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CreditRequestTest extends PayPortParentTest {

	/** Test data */
	@Value("${merchantId}")
	private long	merchantId;

	@Value("${projectId}")
	private long	projectId;

	@Value("${secretKey}")
	private String	secretKey;

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the CreditRequest
	 */
	@Test
	public void testCreditRequest() {
		CreditRequestResponse creditRequestResponse = null;

		CreditRequestRequest creditRequestRequest = new CreditRequestRequest();
		creditRequestRequest.setAuthentication(prepareAuthentication(merchantId, projectId, secretKey));
		creditRequestRequest.setDetails(prepareCreditRequestDetails());

		try {
			creditRequestResponse = payPortType.creditRequest(creditRequestRequest);
			logger.debug("Created transaction with Id: " + creditRequestResponse.getTransaction().getTransactionID());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	public CreditRequestDetails prepareCreditRequestDetails() {
		CreditRequestDetails creditRequestDetails = new CreditRequestDetails();

		// TODO fill in necessary test data

		// creditRequestDetails.setAmount(value);
		// creditRequestDetails.setConsumerLanguage(value);
		// creditRequestDetails.setExternalID(value);
		// creditRequestDetails.setOrderDetails(value);
		// creditRequestDetails.setRecipient(value);

		return creditRequestDetails;
	}
}
