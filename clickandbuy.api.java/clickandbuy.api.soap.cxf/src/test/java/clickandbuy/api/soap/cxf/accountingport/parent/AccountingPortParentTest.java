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
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class AccountingPortParentTest extends ParentTest {

	/**
	 * class logger.
	 */
	private static final Logger					logger	= Logger.getLogger(AccountingPortParentTest.class);

	/**
	 * accept self signed certificates flag.
	 */
	@Value("${acceptSelfSignedCertificates}")
	protected boolean							acceptSelfSignedCertificates;

	/**
	 * web service accounting port type.
	 */
	@Autowired
	protected AccountingPortType				accountingPortType;

	/**
	 * test data supplier.
	 */
	@Autowired
	protected AccountingPortTestDataSupplier	testData;

	/**
	 * Config utility method for certificates policy.
	 */
	public void configureCertificatesPolicy() {
		if (acceptSelfSignedCertificates) {
			final Client proxy = ClientProxy.getClient(accountingPortType);
			configureCertificatesPolicy(proxy);
		}
	}
}