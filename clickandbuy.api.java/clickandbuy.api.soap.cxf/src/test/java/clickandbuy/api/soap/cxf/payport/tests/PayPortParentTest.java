package clickandbuy.api.soap.cxf.payport.tests;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import clickandbuy.api.soap.cxf.parent.ParentTest;

import com.clickandbuy.api.soap.cxf.PayPortType;

/**
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class PayPortParentTest extends ParentTest {
	public static final Logger	logger	= Logger.getLogger(PayPortParentTest.class);

	@Value("${acceptSelfSignedCertificates}")
	boolean						acceptSelfSignedCertificates;

	@Autowired
	public PayPortType			payPortType;

	/**
	 * 
	 */
	public void configureCertificatesPolicy() {
		if (acceptSelfSignedCertificates) {
			Client proxy = ClientProxy.getClient(payPortType);
			configureCertificatesPolicy(proxy);
		}
	}
}
