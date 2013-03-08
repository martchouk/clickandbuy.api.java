package clickandbuy.api.soap.cxf.feecalculator.tests;

import java.math.BigDecimal;

import junit.framework.Assert;

import org.apache.log4j.Logger;
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
import com.clickandbuy.api.soap.cxf.GetFeeCardDetails;
import com.clickandbuy.api.soap.cxf.GetFeeCardRequest;
import com.clickandbuy.api.soap.cxf.GetFeeCardResponse;
import com.clickandbuy.api.soap.cxf.Money;

/**
 * Tests related to GetFeeCard
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetFeeCardTest extends FeeCalculatorPortParentTest {

	/**
	 * class logger.
	 */
	private static final Logger				logger							= Logger.getLogger(GetFeeCardTest.class);

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
	 * Test the GetFeeCard
	 * 
	 * @throws ErrorDetails_Exception
	 */
	@Test
	public void testGetFeeCard() throws ErrorDetails_Exception {
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
	private GetFeeCardDetails prepareGetFeeCardDetails(final GetFeeCardCategoriesResponse getFeeCardCategoriesResponse) {
		final GetFeeCardDetails getFeeCardDetails = new GetFeeCardDetails();

		final Money money = new Money();
		money.setAmount(new BigDecimal(testData.getGetFeeCardRequestAmount()));
		money.setCurrency(testData.getGetFeeCardRequestCurrency());

		getFeeCardDetails.setBusinessOriginID(businessOriginID);
		getFeeCardDetails.setInvoicingCycle(testData.getGetFeeCardRequestInvoicingCycle());
		getFeeCardDetails.setSettlementDelay(testData.getGetFeeCardRequestSettlementDelay());
		getFeeCardDetails.setAverageTicketSize(money);
		final long categoryID = TestUtil.getCategoryFromList(getFeeCardCategoriesResponse.getCategoryList().getCategory(), testData.getGetFeeCardAverageTicketSizesRequestCategory().trim());
		getFeeCardDetails.setCategoryID(categoryID);

		return getFeeCardDetails;
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
