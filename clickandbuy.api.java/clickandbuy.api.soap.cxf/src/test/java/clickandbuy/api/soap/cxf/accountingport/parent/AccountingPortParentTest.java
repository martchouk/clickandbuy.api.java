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
	public static final Logger logger = Logger
			.getLogger(AccountingPortParentTest.class);

	@Value("${acceptSelfSignedCertificates}")
	protected boolean acceptSelfSignedCertificates;

	@Autowired
	protected AccountingPortType accountingPortType;

	@Autowired
	protected AccountingPortTestDataSupplier testData;

	/**
	 * 
	 */
	public void configureCertificatesPolicy() {
		if (acceptSelfSignedCertificates) {
			Client proxy = ClientProxy.getClient(accountingPortType);
			configureCertificatesPolicy(proxy);
		}
	}
}