package clickandbuy.api.soap.cxf.accountingport.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.GetAccountingDocumentDetails;
import com.clickandbuy.api.soap.cxf.GetAccountingDocumentsRequest;
import com.clickandbuy.api.soap.cxf.GetAccountingDocumentsResponse;

/**
 * Tests related to GetAccountingDocuments
 * 
 * @author Ciprian.Ileana
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetAccountingDocumentsTest extends AccountingPortParentTest {

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
	 * Test the GetAccountingDocuments
	 */
	@Test
	public void testGetAccountingDocuments() {
		GetAccountingDocumentsResponse getAccountingDocumentsResponse = null;

		GetAccountingDocumentsRequest getAccountingDocumentsRequest = new GetAccountingDocumentsRequest();
		getAccountingDocumentsRequest.setAuthentication(prepareAuthentication(merchantId, projectId, secretKey));
		getAccountingDocumentsRequest.setDetails(prepareGetAccountingDocumentDetails());

		try {
			getAccountingDocumentsResponse = accountingPortType.getAccountingDocuments(getAccountingDocumentsRequest);
			logger.debug("Created transaction with Id: " + getAccountingDocumentsResponse.getRequestTrackingID());
			logger.debug("Created transaction with Id: " + getAccountingDocumentsResponse.getDocumentList());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	public GetAccountingDocumentDetails prepareGetAccountingDocumentDetails() {
		GetAccountingDocumentDetails getAccountingDocumentDetails = new GetAccountingDocumentDetails();

		// TODO fill in necessary test data

		// getAccountingDocumentDetails.setDate(value);
		// getAccountingDocumentDetails.setDocumentNumber(value);
		// getAccountingDocumentDetails.setDocumentType(value);
		// getAccountingDocumentDetails.setFileName(value);
		// getAccountingDocumentDetails.setFileType(value);
		// getAccountingDocumentDetails.setPaging(value);

		return getAccountingDocumentDetails;
	}
}
