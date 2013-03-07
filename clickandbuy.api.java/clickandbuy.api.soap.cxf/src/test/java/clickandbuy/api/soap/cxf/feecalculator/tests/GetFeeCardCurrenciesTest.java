package clickandbuy.api.soap.cxf.feecalculator.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
	 * test setup.
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the GetFeeCardCurrencies
	 * 
	 * @throws ErrorDetails_Exception
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
	 * Builder method for retrieving card currencies.
	 * 
	 * @return
	 */
	private GetFeeCardCurrenciesDetails prepareGetFeeCardCurrenciesDetails() {
		final GetFeeCardCurrenciesDetails getFeeCardCurrenciesDetails = new GetFeeCardCurrenciesDetails();
		getFeeCardCurrenciesDetails.setBusinessOriginID(businessOriginID);
		return getFeeCardCurrenciesDetails;
	}
}
