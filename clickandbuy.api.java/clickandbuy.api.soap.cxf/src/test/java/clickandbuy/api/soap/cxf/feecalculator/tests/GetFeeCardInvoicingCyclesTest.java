package clickandbuy.api.soap.cxf.feecalculator.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.feecalculator.parent.FeeCalculatorPortParentTest;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.GetFeeCardInvoicingCyclesDetails;
import com.clickandbuy.api.soap.cxf.GetFeeCardInvoicingCyclesRequest;
import com.clickandbuy.api.soap.cxf.GetFeeCardInvoicingCyclesResponse;

/**
 * Tests related to GetFeeCardInvoicingCycles
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetFeeCardInvoicingCyclesTest extends FeeCalculatorPortParentTest {

	/** Test data */
	// TODO inject necessary test data

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the GetFeeCardInvoicingCycles
	 */
	@Test
	public void testGetFeeCardInvoicingCycles() {
		GetFeeCardInvoicingCyclesResponse getFeeCardInvoicingCyclesResponse = null;

		GetFeeCardInvoicingCyclesRequest getFeeCardInvoicingCyclesRequest = new GetFeeCardInvoicingCyclesRequest();
		getFeeCardInvoicingCyclesRequest.setDetails(prepareGetFeeCardInvoicingCyclesDetails());

		try {
			getFeeCardInvoicingCyclesResponse = feeCalculatorPortType.getFeeCardInvoicingCycles(getFeeCardInvoicingCyclesRequest);
			logger.debug("Created transaction with Id: " + getFeeCardInvoicingCyclesResponse.getInvoicingCycleList());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	public GetFeeCardInvoicingCyclesDetails prepareGetFeeCardInvoicingCyclesDetails() {
		GetFeeCardInvoicingCyclesDetails getFeeCardInvoicingCyclesDetails = new GetFeeCardInvoicingCyclesDetails();

		// TODO fill in necessary test data

		// getFeeCardInvoicingCyclesDetails.setBusinessOriginID(value);
		// getFeeCardInvoicingCyclesDetails.setCategoryID(value);

		return getFeeCardInvoicingCyclesDetails;
	}
}
