/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.data;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Value;

import com.clickandbuy.api.soap.cxf.CancelMode;
import com.clickandbuy.api.soap.cxf.PayPortType;

/**
 * Holds all necessary test data for {@link PayPortType} related tests.
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class PayPortTestDataSupplier {

	/**
	 * CancelRequest Test data
	 */

	@Value("${payPort.cancelRequest.cancelMode}")
	private CancelMode	cancelRequestCancelMode;

	/**
	 * CreditRequest Test data
	 */

	/** The money amount for the credit request */
	@Value("${payPort.creditRequest.money.amount}")
	private BigDecimal	creditRequestMoneyAmount;

	/** The currency for the credit request */
	@Value("${payPort.creditRequest.money.currency}")
	private String		creditRequestMoneyCurrency;

	/** The email of the credit recipient (the one requesting the credit) */
	@Value("${payPort.creditRequest.creditRecipientIdentifier.email}")
	private String		creditRequestEmail;

	/**
	 * PayRequestRecurring Test data
	 */

	/** The money amount for the recurring payment */
	@Value("${payPort.payRequestRecurring.amount.amount}")
	private BigDecimal	payRequestRecurringAmount;

	/** The currency for the recurring payment */
	@Value("${payPort.payRequestRecurring.amount.currency}")
	private String		payRequestRecurringCurrency;

	/** The ID of the recurring payment authorization */
	@Value("${payPort.payRequestRecurring.paymentAuthorizationID}")
	private Long		payRequestRecurringPaymentAuthorizationID;

	/**
	 * PayRequest Test data
	 */

	/** The amount for the payment request */
	@Value("${payPort.payRequest.amount.amout}")
	private BigDecimal	payRequestAmount;

	/** The currency for the payment request */
	@Value("${payPort.payRequest.amount.currency}")
	private String		payRequestCurrency;

	/** The text assigned to the order details of the payment request */
	@Value("${payPort.payRequest.orderDetails.text}")
	private String		payRequestText;

	/** The basket risk for the payment request */
	@Value("${payPort.payRequest.basketRisk}")
	private int			payRequestBasketRisk;

	/** The client risk for the payment request */
	@Value("${payPort.payRequest.clientRisk}")
	private int			payRequestClientRisk;

	/** The authentication expiration time for the payment request */
	@Value("${payPort.payRequest.authExpiration}")
	private int			payRequestAuthExpiration;

	/** The confirmation expiration time for the payment request */
	@Value("${payPort.payRequest.confirmExpiration}")
	private int			payRequestConfirmExpiration;

	/** The success expiration time for the payment request */
	@Value("${payPort.payRequest.successExpiration}")
	private int			payRequestSuccessExpiration;

	/** The URI where to be redirected when the payment request flow is successful */
	@Value("${payPort.payRequest.successURI}")
	private String		payRequestSuccessURI;

	/** The URI where to be redirected when the payment request flow is not successful */
	@Value("${payPort.payRequest.failureURI}")
	private String		payRequestFailureURI;

	/** The IP address of the consumer involved in the payment request */
	@Value("${payPort.payRequest.consumerIPAddress}")
	private String		payRequestConsumerIPAddress;

	/** The language code of the consumer involved in the payment request */
	@Value("${payPort.payRequest.consumerLanguage}")
	private String		payRequestConsumerLanguage;

	/** The nation code of the consumer involved in the paymenr request */
	@Value("${payPort.payRequest.consumerNation}")
	private String		payRequestConsumerNation;

	/** The description assigned to the recurring payment */
	@Value("${payPort.payRequest.createRecurring.description}")
	private String		payRequestCreateRecurringDescription;

	/** The expiration date of the recurring payment */
	@Value("${payPort.payRequest.createRecurring.expireDate}")
	private String		payRequestCreateRecurringExpireDate;

	/**
	 * RefundRequest Test data
	 */

	@Value("${payPort.refundRequest.transactionID}")
	private Long		refundRequestTransactionID;

	/**
	 * @return the cancelRequestCancelMode
	 */
	public CancelMode getCancelRequestCancelMode() {
		return cancelRequestCancelMode;
	}

	/**
	 * @return the creditRequestMoneyAmount
	 */
	public BigDecimal getCreditRequestMoneyAmount() {
		return creditRequestMoneyAmount;
	}

	/**
	 * @return the creditRequestMoneyCurrency
	 */
	public String getCreditRequestMoneyCurrency() {
		return creditRequestMoneyCurrency;
	}

	/**
	 * @return the creditRequestEmail
	 */
	public String getCreditRequestEmail() {
		return creditRequestEmail;
	}

	/**
	 * @return the payRequestRecurringAmount
	 */
	public BigDecimal getPayRequestRecurringAmount() {
		return payRequestRecurringAmount;
	}

	/**
	 * @return the payRequestRecurringCurrency
	 */
	public String getPayRequestRecurringCurrency() {
		return payRequestRecurringCurrency;
	}

	/**
	 * @return the payRequestRecurringPaymentAuthorizationID
	 */
	public Long getPayRequestRecurringPaymentAuthorizationID() {
		return payRequestRecurringPaymentAuthorizationID;
	}

	/**
	 * @return the payRequestAmount
	 */
	public BigDecimal getPayRequestAmount() {
		return payRequestAmount;
	}

	/**
	 * @return the payRequestCurrency
	 */
	public String getPayRequestCurrency() {
		return payRequestCurrency;
	}

	/**
	 * @return the payRequestText
	 */
	public String getPayRequestText() {
		return payRequestText;
	}

	/**
	 * @return the payRequestBasketRisk
	 */
	public int getPayRequestBasketRisk() {
		return payRequestBasketRisk;
	}

	/**
	 * @return the payRequestClientRisk
	 */
	public int getPayRequestClientRisk() {
		return payRequestClientRisk;
	}

	/**
	 * @return the payRequestAuthExpiration
	 */
	public int getPayRequestAuthExpiration() {
		return payRequestAuthExpiration;
	}

	/**
	 * @return the payRequestConfirmExpiration
	 */
	public int getPayRequestConfirmExpiration() {
		return payRequestConfirmExpiration;
	}

	/**
	 * @return the payRequestSuccessExpiration
	 */
	public int getPayRequestSuccessExpiration() {
		return payRequestSuccessExpiration;
	}

	/**
	 * @return the payRequestSuccessURI
	 */
	public String getPayRequestSuccessURI() {
		return payRequestSuccessURI;
	}

	/**
	 * @return the payRequestFailureURI
	 */
	public String getPayRequestFailureURI() {
		return payRequestFailureURI;
	}

	/**
	 * @return the payRequestConsumerIPAddress
	 */
	public String getPayRequestConsumerIPAddress() {
		return payRequestConsumerIPAddress;
	}

	/**
	 * @return the payRequestConsumerLanguage
	 */
	public String getPayRequestConsumerLanguage() {
		return payRequestConsumerLanguage;
	}

	/**
	 * @return the payRequestConsumerNation
	 */
	public String getPayRequestConsumerNation() {
		return payRequestConsumerNation;
	}

	/**
	 * @return the payRequestCreateRecurringDescription
	 */
	public String getPayRequestCreateRecurringDescription() {
		return payRequestCreateRecurringDescription;
	}

	/**
	 * @return the payRequestCreateRecurringExpireDate
	 */
	public String getPayRequestCreateRecurringExpireDate() {
		return payRequestCreateRecurringExpireDate;
	}

	/**
	 * @return the refundRequestTransactionID
	 */
	public Long getRefundRequestTransactionID() {
		return refundRequestTransactionID;
	}

}
