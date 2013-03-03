package clickandbuy.api.soap.cxf.feecalculator.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.GetFeeCardDetails;
import com.clickandbuy.api.soap.cxf.GetFeeCardRequest;
import com.clickandbuy.api.soap.cxf.GetFeeCardResponse;

/**
 * Tests related to GetFeeCard
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetFeeCardTest extends FeeCalculatorPortParentTest {

	/** Test data */
	// TODO inject necessary test data

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the GetFeeCard
	 */
	@Test
	public void testGetFeeCard() {
		GetFeeCardResponse getFeeCardResponse = null;

		GetFeeCardRequest getFeeCardRequest = new GetFeeCardRequest();
		getFeeCardRequest.setDetails(prepareGetFeeCardDetails());

		try {
			getFeeCardResponse = feeCalculatorPortType.getFeeCard(getFeeCardRequest);
			logger.debug("Created transaction with Id: " + getFeeCardResponse.getCommissionList());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}
		
		//TODO finish test logic
	}

	/**
	 * @return
	 */
	public GetFeeCardDetails prepareGetFeeCardDetails() {
		GetFeeCardDetails getFeeCardDetails = new GetFeeCardDetails();

		//TODO fill in necessary test data
		
		// getFeeCardDetails.setAverageTicketSize(value);
		// getFeeCardDetails.setBusinessOriginID(value);
		// getFeeCardDetails.setCategoryID(value);
		// getFeeCardDetails.setInvoicingCycle(value);
		// getFeeCardDetails.setSettlementDelay(value);

		return getFeeCardDetails;
	}
}
