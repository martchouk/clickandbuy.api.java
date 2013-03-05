package clickandbuy.api.soap.cxf.feecalculator.parent;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import clickandbuy.api.soap.cxf.parent.ParentTest;

import com.clickandbuy.api.soap.cxf.FeeCalculatorPortType;

/**
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class FeeCalculatorPortParentTest extends ParentTest {
	public static final Logger		logger	= Logger.getLogger(FeeCalculatorPortParentTest.class);

	@Value("${acceptSelfSignedCertificates}")
	boolean							acceptSelfSignedCertificates;

	@Autowired
	public FeeCalculatorPortType	feeCalculatorPortType;

	/**
	 * 
	 */
	public void configureCertificatesPolicy() {
		if (acceptSelfSignedCertificates) {
			Client proxy = ClientProxy.getClient(feeCalculatorPortType);
			configureCertificatesPolicy(proxy);
		}
	}
}
