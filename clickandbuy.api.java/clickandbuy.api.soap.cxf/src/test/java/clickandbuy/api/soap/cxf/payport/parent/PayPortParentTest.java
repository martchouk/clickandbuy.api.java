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

import com.clickandbuy.api.soap.cxf.PayPortType;

/**
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class PayPortParentTest extends ParentTest {

	/**
	 * class logger.
	 */
	private static final Logger	logger	= Logger.getLogger(PayPortParentTest.class);

	/**
	 * flag to bypass self signed certificates.
	 */
	@Value("${acceptSelfSignedCertificates}")
	protected boolean			acceptSelfSignedCertificates;

	/**
	 * web service port (facade).
	 */
	@Autowired
	protected PayPortType		payPortType;

	/**
	 * 
	 */
	public void configureCertificatesPolicy() {
		if (acceptSelfSignedCertificates) {
			final Client proxy = ClientProxy.getClient(payPortType);
			configureCertificatesPolicy(proxy);
		}
	}
}
