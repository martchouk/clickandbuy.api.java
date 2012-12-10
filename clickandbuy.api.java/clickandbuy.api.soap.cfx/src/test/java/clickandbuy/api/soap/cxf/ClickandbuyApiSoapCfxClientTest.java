package clickandbuy.api.soap.cxf;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;  
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clickandbuy.api.util.auth.SignatureHandler;

import clickandbuy.api.soap.cfx.AccountingPortType;
import clickandbuy.api.soap.cfx.Authentication;
import clickandbuy.api.soap.cfx.ErrorDetails_Exception;
import clickandbuy.api.soap.cfx.Money;
import clickandbuy.api.soap.cfx.OrderDetailItemList;
import clickandbuy.api.soap.cfx.OrderDetails;
import clickandbuy.api.soap.cfx.PayPortType;
import clickandbuy.api.soap.cfx.PayRequestDetails;
import clickandbuy.api.soap.cfx.PayRequestRequest;
import clickandbuy.api.soap.cfx.PayRequestResponse;
import clickandbuy.api.soap.cfx.RegistrationPortType;

@Configuration
@ActiveProfiles("SANDBOX") 
@ContextConfiguration(locations={"classpath:/META-INF/spring/itest/clickandbuy.api.soap.cfx.spring.xml"})  
@RunWith(SpringJUnit4ClassRunner.class) 
public class ClickandbuyApiSoapCfxClientTest {
	private static final Logger logger = Logger.getLogger(ClickandbuyApiSoapCfxClientTest.class);
	@Autowired private SignatureHandler signatureHandler;
	
	@Autowired private PayPortType clickandbuyApiClientPay;
	@Autowired private RegistrationPortType clickandbuyApiClientReg;
	@Autowired private AccountingPortType clickandbuyApiClientAccounting; 
	
	/** Test data */
	@Value("${externalId}")	private String externalId;
	@Value("${merchantId}") private long merchantId;
	@Value("${projectId}") private long projectId;
	@Value("${secretKey}") private String secretKey;
	@Value("${basketRisk}") private int basketRisk;
	@Value("${clientRisk}") private int clientRisk;
	@Value("${authExpiration}") private int authExpiration;
	@Value("${confirmExpiration}") private int confirmExpiration;
	@Value("${successExpiration}") private int successExpiration;
	@Value("${successURI}") private String successURI;
	@Value("${failureURI}") private String failureURI;
	@Value("${consumerIPAddress}") private String consumerIPAddress;
	@Value("${consumerLanguage}") private String consumerLanguage;
	@Value("${consumerNation}") private String consumerNation;
	
	@Before
    public void setUp() throws Exception {
		externalId = externalId + System.nanoTime() + "_";
		logger.debug("***externalId:" + externalId);
    }
	
	/**
	 * Test the PayRequest
	 */
	@Test
	public void testPayRequest(){
		PayRequestResponse tx = null;
		PayRequestRequest req = new PayRequestRequest();
		req.setAuthentication(prepareAuthentication(merchantId, projectId, secretKey));
		req.setDetails(preparePayRequestDetails());
		try{
			
			tx = clickandbuyApiClientPay.payRequest(req);
			logger.debug("Created transaction with Id: " + tx.getTransaction().getTransactionID());
		} catch (ErrorDetails_Exception e){
			logger.error(e.getFaultInfo().getDescription());
		}
	}	
	
	/**
     * Prepares the soap {@link PayRequest_Request} object from given parameters
     * 
     * @param payRequestFormBean
     * @return T_PayRequest_Details
     * @throws PayServiceException
     */
    private PayRequestDetails preparePayRequestDetails(){
        PayRequestDetails payRequestDetails = new PayRequestDetails();
        payRequestDetails.setBasketRisk(basketRisk);
        payRequestDetails.setClientRisk(clientRisk);
        payRequestDetails.setAuthExpiration(authExpiration);
        payRequestDetails.setConfirmExpiration(confirmExpiration);
        payRequestDetails.setSuccessExpiration(successExpiration);
        payRequestDetails.setSuccessURL(successURI);
        payRequestDetails.setFailureURL(failureURI);
        payRequestDetails.setConsumerIPAddress(consumerIPAddress);
        payRequestDetails.setExternalID(externalId);
        payRequestDetails.setConsumerLanguage(consumerLanguage);
        payRequestDetails.setConsumerCountry(consumerNation);
        // Order Details
        OrderDetails order = new OrderDetails();
        order.setItemList(new OrderDetailItemList());
        order.setText("testPurchase");
        payRequestDetails.setOrderDetails(order);
        
        // Amount
        clickandbuy.api.soap.cfx.Money amount = new Money();
        amount.setAmount(new BigDecimal("1.50"));
        amount.setCurrency("USD");
        payRequestDetails.setAmount(amount);
        // RecurringAuthorization
       // clickandbuy.api.soap.cfx.RecurringPaymentAuthorization createRecurring = prepareRecurringAuthorization(payRequestFormBean.getCreateRecurring(), payRequestFormBean.isUseRecurringAuthorization());
        //payRequestDetails.setCreateRecurring(createRecurring);
        // Billing Address
       // clickandbuy.api.soap.cfx.LegalEntity billing = prepareLegalEntity(payRequestFormBean.getBillingAddress(), payRequestFormBean.isUseBillingAddress());
       // payRequestDetails.setBilling(billing);
        // Shipping Address
        //clickandbuy.api.soap.cfx.LegalEntity shipping = prepareLegalEntity(payRequestFormBean.getShippingAddress(), payRequestFormBean.isUseShippingAddress());
       // payRequestDetails.setShipping(shipping);
        return payRequestDetails;
    }
    
    
	
	/**
     * Prepares the soap {@link Authentication} object from given parameters
     * 
     * @param authenticationBean
     * @return Authentication
     */
    private Authentication prepareAuthentication(final long merchantId, final long projectId, final String secretKey){
        Authentication merchantAuth = new Authentication();
        merchantAuth.setProjectID(nullToZero(projectId));
        merchantAuth.setMerchantID(nullToZero(merchantId));
        merchantAuth.setToken(signatureHandler.createToken(projectId, secretKey));
        return merchantAuth;
    }
	
    
    /**
     * @param num
     * @return
     */
    private long nullToZero(Long num) {
        return num == null ? 0 : num.longValue();
    }
}
