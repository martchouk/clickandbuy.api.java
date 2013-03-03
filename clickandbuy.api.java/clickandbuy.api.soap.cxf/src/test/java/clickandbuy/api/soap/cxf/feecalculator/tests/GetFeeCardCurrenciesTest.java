package clickandbuy.api.soap.cxf.feecalculator.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.GetFeeCardCurrenciesDetails;
import com.clickandbuy.api.soap.cxf.GetFeeCardCurrenciesRequest;
import com.clickandbuy.api.soap.cxf.GetFeeCardCurrenciesResponse;

/**
 * Tests related to GetFeeCardCurrenciesTest
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetFeeCardCurrenciesTest extends FeeCalculatorPortParentTest {

	/** Test data */
	// TODO inject necessary test data

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the GetFeeCardCurrencies
	 */
	@Test
	public void testGetFeeCardCurrencies() {
		GetFeeCardCurrenciesResponse getFeeCardCurrenciesResponse = null;

		GetFeeCardCurrenciesRequest getFeeCardCurrenciesRequest = new GetFeeCardCurrenciesRequest();
		getFeeCardCurrenciesRequest.setDetails(prepareGetFeeCardCurrenciesDetails());

		try {
			getFeeCardCurrenciesResponse = feeCalculatorPortType.getFeeCardCurrencies(getFeeCardCurrenciesRequest);
			logger.debug("Created transaction with Id: " + getFeeCardCurrenciesResponse.getCurrencyList());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	public GetFeeCardCurrenciesDetails prepareGetFeeCardCurrenciesDetails() {
		GetFeeCardCurrenciesDetails getFeeCardCurrenciesDetails = new GetFeeCardCurrenciesDetails();

		// TODO fill in necessary test data

		// getFeeCardCurrenciesDetails.setBusinessOriginID(value);

		return getFeeCardCurrenciesDetails;
	}
}
