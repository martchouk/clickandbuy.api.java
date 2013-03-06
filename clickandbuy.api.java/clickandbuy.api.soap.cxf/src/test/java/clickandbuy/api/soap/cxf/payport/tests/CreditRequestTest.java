/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.payport.data.PayPortTestDataSupplier;
import clickandbuy.api.soap.cxf.payport.parent.PayPortParentTest;

import com.clickandbuy.api.soap.cxf.CreditRecipientIdentifier;
import com.clickandbuy.api.soap.cxf.CreditRequestDetails;
import com.clickandbuy.api.soap.cxf.CreditRequestRequest;
import com.clickandbuy.api.soap.cxf.CreditRequestResponse;
import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.Money;

/**
 * Tests related to CreditRequest
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CreditRequestTest extends PayPortParentTest {

	@Autowired
	PayPortTestDataSupplier	payPortTestDataSupplier;

	/**
	 * 
	 */
	@Before
	public void setUp() {
		configureCertificatesPolicy();

		externalId = externalId + System.nanoTime() + "_";
		logger.debug("externalId: [" + externalId + "]");
	}

	/**
	 * Tests the CreditRequest operation
	 */
	@Test
	public void testCreditRequest() {
		CreditRequestResponse creditRequestResponse = null;

		CreditRequestRequest creditRequestRequest = new CreditRequestRequest();
		creditRequestRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		creditRequestRequest.setDetails(prepareCreditRequestDetails());

		try {
			creditRequestResponse = payPortType.creditRequest(creditRequestRequest);

			Assert.assertNotNull("creditRequestResponse should not be null!", creditRequestResponse);
			Assert.assertNotNull("creditRequestResponse.getTransaction() should not be null!", creditRequestResponse.getTransaction());
			Assert.assertNotNull("creditRequestResponse.getTransaction().getTransactionID() should not be null!", creditRequestResponse.getTransaction().getTransactionID());
			Assert.assertNotNull("creditRequestResponse.getTransaction().getTransactionStatus() should not be null!", creditRequestResponse.getTransaction().getTransactionStatus());
			Assert.assertNotNull("creditRequestResponse.getTransaction().getTransactionType() should not be null!", creditRequestResponse.getTransaction().getTransactionType());

			logger.debug("Created transaction with ID: [" + creditRequestResponse.getTransaction().getTransactionID() + "]");
			logger.debug("Having transaction status: [" + creditRequestResponse.getTransaction().getTransactionStatus() + "]");
			logger.debug("And transaction type: [" + creditRequestResponse.getTransaction().getTransactionType() + "]");
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}
	}

	/**
	 * Prepares an {@link CreditRequestDetails} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the ${@link CreditRequestDetails}
	 */
	private CreditRequestDetails prepareCreditRequestDetails() {
		CreditRequestDetails creditRequestDetails = new CreditRequestDetails();

		creditRequestDetails.setAmount(prepareMoney());
		creditRequestDetails.setExternalID(externalId);
		creditRequestDetails.setRecipient(prepareCreditRecipientIdentifier());

		return creditRequestDetails;
	}

	/**
	 * Prepares an {@link Money} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the ${@link Money}
	 */
	private Money prepareMoney() {
		Money money = new Money();

		money.setAmount(payPortTestDataSupplier.getCreditRequestMoneyAmount());
		money.setCurrency(payPortTestDataSupplier.getCreditRequestMoneyCurrency());

		return money;
	}

	/**
	 * Prepares an {@link CreditRecipientIdentifier} based on the test data provided by {@link PayPortTestDataSupplier}
	 * 
	 * @return the ${@link CreditRecipientIdentifier}
	 */
	private CreditRecipientIdentifier prepareCreditRecipientIdentifier() {
		CreditRecipientIdentifier creditRecipientIdentifier = new CreditRecipientIdentifier();

		// creditRecipientIdentifier.setCrn(payPortTestDataSupplier.getCreditRequestCrn());
		creditRecipientIdentifier.setEmailAddress(payPortTestDataSupplier.getCreditRequestEmail());

		return creditRecipientIdentifier;
	}
}
