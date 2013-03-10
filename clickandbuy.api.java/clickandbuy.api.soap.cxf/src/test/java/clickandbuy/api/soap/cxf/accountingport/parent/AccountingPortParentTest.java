/**
 * 
 */
package clickandbuy.api.soap.cxf.accountingport.parent;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import clickandbuy.api.soap.cxf.accountingport.data.AccountingPortTestDataSupplier;
import clickandbuy.api.soap.cxf.parent.ParentTest;

import com.clickandbuy.api.soap.cxf.AccountingPortType;

/**
 * Parent test for all accounting port operation tests.
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class AccountingPortParentTest extends ParentTest {

	/**
	 * Class logger.
	 */
	private static final Logger					logger	= Logger.getLogger(AccountingPortParentTest.class);

	/**
	 * Flag to accept (bypass) self signed certificates.
	 */
	@Value("${clickandbuy.api.endpoint.accountingport.acceptSelfSignedCertificates}")
	protected boolean							acceptSelfSignedCertificates;

	/**
	 * Web service facade, containing accounting related methods.
	 */
	@Autowired
	protected AccountingPortType				accountingPortType;

	/**
	 * Test data supplier.
	 */
	@Autowired
	protected AccountingPortTestDataSupplier	testData;

	/**
	 * Configuration utility method for certificates policy.
	 */
	protected void configureCertificatesPolicy() {
		if (acceptSelfSignedCertificates) {
			logger.debug("Acceptance of self signed certificates is enabled for Accounting Port.");
			final Client proxy = ClientProxy.getClient(accountingPortType);
			configureCertificatesPolicy(proxy);
		} else {
			logger.debug("Acceptance of self signed certificates is disabled for Accounting Port!");
			logger.debug("If you are on a testing/development environment, you may encounter probles due to self signed certificates being (by default) rejected.");
		}
	}
}