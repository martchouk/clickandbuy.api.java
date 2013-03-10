/**
 * 
 */
package clickandbuy.api.soap.cxf.registrationport.parent;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import clickandbuy.api.soap.cxf.parent.ParentTest;
import clickandbuy.api.soap.cxf.registrationport.data.RegistrationPortTestDataSupplier;

import com.clickandbuy.api.soap.cxf.RegistrationPortType;

/**
 * Parent test for all registration port operation tests.
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class RegistrationPortParentTest extends ParentTest {

	/**
	 * Class logger.
	 */
	private static final Logger					logger	= Logger.getLogger(RegistrationPortParentTest.class);

	/**
	 * Flag to accept (bypass) self signed certificates.
	 */
	@Value("${clickandbuy.api.endpoint.registrationport.acceptSelfSignedCertificates}")
	private boolean								acceptSelfSignedCertificates;

	/**
	 * Web service facade, containing registration related methods.
	 */
	@Autowired
	protected RegistrationPortType				registrationPortType;

	/**
	 * Test data supplier.
	 */
	@Autowired
	protected RegistrationPortTestDataSupplier	testData;

	/**
	 * Configuration utility method for certificates policy.
	 */
	protected void configureCertificatesPolicy() {
		if (acceptSelfSignedCertificates) {
			logger.debug("Acceptance of self signed certificates is enabled for Registration Port.");
			final Client proxy = ClientProxy.getClient(registrationPortType);
			configureCertificatesPolicy(proxy);
		} else {
			logger.debug("Acceptance of self signed certificates is disabled for Registration Port!");
			logger.debug("If you are on a testing/development environment, you may encounter probles due to self signed certificates being (by default) rejected.");
		}
	}
}
