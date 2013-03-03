package clickandbuy.api.soap.cxf.feecalculator.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.GetFeeCardCategoriesDetails;
import com.clickandbuy.api.soap.cxf.GetFeeCardCategoriesRequest;
import com.clickandbuy.api.soap.cxf.GetFeeCardCategoriesResponse;

/**
 * Tests related to GetFeeCardCategpories
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GetFeeCardCategoriesTest extends FeeCalculatorPortParentTest {

	/** Test data */
	// TODO inject necessary test data

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the GetFeeCardCategories
	 */
	@Test
	public void testGetFeeCardCategories() {
		GetFeeCardCategoriesResponse getFeeCardCategoriesResponse = null;

		GetFeeCardCategoriesRequest addBatchItemRequest = new GetFeeCardCategoriesRequest();
		addBatchItemRequest.setDetails(prepareGetFeeCardCategoriesDetails());

		try {
			getFeeCardCategoriesResponse = feeCalculatorPortType.getFeeCardCategories(addBatchItemRequest);
			logger.debug("Created transaction with Id: " + getFeeCardCategoriesResponse.getCategoryList());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	public GetFeeCardCategoriesDetails prepareGetFeeCardCategoriesDetails() {
		GetFeeCardCategoriesDetails getFeeCardCategoriesDetails = new GetFeeCardCategoriesDetails();

		// TODO fill in necessary test data

		// getFeeCardCategoriesDetails.setBusinessOriginID(value);

		return getFeeCardCategoriesDetails;
	}
}
