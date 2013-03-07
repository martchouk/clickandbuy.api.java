/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import static clickandbuy.api.soap.cxf.util.TestUtil.prepareMoney;
import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.payport.data.PayPortTestDataSupplier;
import clickandbuy.api.soap.cxf.payport.parent.PayPortParentTest;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.RefundRequestDetails;
import com.clickandbuy.api.soap.cxf.RefundRequestRequest;
import com.clickandbuy.api.soap.cxf.RefundRequestResponse;

/**
 * Tests related to RefundRequest
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class RefundRequestTest extends PayPortParentTest {

	/**
	 * class logger.
	 */
	private static final Logger		logger	= Logger.getLogger(RefundRequestTest.class);

	/**
	 * test data supplier.
	 */
	@Autowired
	private PayPortTestDataSupplier	payPortTestDataSupplier;

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
	 * Tests the RefundRequest operation
	 */
	@Test
	public void testRefundRequest() {
		RefundRequestResponse refundRequestResponse = null;

		final RefundRequestRequest refundRequestRequest = new RefundRequestRequest();
		refundRequestRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		refundRequestRequest.setDetails(prepareRefundRequestDetails());

		try {
			refundRequestResponse = payPortType.refundRequest(refundRequestRequest);

			Assert.assertNotNull("refundRequestResponse should not be null!", refundRequestResponse);
			Assert.assertNotNull("refundRequestResponse.getTransaction() should not be null!", refundRequestResponse.getTransaction());
			Assert.assertNotNull("refundRequestResponse.getTransaction().getTransactionID() should not be null!", refundRequestResponse.getTransaction().getTransactionID());
			Assert.assertNotNull("refundRequestResponse.getTransaction().getTransactionStatus() should not be null!", refundRequestResponse.getTransaction().getTransactionStatus());
			Assert.assertNotNull("refundRequestResponse.getTransaction().getTransactionType() should not be null!", refundRequestResponse.getTransaction().getTransactionType());

			logger.debug("Requested refund for transaction with ID: [" + refundRequestResponse.getTransaction().getTransactionID() + "]");
			logger.debug("Having transaction status: [" + refundRequestResponse.getTransaction().getTransactionStatus() + "]");
			logger.debug("And transaction type: [" + refundRequestResponse.getTransaction().getTransactionType() + "]");
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}
	}

	/**
	 * Prepares an {@link RefundRequestDetails} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the ${@link RefundRequestDetails}
	 */
	private RefundRequestDetails prepareRefundRequestDetails() {
		final RefundRequestDetails refundRequestDetails = new RefundRequestDetails();

		refundRequestDetails.setAmount(prepareMoney(payPortTestDataSupplier.getPayRequestAmount(), payPortTestDataSupplier.getPayRequestCurrency()));
		refundRequestDetails.setTransactionID(payPortTestDataSupplier.getRefundRequestTransactionID());

		return refundRequestDetails;
	}
}
