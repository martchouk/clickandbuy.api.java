/**
 * 
 */
package clickandbuy.api.soap.cxf.feecalculator.tests;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.feecalculator.data.FeeCalculatorPortTestDataSupplier;
import clickandbuy.api.soap.cxf.feecalculator.parent.FeeCalculatorPortParentTest;
import clickandbuy.api.soap.cxf.util.TestUtil;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.GetFeeCardAverageTicketSizesDetails;
import com.clickandbuy.api.soap.cxf.GetFeeCardAverageTicketSizesRequest;
import com.clickandbuy.api.soap.cxf.GetFeeCardAverageTicketSizesResponse;
import com.clickandbuy.api.soap.cxf.GetFeeCardCategoriesDetails;
import com.clickandbuy.api.soap.cxf.GetFeeCardCategoriesRequest;
import com.clickandbuy.api.soap.cxf.GetFeeCardCategoriesResponse;

/**
 * Tests related to GetFeeCardAverageTicketSizes
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetFeeCardAverageTicketSizesTest extends FeeCalculatorPortParentTest {

	/**
	 * class logger.
	 */
	private static final Logger				logger							= Logger.getLogger(GetFeeCardAverageTicketSizesTest.class);

	/**
	 * fee card categories list response.
	 */
	private GetFeeCardCategoriesResponse	getFeeCardCategoriesResponse	= null;

	/**
	 * test setup
	 * 
	 * @throws ErrorDetails_Exception
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
	 * Test the GetFeeCardAverageTicketSizes
	 * 
	 * @throws ErrorDetails_Exception
	 */
	@Test
	public void testGetFeeCardAverageTicketSizes() throws ErrorDetails_Exception {
		GetFeeCardAverageTicketSizesResponse getFeeCardAverageTicketSizesResponse = null;

		final GetFeeCardAverageTicketSizesRequest getFeeCardAverageTicketSizesRequest = new GetFeeCardAverageTicketSizesRequest();
		getFeeCardAverageTicketSizesRequest.setDetails(prepareAddBatchItemDetails(getFeeCardCategoriesResponse));

		try {
			getFeeCardAverageTicketSizesResponse = feeCalculatorPortType.getFeeCardAverageTicketSizes(getFeeCardAverageTicketSizesRequest);
			logger.debug("Created transaction with Id: " + getFeeCardAverageTicketSizesResponse.getAverageTicketSizeList());
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}

		// we need to be sure we have some categories.
		Assert.assertNotNull(getFeeCardAverageTicketSizesResponse);
		Assert.assertNotNull(getFeeCardAverageTicketSizesResponse.getAverageTicketSizeList());
		Assert.assertNotNull(getFeeCardAverageTicketSizesResponse.getAverageTicketSizeList().getAverageTicketSize());
		Assert.assertTrue(getFeeCardAverageTicketSizesResponse.getAverageTicketSizeList().getAverageTicketSize().size() > 0);
	}

	/**
	 * Prepares an {@link GetFeeCardAverageTicketSizesDetails} based on the test data provided by {@link FeeCalculatorPortTestDataSupplier}
	 * 
	 * @return the ${@link GetFeeCardAverageTicketSizesDetails}
	 */
	private GetFeeCardAverageTicketSizesDetails prepareAddBatchItemDetails(final GetFeeCardCategoriesResponse getFeeCardCategoriesResponse) {
		final GetFeeCardAverageTicketSizesDetails getFeeCardAverageTicketSizesDetails = new GetFeeCardAverageTicketSizesDetails();

		getFeeCardAverageTicketSizesDetails.setBusinessOriginID(businessOriginID);
		final long categoryId = TestUtil.getCategoryFromList(getFeeCardCategoriesResponse.getCategoryList().getCategory(), testData.getGetFeeCardAverageTicketSizesRequestCategory().trim());
		getFeeCardAverageTicketSizesDetails.setCategoryID(categoryId);
		getFeeCardAverageTicketSizesDetails.setCurrency(testData.getGetFeeCardAverageTicketSizesRequestCurrency());

		return getFeeCardAverageTicketSizesDetails;
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
