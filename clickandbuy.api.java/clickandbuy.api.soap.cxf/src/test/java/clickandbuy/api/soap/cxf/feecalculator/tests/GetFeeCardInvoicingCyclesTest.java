package clickandbuy.api.soap.cxf.feecalculator.tests;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.feecalculator.parent.FeeCalculatorPortParentTest;
import clickandbuy.api.soap.cxf.util.TestUtil;

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
	 * fee card categories list response.
	 */
	private GetFeeCardCategoriesResponse	getFeeCardCategoriesResponse	= null;

	/**
	 * test setup.
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
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
	 * @param getFeeCardCategoriesResponse
	 * @return
	 */
	private GetFeeCardInvoicingCyclesDetails prepareGetFeeCardInvoicingCyclesDetails(final GetFeeCardCategoriesResponse getFeeCardCategoriesResponse) {
		final GetFeeCardInvoicingCyclesDetails getFeeCardInvoicingCyclesDetails = new GetFeeCardInvoicingCyclesDetails();
		getFeeCardInvoicingCyclesDetails.setBusinessOriginID(businessOriginID);
		final long categoryId = TestUtil.getCategoryFromList(getFeeCardCategoriesResponse.getCategoryList().getCategory(), testData.getGetFeeCardAverageTicketSizesRequestCategory().trim());
		getFeeCardInvoicingCyclesDetails.setCategoryID(categoryId);
		return getFeeCardInvoicingCyclesDetails;
	}

	/**
	 * request builder method for retrieving fee card categories.
	 * 
	 * @return
	 */
	private GetFeeCardCategoriesDetails prepareGetFeeCardCategoriesDetails() {
		final GetFeeCardCategoriesDetails getFeeCardCategoriesDetails = new GetFeeCardCategoriesDetails();
		getFeeCardCategoriesDetails.setBusinessOriginID(businessOriginID);
		return getFeeCardCategoriesDetails;
	}
}
