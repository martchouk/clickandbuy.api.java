package clickandbuy.api.soap.cxf.registrationport.parent;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import clickandbuy.api.soap.cxf.parent.ParentTest;

import com.clickandbuy.api.soap.cxf.RegistrationPortType;

/**
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class RegistrationPortParentTest extends ParentTest {
	public static final Logger	logger	= Logger.getLogger(RegistrationPortParentTest.class);

	@Value("${acceptSelfSignedCertificates}")
	boolean						acceptSelfSignedCertificates;

	@Autowired
	public RegistrationPortType	registrationPortType;

	/**
	 * 
	 */
	public void configureCertificatesPolicy() {
		if (acceptSelfSignedCertificates) {
			Client proxy = ClientProxy.getClient(registrationPortType);
			configureCertificatesPolicy(proxy);
		}
	}
}
