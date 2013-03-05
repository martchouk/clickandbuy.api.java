package clickandbuy.api.soap.cxf.feecalculator.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.feecalculator.parent.FeeCalculatorPortParentTest;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
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
	 */
	@Test
	public void testGetFeeCardSettlementDelays() {
		GetFeeCardSettlementDelaysResponse getFeeCardSettlementDelaysResponse = null;

		// prepare the request
		final GetFeeCardSettlementDelaysRequest feeCardSettlementDelaysRequest = new GetFeeCardSettlementDelaysRequest();
		feeCardSettlementDelaysRequest.setDetails(prepareGetFeeCardSettlementDelaysDetails());

		// perform the request.
		try {
			getFeeCardSettlementDelaysResponse = feeCalculatorPortType.getFeeCardSettlementDelays(feeCardSettlementDelaysRequest);
			logger.debug("Created transaction with Id: " + getFeeCardSettlementDelaysResponse.getSettlementDelayList());
		} catch (final ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// assert everything ok.
		Assert.assertNotNull(getFeeCardSettlementDelaysResponse);
		Assert.assertNotNull(getFeeCardSettlementDelaysResponse.getSettlementDelayList());
		Assert.assertNotNull(getFeeCardSettlementDelaysResponse.getSettlementDelayList().getSettlementDelay());
		Assert.assertTrue(getFeeCardSettlementDelaysResponse.getSettlementDelayList().getSettlementDelay().size() > 0);
	}

	/**
	 * @return
	 */
	public GetFeeCardSettlementDelaysDetails prepareGetFeeCardSettlementDelaysDetails() {
		final GetFeeCardSettlementDelaysDetails getFeeCardSettlementDelaysDetails = new GetFeeCardSettlementDelaysDetails();

		getFeeCardSettlementDelaysDetails.setBusinessOriginID(businessOriginID);
		// TODO : fix this value.
		// getFeeCardSettlementDelaysDetails.setCategoryID(value);

		return getFeeCardSettlementDelaysDetails;
	}
}
