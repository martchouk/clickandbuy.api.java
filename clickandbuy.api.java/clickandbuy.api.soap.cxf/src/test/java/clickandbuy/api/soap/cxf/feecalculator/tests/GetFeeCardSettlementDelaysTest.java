package clickandbuy.api.soap.cxf.feecalculator.tests;

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

	/** Test data */
	// TODO inject necessary test data

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

		GetFeeCardSettlementDelaysRequest getFeeCardSettlementDelaysRequest = new GetFeeCardSettlementDelaysRequest();
		getFeeCardSettlementDelaysRequest.setDetails(prepareGetFeeCardSettlementDelaysDetails());

		try {
			getFeeCardSettlementDelaysResponse = feeCalculatorPortType.getFeeCardSettlementDelays(getFeeCardSettlementDelaysRequest);
			logger.debug("Created transaction with Id: " + getFeeCardSettlementDelaysResponse.getSettlementDelayList());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	public GetFeeCardSettlementDelaysDetails prepareGetFeeCardSettlementDelaysDetails() {
		GetFeeCardSettlementDelaysDetails getFeeCardSettlementDelaysDetails = new GetFeeCardSettlementDelaysDetails();

		// TODO fill in necessary test data

		// getFeeCardSettlementDelaysDetails.setBusinessOriginID(value);
		// getFeeCardSettlementDelaysDetails.setCategoryID(value);

		return getFeeCardSettlementDelaysDetails;
	}
}
