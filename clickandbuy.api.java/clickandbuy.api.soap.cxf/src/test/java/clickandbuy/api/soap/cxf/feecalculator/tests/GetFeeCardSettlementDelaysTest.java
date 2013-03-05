package clickandbuy.api.soap.cxf.feecalculator.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.feecalculator.parent.FeeCalculatorPortParentTest;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.GetFeeCardCategoriesDetails;
import com.clickandbuy.api.soap.cxf.GetFeeCardCategoriesRequest;
import com.clickandbuy.api.soap.cxf.GetFeeCardCategoriesResponse;
import com.clickandbuy.api.soap.cxf.GetFeeCardSettlementDelaysDetails;
import com.clickandbuy.api.soap.cxf.GetFeeCardSettlementDelaysRequest;
import com.clickandbuy.api.soap.cxf.GetFeeCardSettlementDelaysResponse;

/**
 * Tests related to GetFeeCardSettlementDelays
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetFeeCardSettlementDelaysTest extends FeeCalculatorPortParentTest {

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the GetFeeCardSettlementDelays
	 * 
	 * @throws ErrorDetails_Exception
	 */
	@Test
	public void testGetFeeCardSettlementDelays() throws ErrorDetails_Exception {
		// prepare fee card categories request.
		GetFeeCardCategoriesResponse getFeeCardCategoriesResponse = null;
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

		GetFeeCardSettlementDelaysResponse getFeeCardSettlementDelaysResponse = null;
		// prepare the request
		final GetFeeCardSettlementDelaysRequest feeCardSettlementDelaysRequest = new GetFeeCardSettlementDelaysRequest();
		feeCardSettlementDelaysRequest.setDetails(prepareGetFeeCardSettlementDelaysDetails(getFeeCardCategoriesResponse));

		// perform the request.
		try {
			getFeeCardSettlementDelaysResponse = feeCalculatorPortType.getFeeCardSettlementDelays(feeCardSettlementDelaysRequest);
			logger.debug("Created transaction with Id: " + getFeeCardSettlementDelaysResponse.getSettlementDelayList());
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}

		// assert everything ok.
		Assert.assertNotNull(getFeeCardSettlementDelaysResponse);
		Assert.assertNotNull(getFeeCardSettlementDelaysResponse.getSettlementDelayList());
		Assert.assertNotNull(getFeeCardSettlementDelaysResponse.getSettlementDelayList().getSettlementDelay());
		Assert.assertTrue(getFeeCardSettlementDelaysResponse.getSettlementDelayList().getSettlementDelay().size() > 0);
	}

	/**
	 * @param getFeeCardCategoriesResponse
	 * @return
	 */
	public GetFeeCardSettlementDelaysDetails prepareGetFeeCardSettlementDelaysDetails(final GetFeeCardCategoriesResponse getFeeCardCategoriesResponse) {
		final GetFeeCardSettlementDelaysDetails getFeeCardSettlementDelaysDetails = new GetFeeCardSettlementDelaysDetails();
		getFeeCardSettlementDelaysDetails.setBusinessOriginID(businessOriginID);
		// TODO: FIX this , make it more nice (e.g. : configure category name in test data and search for it in the retrieved categories list)
		getFeeCardSettlementDelaysDetails.setCategoryID(getFeeCardCategoriesResponse.getCategoryList().getCategory().get(0).getCategoryID());

		return getFeeCardSettlementDelaysDetails;
	}

	/**
	 * request builder method for retrieving fee card categories.
	 * 
	 * @return
	 */
	public GetFeeCardCategoriesDetails prepareGetFeeCardCategoriesDetails() {
		final GetFeeCardCategoriesDetails getFeeCardCategoriesDetails = new GetFeeCardCategoriesDetails();
		getFeeCardCategoriesDetails.setBusinessOriginID(businessOriginID);

		return getFeeCardCategoriesDetails;
	}
}
