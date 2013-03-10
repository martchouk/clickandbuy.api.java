/**
 * 
 */
package clickandbuy.api.soap.cxf.accountingport.tests;

import static clickandbuy.api.soap.cxf.util.TestUtil.toXMLGregorianCalendar;

import java.text.ParseException;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.accountingport.data.AccountingPortTestDataSupplier;
import clickandbuy.api.soap.cxf.accountingport.parent.AccountingPortParentTest;

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
 * @author Ciprian I. Ileana
 * @author Nicolae.Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetAccountingDocumentsTest extends AccountingPortParentTest {

	/**
	 * class logger.
	 */
	private static final Logger	logger	= Logger.getLogger(GetAccountingDocumentsTest.class);

	/**
	 * test setup.
	 */
	@Before
	public void setUp() {
		configureCertificatesPolicy();
	}

	/**
	 * Test the GetAccountingDocuments
	 * 
	 * @throws DatatypeConfigurationException
	 * @throws ParseException
	 * @throws ErrorDetails_Exception
	 *             if during communication (between the client API implementation and the ClickandBuy API system) the communication is disturbed or a logical or technical error occurs. The response from ClickandBuy system contains detailed
	 *             error messages which facilitate the localization and eradication of the problem.
	 */
	@Test
	public void testGetAccountingDocuments() throws DatatypeConfigurationException, ParseException, ErrorDetails_Exception {
		GetAccountingDocumentsResponse getAccountingDocumentsResponse = null;

		final GetAccountingDocumentsRequest getAccountingDocumentsRequest = new GetAccountingDocumentsRequest();
		getAccountingDocumentsRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		getAccountingDocumentsRequest.setDetails(prepareGetAccountingDocumentDetails());

		try {
			getAccountingDocumentsResponse = accountingPortType.getAccountingDocuments(getAccountingDocumentsRequest);
			logger.debug("Created transaction with Id: " + getAccountingDocumentsResponse.getRequestTrackingID());
			logger.debug("Retrieved the following document list: " + getAccountingDocumentsResponse.getDocumentList());
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}
	}

	/**
	 * Prepares an {@link GetAccountingDocumentDetails} based on the test data provided by {@link AccountingPortTestDataSupplier}
	 * 
	 * @return the ${@link GetAccountingDocumentDetails}
	 * 
	 * @throws DatatypeConfigurationException
	 * @throws ParseException
	 */
	private GetAccountingDocumentDetails prepareGetAccountingDocumentDetails() throws DatatypeConfigurationException, ParseException {
		final GetAccountingDocumentDetails getAccountingDocumentDetails = new GetAccountingDocumentDetails();

		final DateRange dateRange = new DateRange();

		final XMLGregorianCalendar beginningDate = toXMLGregorianCalendar(testData.getDateRangeAfter());
		final XMLGregorianCalendar endingDate = toXMLGregorianCalendar(testData.getDateRangeBefore());

		dateRange.setAfter(beginningDate);
		dateRange.setBefore(endingDate);

		final IntRange intRange = new IntRange();
		intRange.setFrom(testData.getIntRangeFrom());
		intRange.setUntil(testData.getIntRangeUntil());

		final PagingSetting pagingSetting = new PagingSetting();
		pagingSetting.setMaxResults(testData.getMaxResults());
		pagingSetting.setSkip(testData.getSkip());

		getAccountingDocumentDetails.setDate(dateRange);
		getAccountingDocumentDetails.setDocumentNumber(intRange);
		getAccountingDocumentDetails.setPaging(pagingSetting);

		return getAccountingDocumentDetails;
	}
}
