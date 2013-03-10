/**
 * 
 */
package clickandbuy.api.soap.cxf.feecalculator.parent;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import clickandbuy.api.soap.cxf.feecalculator.data.FeeCalculatorPortTestDataSupplier;
import clickandbuy.api.soap.cxf.parent.ParentTest;

import com.clickandbuy.api.soap.cxf.FeeCalculatorPortType;

/**
 * Parent test for all fee port operation tests.
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class FeeCalculatorPortParentTest extends ParentTest {

	/**
	 * Class logger.
	 */
	private static final Logger					logger	= Logger.getLogger(FeeCalculatorPortParentTest.class);

	/**
	 * Flag to accept (bypass) self signed certificates.
	 */
	@Value("${clickandbuy.api.endpoint.feecalculatorport.acceptSelfSignedCertificates}")
	private boolean								acceptSelfSignedCertificates;

	/**
	 * Web service facade, containing fee related methods.
	 */
	@Autowired
	protected FeeCalculatorPortType				feeCalculatorPortType;

	/**
	 * Test data supplier.
	 */
	@Autowired
	protected FeeCalculatorPortTestDataSupplier	testData;

	/**
	 * Configuration utility method for certificates policy.
	 */
	@Override
	protected void configureCertificatesPolicy() {
		if (acceptSelfSignedCertificates) {
			logger.debug("Acceptance of self signed certificates is enabled for Fee Calculator Port.");
			final Client proxy = ClientProxy.getClient(feeCalculatorPortType);
			configureCertificatesPolicy(proxy);
		} else {
			logger.debug("Acceptance of self signed certificates is disabled for Fee Calculator Port!");
			logger.debug("If you are on a testing/development environment, you may encounter probles due to self signed certificates being (by default) rejected.");
		}
	}
}
