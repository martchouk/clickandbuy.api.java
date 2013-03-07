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
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class RegistrationPortParentTest extends ParentTest {
	/**
	 * class logger.
	 */
	private static final Logger					logger	= Logger.getLogger(RegistrationPortParentTest.class);

	/**
	 * accept self signed certificates flag. (Specific for test systems).
	 */
	@Value("${acceptSelfSignedCertificates}")
	private boolean								acceptSelfSignedCertificates;

	/**
	 * web service registration port type.
	 */
	@Autowired
	protected RegistrationPortType				registrationPortType;

	/**
	 * test data supplier.
	 */
	@Autowired
	protected RegistrationPortTestDataSupplier	testData;

	/**
	 * Config helper method for certificates policy.
	 */
	public void configureCertificatesPolicy() {
		if (acceptSelfSignedCertificates) {
			final Client proxy = ClientProxy.getClient(registrationPortType);
			configureCertificatesPolicy(proxy);
		}
	}
}
