/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.payport.parent.PayPortParentTest;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.RefundRequestDetails;
import com.clickandbuy.api.soap.cxf.RefundRequestRequest;
import com.clickandbuy.api.soap.cxf.RefundRequestResponse;

/**
 * Tests related to RefundRequest
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class RefundRequestTest extends PayPortParentTest {

	/** Test data */

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the RefundRequest
	 */
	@Test
	public void testRefundRequest() {
		RefundRequestResponse refundRequestResponse = null;

		RefundRequestRequest refundRequestRequest = new RefundRequestRequest();
		refundRequestRequest.setAuthentication(prepareAuthentication(merchantId, projectId, secretKey));
		refundRequestRequest.setDetails(prepareRefundRequestDetails());

		try {
			refundRequestResponse = payPortType.refundRequest(refundRequestRequest);
			logger.debug("Created transaction with Id: " + refundRequestResponse.getTransaction().getTransactionID());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	public RefundRequestDetails prepareRefundRequestDetails() {
		RefundRequestDetails refundRequestDetails = new RefundRequestDetails();

		// TODO fill in necessary test data

		// refundRequestDetails.setAmount(value);
		// refundRequestDetails.setExternalID(value);
		// refundRequestDetails.setOrderDetails(value);
		// refundRequestDetails.setTransactionID(value);

		return refundRequestDetails;
	}
}
