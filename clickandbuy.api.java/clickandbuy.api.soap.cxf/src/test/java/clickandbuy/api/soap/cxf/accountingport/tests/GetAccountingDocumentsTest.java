package clickandbuy.api.soap.cxf.accountingport.tests;

import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.soap.cxf.AccountingDocumentType;
import com.clickandbuy.api.soap.cxf.AccountingFileType;
import com.clickandbuy.api.soap.cxf.DateRange;
import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.GetAccountingDocumentDetails;
import com.clickandbuy.api.soap.cxf.GetAccountingDocumentsRequest;
import com.clickandbuy.api.soap.cxf.GetAccountingDocumentsResponse;
import com.clickandbuy.api.soap.cxf.IntRange;
import com.clickandbuy.api.soap.cxf.PagingSetting;

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
	
	// getAccountingDocuments.getAccountingDocumentsDetails.dateRange.after=
	// getAccountingDocuments.getAccountingDocumentsDetails.dateRange.before=

	// getAccountingDocuments.getAccountingDocumentsDetails.inteRange.fronm=
	// getAccountingDocuments.getAccountingDocumentsDetails.intRange.until=

	//accepted values INVOICE, SETTLEMENT, REVENUE, MANUAL_CREDIT_NOTE, MANUAL_DEBIT_NOTE, OTHER 
	// getAccountingDocuments.getAccountingDocumentsDetails.documentType=

	// getAccountingDocuments.getAccountingDocumentsDetails.fileName=

	//accepted values PDF, CSV, OTHER 
	// getAccountingDocuments.getAccountingDocumentsDetails.fileType=

	// getAccountingDocuments.getAccountingDocumentsDetails.pagingSetting.maxResults=
	// getAccountingDocuments.getAccountingDocumentsDetails.pagingSetting.skip=

	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.dateRange.after}")
	XMLGregorianCalendar dateRangeAfter;
	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.dateRange.before}")
	XMLGregorianCalendar dateRangeBefore;
	
	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.inteRange.fronm}")
	Integer intRangeFrom;
	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.intRange.until}")
	Integer intRangeUntil;

	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.documentType}")
	AccountingDocumentType accountingDocumentType;
	
	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.fileName}")
	String fileName;
	
	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.fileType}")
	AccountingFileType accountingFileType;
	
	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.pagingSetting.maxResults}")
	Integer maxResults;

	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.pagingSetting.skip}")
	Integer skip;	

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


		
		DateRange dateRange = new DateRange();
		dateRange.setAfter(dateRangeAfter);
		dateRange.setBefore(dateRangeBefore);
		
		IntRange intRange = new IntRange();
		intRange.setFrom(intRangeFrom);
		intRange.setUntil(intRangeUntil);

		PagingSetting pagingSetting = new PagingSetting();
		pagingSetting.setMaxResults(maxResults);
		pagingSetting.setSkip(skip);

		getAccountingDocumentDetails.setDate(dateRange);
		getAccountingDocumentDetails.setDocumentNumber(intRange);
		getAccountingDocumentDetails.setDocumentType(accountingDocumentType);
		getAccountingDocumentDetails.setFileName(fileName);
		getAccountingDocumentDetails.setFileType(accountingFileType);
		getAccountingDocumentDetails.setPaging(pagingSetting);

		return getAccountingDocumentDetails;
	}
}
