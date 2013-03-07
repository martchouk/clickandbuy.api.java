package clickandbuy.api.soap.cxf.feecalculator.parent;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import clickandbuy.api.soap.cxf.feecalculator.data.FeeCalculatorPortTestDataSupplier;
import clickandbuy.api.soap.cxf.parent.ParentTest;

import com.clickandbuy.api.soap.cxf.FeeCalculatorPortType;

/**
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class FeeCalculatorPortParentTest extends ParentTest {
	/**
	 * class logger.
	 */
	private static final Logger					logger	= Logger.getLogger(FeeCalculatorPortParentTest.class);

	/**
	 * flag to setup acceptance for self signet certificates (specific for test systems).
	 */
	@Value("${acceptSelfSignedCertificates}")
	private boolean								acceptSelfSignedCertificates;

	/**
	 * web service facade, containing fee related methods.
	 */
	@Autowired
	protected FeeCalculatorPortType				feeCalculatorPortType;

	/**
	 * test data supplier.
	 */
	@Autowired
	protected FeeCalculatorPortTestDataSupplier	testData;

	/**
	 * Config helper method for certificates policy.
	 */
	public void configureCertificatesPolicy() {
		if (acceptSelfSignedCertificates) {
			final Client proxy = ClientProxy.getClient(feeCalculatorPortType);
			configureCertificatesPolicy(proxy);
		}
	}
}
