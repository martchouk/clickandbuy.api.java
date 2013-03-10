/**
 * 
 */
package clickandbuy.api.soap.cxf.feecalculator.tests;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.feecalculator.data.FeeCalculatorPortTestDataSupplier;
import clickandbuy.api.soap.cxf.feecalculator.parent.FeeCalculatorPortParentTest;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.GetFeeCardCurrenciesDetails;
import com.clickandbuy.api.soap.cxf.GetFeeCardCurrenciesRequest;
import com.clickandbuy.api.soap.cxf.GetFeeCardCurrenciesResponse;

/**
 * Tests related to GetFeeCardCurrenciesTest
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetFeeCardCurrenciesTest extends FeeCalculatorPortParentTest {

	/**
	 * class logger.
	 */
	private static final Logger	logger	= Logger.getLogger(GetFeeCardCurrenciesTest.class);

	/**
	 * test setup.
	 */
	@Before
	public void setUp() {
		configureCertificatesPolicy();
	}

	/**
	 * Test the GetFeeCardCurrencies
	 * 
	 * @throws ErrorDetails_Exception
	 *             if during communication (between the client API implementation and the ClickandBuy API system) the communication is disturbed or a logical or technical error occurs. The response from ClickandBuy system contains detailed
	 *             error messages which facilitate the localization and eradication of the problem.
	 */
	@Test
	public void testGetFeeCardCurrencies() throws ErrorDetails_Exception {
		GetFeeCardCurrenciesResponse getFeeCardCurrenciesResponse = null;

		final GetFeeCardCurrenciesRequest getFeeCardCurrenciesRequest = new GetFeeCardCurrenciesRequest();
		getFeeCardCurrenciesRequest.setDetails(prepareGetFeeCardCurrenciesDetails());

		try {
			getFeeCardCurrenciesResponse = feeCalculatorPortType.getFeeCardCurrencies(getFeeCardCurrenciesRequest);
			logger.debug("Created transaction with Id: " + getFeeCardCurrenciesResponse.getCurrencyList());
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
			throw errorDetails_Exception;
		}
	}

	/**
	 * Prepares an {@link GetFeeCardCurrenciesDetails} based on the test data provided by {@link FeeCalculatorPortTestDataSupplier}
	 * 
	 * @return the ${@link GetFeeCardCurrenciesDetails}
	 */
	private GetFeeCardCurrenciesDetails prepareGetFeeCardCurrenciesDetails() {
		final GetFeeCardCurrenciesDetails getFeeCardCurrenciesDetails = new GetFeeCardCurrenciesDetails();

		getFeeCardCurrenciesDetails.setBusinessOriginID(businessOriginID);

		return getFeeCardCurrenciesDetails;
	}
}
