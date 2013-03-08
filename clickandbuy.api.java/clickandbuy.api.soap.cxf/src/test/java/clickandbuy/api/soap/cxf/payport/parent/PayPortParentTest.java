/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.parent;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import clickandbuy.api.soap.cxf.parent.ParentTest;
import clickandbuy.api.soap.cxf.payport.data.PayPortTestDataSupplier;

import com.clickandbuy.api.soap.cxf.PayPortType;

/**
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class PayPortParentTest extends ParentTest {

	/**
	 * Class logger.
	 */
	private static final Logger			logger	= Logger.getLogger(PayPortParentTest.class);

	/**
	 * Flag to accept (bypass) self signed certificates.
	 */
	@Value("${clickandbuy.api.endpoint.payport.acceptSelfSignedCertificates}")
	protected boolean					acceptSelfSignedCertificates;

	/**
	 * Web service facade, containing pay related methods.
	 */
	@Autowired
	protected PayPortType				payPortType;

	/**
	 * Test data supplier.
	 */
	@Autowired
	protected PayPortTestDataSupplier	testData;
	
	/**
	 * Configuration utility method for certificates policy.
	 */
	protected void configureCertificatesPolicy() {
		if (acceptSelfSignedCertificates) {
			logger.debug("Acceptance of self signed certificates is enabled for Pay Port.");
			final Client proxy = ClientProxy.getClient(payPortType);
			configureCertificatesPolicy(proxy);
		} else {
			logger.debug("Acceptance of self signed certificates is disabled for Pay Port!");
			logger.debug("If you are on a testing/development environment, you may encounter probles due to self signed certificates being (by default) rejected.");
		}
	}
}
