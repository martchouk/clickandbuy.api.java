package clickandbuy.api.soap.cxf.feecalculator.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.feecalculator.parent.FeeCalculatorPortParentTest;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.GetFeeCardAverageTicketSizesDetails;
import com.clickandbuy.api.soap.cxf.GetFeeCardAverageTicketSizesRequest;
import com.clickandbuy.api.soap.cxf.GetFeeCardAverageTicketSizesResponse;

/**
 * Tests related to GetFeeCardAverageTicketSizes
 * 
 * @author Ciprian.Ileana
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetFeeCardAverageTicketSizesTest extends FeeCalculatorPortParentTest {

	/** Test data */
	// TODO inject necessary test data

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the GetFeeCardAverageTicketSizes
	 */
	@Test
	public void testGetFeeCardAverageTicketSizes() {
		GetFeeCardAverageTicketSizesResponse getFeeCardAverageTicketSizesResponse = null;

		GetFeeCardAverageTicketSizesRequest getFeeCardAverageTicketSizesRequest = new GetFeeCardAverageTicketSizesRequest();
		getFeeCardAverageTicketSizesRequest.setDetails(prepareAddBatchItemDetails());

		try {
			getFeeCardAverageTicketSizesResponse = feeCalculatorPortType.getFeeCardAverageTicketSizes(getFeeCardAverageTicketSizesRequest);
			logger.debug("Created transaction with Id: " + getFeeCardAverageTicketSizesResponse.getAverageTicketSizeList());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	public GetFeeCardAverageTicketSizesDetails prepareAddBatchItemDetails() {
		GetFeeCardAverageTicketSizesDetails getFeeCardAverageTicketSizesDetails = new GetFeeCardAverageTicketSizesDetails();

		// TODO fill in necessary test data

		// getFeeCardAverageTicketSizesDetails.setBusinessOriginID(value);
		// getFeeCardAverageTicketSizesDetails.setCategoryID(value);
		// getFeeCardAverageTicketSizesDetails.setCurrency(value);

		return getFeeCardAverageTicketSizesDetails;
	}
}
