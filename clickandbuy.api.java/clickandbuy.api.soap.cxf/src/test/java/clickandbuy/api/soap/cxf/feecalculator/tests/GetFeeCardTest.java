package clickandbuy.api.soap.cxf.feecalculator.tests;

import java.math.BigDecimal;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.feecalculator.parent.FeeCalculatorPortParentTest;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.GetFeeCardCategoriesDetails;
import com.clickandbuy.api.soap.cxf.GetFeeCardCategoriesRequest;
import com.clickandbuy.api.soap.cxf.GetFeeCardCategoriesResponse;
import com.clickandbuy.api.soap.cxf.GetFeeCardDetails;
import com.clickandbuy.api.soap.cxf.GetFeeCardRequest;
import com.clickandbuy.api.soap.cxf.GetFeeCardResponse;
import com.clickandbuy.api.soap.cxf.Money;

/**
 * Tests related to GetFeeCard
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetFeeCardTest extends FeeCalculatorPortParentTest {

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the GetFeeCard
	 * 
	 * @throws ErrorDetails_Exception
	 */
	@Test
	public void testGetFeeCard() throws ErrorDetails_Exception {
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

		// prepare getFeeCard request.
		GetFeeCardResponse getFeeCardResponse = null;
		final GetFeeCardRequest getFeeCardRequest = new GetFeeCardRequest();
		getFeeCardRequest.setDetails(prepareGetFeeCardDetails(getFeeCardCategoriesResponse));

		try {
			getFeeCardResponse = feeCalculatorPortType.getFeeCard(getFeeCardRequest);
			logger.debug("Created transaction with Id: " + getFeeCardResponse.getCommissionList());
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}

		// we need to be sure we have some categories.
		Assert.assertNotNull(getFeeCardResponse);
		Assert.assertNotNull(getFeeCardResponse.getCommissionList());
		Assert.assertNotNull(getFeeCardResponse.getCommissionList().getCommission());
		Assert.assertTrue(getFeeCardResponse.getCommissionList().getCommission().size() > 0);
	}

	/**
	 * @param getFeeCardCategoriesResponse
	 * @return
	 */
	public GetFeeCardDetails prepareGetFeeCardDetails(final GetFeeCardCategoriesResponse getFeeCardCategoriesResponse) {
		final GetFeeCardDetails getFeeCardDetails = new GetFeeCardDetails();

		final Money money = new Money();
		// TODO move this in the test data.
		money.setAmount(new BigDecimal(1));
		money.setCurrency("EUR");

		getFeeCardDetails.setBusinessOriginID(businessOriginID);
		// TODO ; move this setting to test data
		getFeeCardDetails.setInvoicingCycle(1);
		getFeeCardDetails.setSettlementDelay(1);
		getFeeCardDetails.setAverageTicketSize(money);
		getFeeCardDetails.setCategoryID(getFeeCardCategoriesResponse.getCategoryList().getCategory().get(0).getCategoryID());

		return getFeeCardDetails;
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
