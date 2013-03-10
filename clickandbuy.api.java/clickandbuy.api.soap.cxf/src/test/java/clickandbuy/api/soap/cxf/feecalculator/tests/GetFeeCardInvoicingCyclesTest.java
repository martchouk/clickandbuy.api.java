/**
 * 
 */
package clickandbuy.api.soap.cxf.feecalculator.tests;

import static clickandbuy.api.soap.cxf.util.TestUtil.getCategoryFromList;
import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.feecalculator.data.FeeCalculatorPortTestDataSupplier;
import clickandbuy.api.soap.cxf.feecalculator.parent.FeeCalculatorPortParentTest;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.GetFeeCardCategoriesDetails;
import com.clickandbuy.api.soap.cxf.GetFeeCardCategoriesRequest;
import com.clickandbuy.api.soap.cxf.GetFeeCardCategoriesResponse;
import com.clickandbuy.api.soap.cxf.GetFeeCardInvoicingCyclesDetails;
import com.clickandbuy.api.soap.cxf.GetFeeCardInvoicingCyclesRequest;
import com.clickandbuy.api.soap.cxf.GetFeeCardInvoicingCyclesResponse;

/**
 * Tests related to GetFeeCardInvoicingCycles
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetFeeCardInvoicingCyclesTest extends FeeCalculatorPortParentTest {

	/**
	 * class logger.
	 */
	private static final Logger				logger							= Logger.getLogger(GetFeeCardInvoicingCyclesTest.class);

	/**
	 * fee card categories list response.
	 */
	private GetFeeCardCategoriesResponse	getFeeCardCategoriesResponse	= null;

	/**
	 * test setup.
	 * 
	 * @throws ErrorDetails_Exception
	 *             if during communication (between the client API implementation and the ClickandBuy API system) the communication is disturbed or a logical or technical error occurs. The response from ClickandBuy system contains detailed
	 *             error messages which facilitate the localization and eradication of the problem.
	 */
	@Before
	public void setUp() throws ErrorDetails_Exception {
		configureCertificatesPolicy();

		// prepare fee card categories request.
		final GetFeeCardCategoriesRequest feeCardCategories = new GetFeeCardCategoriesRequest();
		feeCardCategories.setDetails(prepareGetFeeCardCategoriesDetails());

		// get the fee card categories, to be used further for fee card request.
		try {
			getFeeCardCategoriesResponse = feeCalculatorPortType.getFeeCardCategories(feeCardCategories);
			logger.debug("Created transaction with Id: " + getFeeCardCategoriesResponse.getCategoryList());
			logger.debug("Found the following categories " + getFeeCardCategoriesResponse.getCategoryList().getCategory());
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}

		// we need to be sure we have some categories.
		Assert.assertNotNull(getFeeCardCategoriesResponse);
		Assert.assertNotNull(getFeeCardCategoriesResponse.getCategoryList());
		Assert.assertNotNull(getFeeCardCategoriesResponse.getCategoryList().getCategory());
		Assert.assertTrue(getFeeCardCategoriesResponse.getCategoryList().getCategory().size() > 0);
	}

	/**
	 * Test the GetFeeCardInvoicingCycles
	 * 
	 * @throws ErrorDetails_Exception
	 *             if during communication (between the client API implementation and the ClickandBuy API system) the communication is disturbed or a logical or technical error occurs. The response from ClickandBuy system contains detailed
	 *             error messages which facilitate the localization and eradication of the problem.
	 */
	@Test
	public void testGetFeeCardInvoicingCycles() throws ErrorDetails_Exception {
		GetFeeCardInvoicingCyclesResponse getFeeCardInvoicingCyclesResponse = null;
		final GetFeeCardInvoicingCyclesRequest getFeeCardInvoicingCyclesRequest = new GetFeeCardInvoicingCyclesRequest();
		getFeeCardInvoicingCyclesRequest.setDetails(prepareGetFeeCardInvoicingCyclesDetails(getFeeCardCategoriesResponse));

		try {
			getFeeCardInvoicingCyclesResponse = feeCalculatorPortType.getFeeCardInvoicingCycles(getFeeCardInvoicingCyclesRequest);
			logger.debug("Created transaction with Id: " + getFeeCardInvoicingCyclesResponse.getInvoicingCycleList());
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}

		// we need to be sure we have some categories.
		Assert.assertNotNull(getFeeCardInvoicingCyclesResponse);
		Assert.assertNotNull(getFeeCardInvoicingCyclesResponse.getInvoicingCycleList());
		Assert.assertNotNull(getFeeCardInvoicingCyclesResponse.getInvoicingCycleList().getInvoicingCycle());
		Assert.assertTrue(getFeeCardInvoicingCyclesResponse.getInvoicingCycleList().getInvoicingCycle().size() > 0);
	}

	/**
	 * Prepares an {@link GetFeeCardInvoicingCyclesDetails} based on the test data provided by {@link FeeCalculatorPortTestDataSupplier}, and the card categories response .
	 * 
	 * @return the ${@link GetFeeCardInvoicingCyclesDetails}
	 */
	private GetFeeCardInvoicingCyclesDetails prepareGetFeeCardInvoicingCyclesDetails(final GetFeeCardCategoriesResponse getFeeCardCategoriesResponse) {
		final GetFeeCardInvoicingCyclesDetails getFeeCardInvoicingCyclesDetails = new GetFeeCardInvoicingCyclesDetails();

		getFeeCardInvoicingCyclesDetails.setBusinessOriginID(businessOriginID);
		final long categoryId = getCategoryFromList(getFeeCardCategoriesResponse.getCategoryList().getCategory(), testData.getGetFeeCardAverageTicketSizesRequestCategory().trim());
		getFeeCardInvoicingCyclesDetails.setCategoryID(categoryId);

		return getFeeCardInvoicingCyclesDetails;
	}

	/**
	 * Prepares an {@link GetFeeCardCategoriesDetails} based on the test data provided by {@link FeeCalculatorPortTestDataSupplier}
	 * 
	 * @return the ${@link GetFeeCardCategoriesDetails}
	 */
	private GetFeeCardCategoriesDetails prepareGetFeeCardCategoriesDetails() {
		final GetFeeCardCategoriesDetails getFeeCardCategoriesDetails = new GetFeeCardCategoriesDetails();

		getFeeCardCategoriesDetails.setBusinessOriginID(businessOriginID);

		return getFeeCardCategoriesDetails;
	}
}
