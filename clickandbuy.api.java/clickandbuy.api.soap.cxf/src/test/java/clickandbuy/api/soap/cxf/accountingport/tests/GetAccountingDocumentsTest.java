package clickandbuy.api.soap.cxf.accountingport.tests;

import java.text.ParseException;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
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
import com.clickandbuy.api.util.auth.CabApiUniqueDateFormat;

/**
 * Tests related to GetAccountingDocuments
 * 
 * @author Ciprian I. Ileana
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetAccountingDocumentsTest extends AccountingPortParentTest {

	/** Test data */	
	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.dateRange.after}")
	private String dateRangeAfter;
	
	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.dateRange.before}")
	private String dateRangeBefore;
	
	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.inteRange.from}")
	private Integer intRangeFrom;
	
	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.intRange.until}")
	private Integer intRangeUntil;

	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.documentType}")
	private String accountingDocumentType;
	
	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.fileName}")
	private String fileName;
	
	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.fileType}")
	private String accountingFileType;
	
	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.pagingSetting.maxResults}")
	private Integer maxResults;

	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.pagingSetting.skip}")
	private Integer skip;	

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the GetAccountingDocuments
	 * @throws ParseException 
	 * @throws DatatypeConfigurationException 
	 */
	@Test
	public void testGetAccountingDocuments() throws DatatypeConfigurationException, ParseException {
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
	 * @throws DatatypeConfigurationException 
	 * @throws ParseException 
	 */
	public GetAccountingDocumentDetails prepareGetAccountingDocumentDetails() throws DatatypeConfigurationException, ParseException {
		GetAccountingDocumentDetails getAccountingDocumentDetails = new GetAccountingDocumentDetails();

		// TODO fill in necessary test data

		final DateRange dateRange = new DateRange();
		final long dateRAfter = CabApiUniqueDateFormat.getDayDateFormatter().parse(dateRangeAfter.trim()).getTime();
		final long dateRBefore = CabApiUniqueDateFormat.getDayDateFormatter().parse(dateRangeBefore.trim()).getTime();
		
		final GregorianCalendar gregory = new GregorianCalendar();
		gregory.setTime(new Date(dateRAfter));
		final XMLGregorianCalendar beginningDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);
		
		gregory.setTime(new Date(dateRBefore));
		final XMLGregorianCalendar endingDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);
		
		dateRange.setAfter(beginningDate);
		dateRange.setBefore(endingDate);
		
		final IntRange intRange = new IntRange();
		intRange.setFrom(intRangeFrom);
		intRange.setUntil(intRangeUntil);

		PagingSetting pagingSetting = new PagingSetting();
		pagingSetting.setMaxResults(maxResults);
		//pagingSetting.setSkip(skip);

		getAccountingDocumentDetails.setDate(dateRange);
		getAccountingDocumentDetails.setDocumentNumber(intRange);
		//getAccountingDocumentDetails.setDocumentType(accountingDocumentType);
		//getAccountingDocumentDetails.setFileName(fileName);
		//getAccountingDocumentDetails.setFileType(accountingFileType);
		getAccountingDocumentDetails.setPaging(pagingSetting);

		return getAccountingDocumentDetails;
	}
}
