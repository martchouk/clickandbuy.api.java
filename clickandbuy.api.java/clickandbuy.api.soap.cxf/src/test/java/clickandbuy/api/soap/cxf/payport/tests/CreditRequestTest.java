/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.tests;

import static clickandbuy.api.soap.cxf.util.TestUtil.prepareCreditRecipientIdentifier;
import static clickandbuy.api.soap.cxf.util.TestUtil.prepareMoney;
import static clickandbuy.api.soap.cxf.util.TestUtil.prepareOrderDetailItem;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import clickandbuy.api.soap.cxf.payport.parent.PayPortParentTest;

import com.clickandbuy.api.soap.cxf.CreditRequestDetails;
import com.clickandbuy.api.soap.cxf.CreditRequestRequest;
import com.clickandbuy.api.soap.cxf.CreditRequestResponse;
import com.clickandbuy.api.soap.cxf.ErrorDetails_Exception;
import com.clickandbuy.api.soap.cxf.OrderDetailItemList;
import com.clickandbuy.api.soap.cxf.OrderDetailItemType;

/**
 * Tests related to CreditRequest
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CreditRequestTest extends PayPortParentTest {

	/** Test data */
	@Value("${payPort.creditRequest.money.amount}")
	private BigDecimal	moneyAmount;

	@Value("${payPort.creditRequest.money.currency}")
	private String		moneyCurrency;

	@Value("${payPort.creditRequest.consumerLanguage}")
	private String		consumerLanguage;

	@Value("${payPort.creditRequest.externalId}")
	private String		externalId;

	@Value("${payPort.creditRequest.orderDetails.text}")
	private String		text;

	@Value("${payPort.creditRequest.creditRecipientIdentifier.crn}")
	private Long		crn;

	@Value("${payPort.creditRequest.creditRecipientIdentifier.email}")
	private String		email;

	@Value("${payPort.creditRequest.orderDetailItem.description}")
	String				odiDescription;

	@Value("${payPort.creditRequest.orderDetailItem.itemType}")
	OrderDetailItemType	odiItemType;

	@Value("${payPort.creditRequest.orderDetailItem.quantity}")
	Integer				odiQuantity;

	@Value("${payPort.creditRequest.orderDetailItem.unitPrice.money.amount}")
	private BigDecimal	odiMoneyUnitPriceAmount;

	@Value("${payPort.creditRequest.orderDetailItem.unitPrice.money.currency}")
	private String		odiMoneyUnitPriceCurrency;

	@Before
	public void setUp() throws Exception {
		configureCertificatesPolicy();
	}

	/**
	 * Test the CreditRequest
	 */
	@Test
	public void testCreditRequest() {
		CreditRequestResponse creditRequestResponse = null;

		CreditRequestRequest creditRequestRequest = new CreditRequestRequest();
		creditRequestRequest.setAuthentication(prepareAuthenticationBasedOnProjectID());
		creditRequestRequest.setDetails(prepareCreditRequestDetails());

		try {
			creditRequestResponse = payPortType.creditRequest(creditRequestRequest);
			logger.debug("Created transaction with Id: " + creditRequestResponse.getTransaction().getTransactionID());
		} catch (ErrorDetails_Exception errorDetails_Exception) {
			logger.error(errorDetails_Exception.getFaultInfo().getDescription());
		}

		// TODO finish test logic
	}

	/**
	 * @return
	 */
	private CreditRequestDetails prepareCreditRequestDetails() {
		CreditRequestDetails creditRequestDetails = new CreditRequestDetails();

		// TODO fill in necessary test data

		creditRequestDetails.setAmount(prepareMoney(moneyAmount, moneyCurrency));
		// creditRequestDetails.setConsumerLanguage(consumerLanguage);
		creditRequestDetails.setExternalID(externalId);
		// creditRequestDetails.setOrderDetails(prepareOrderDetails());
		creditRequestDetails.setRecipient(prepareCreditRecipientIdentifier(crn, email));

		return creditRequestDetails;
	}

	// private OrderDetails prepareOrderDetails(){
	// OrderDetails orderDetails = new OrderDetails();
	//
	// orderDetails.setItemList(prepareOrderDetailItemList());
	// orderDetails.setText(text);
	//
	// return orderDetails;
	// }

	private OrderDetailItemList aprepareOrderDetailItemList() {
		OrderDetailItemList orderDetailItemList = new OrderDetailItemList();

		orderDetailItemList.getItem().add(prepareOrderDetailItem(odiDescription, odiItemType, odiQuantity, prepareMoney(moneyAmount, moneyCurrency), prepareMoney(odiMoneyUnitPriceAmount, odiMoneyUnitPriceCurrency)));

		return orderDetailItemList;
	}

}
