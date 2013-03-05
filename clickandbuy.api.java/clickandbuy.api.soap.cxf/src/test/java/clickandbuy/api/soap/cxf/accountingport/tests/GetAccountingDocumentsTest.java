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
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.accountingport.parent.AccountingPortParentTest;

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

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the GetAccountingDocuments
	 * 
	 * @throws ParseException
	 * @throws DatatypeConfigurationException
	 */
	@Test
	public void testGetAccountingDocuments() throws DatatypeConfigurationException, ParseException {
		GetAccountingDocumentsResponse getAccountingDocumentsResponse = null;

		GetAccountingDocumentsRequest getAccountingDocumentsRequest = new GetAccountingDocumentsRequest();
		getAccountingDocumentsRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		getAccountingDocumentsRequest.setDetails(prepareGetAccountingDocumentDetails());

		try {
			getAccountingDocumentsResponse = accountingPortType.getAccountingDocuments(getAccountingDocumentsRequest);
			logger.debug("Created transaction with Id: " + getAccountingDocumentsResponse.getRequestTrackingID());
			logger.debug("Retrieved the following document list: " + getAccountingDocumentsResponse.getDocumentList());
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

		final DateRange dateRange = new DateRange();
		final long dateRAfter = CabApiUniqueDateFormat.getDayDateFormatter().parse(testData.getDateRangeAfter().trim()).getTime();
		final long dateRBefore = CabApiUniqueDateFormat.getDayDateFormatter().parse(testData.getDateRangeBefore().trim()).getTime();

		final GregorianCalendar gregory = new GregorianCalendar();
		gregory.setTime(new Date(dateRAfter));
		final XMLGregorianCalendar beginningDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);

		gregory.setTime(new Date(dateRBefore));
		final XMLGregorianCalendar endingDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);

		dateRange.setAfter(beginningDate);
		dateRange.setBefore(endingDate);

		final IntRange intRange = new IntRange();
		intRange.setFrom(testData.getIntRangeFrom());
		intRange.setUntil(testData.getIntRangeUntil());

		PagingSetting pagingSetting = new PagingSetting();
		pagingSetting.setMaxResults(testData.getMaxResults());
		pagingSetting.setSkip(testData.getSkip());

		getAccountingDocumentDetails.setDate(dateRange);
		getAccountingDocumentDetails.setDocumentNumber(intRange);
		// getAccountingDocumentDetails.setDocumentType(accountingDocumentType);
		// getAccountingDocumentDetails.setFileName(fileName);
		// getAccountingDocumentDetails.setFileType(accountingFileType);
		getAccountingDocumentDetails.setPaging(pagingSetting);

		return getAccountingDocumentDetails;
	}
}
