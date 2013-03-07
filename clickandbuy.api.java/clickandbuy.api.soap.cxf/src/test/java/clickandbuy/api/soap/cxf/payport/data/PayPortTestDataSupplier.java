/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.data;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Value;

import com.clickandbuy.api.soap.cxf.CancelMode;

/**
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
public class PayPortTestDataSupplier {

	/** AddBatchItem Test data */

	/** CancelBatch Test data */

	/** CancelRequest Test data */

	@Value("${payPort.cancelRequest.cancelMode}")
	private CancelMode	cancelRequestCancelMode;

	/** CreditRequest Test data */

	@Value("${payPort.creditRequest.money.amount}")
	private BigDecimal	creditRequestMoneyAmount;

	@Value("${payPort.creditRequest.money.currency}")
	private String		creditRequestMoneyCurrency;

	@Value("${payPort.creditRequest.creditRecipientIdentifier.crn}")
	private Long		creditRequestCrn;

	@Value("${payPort.creditRequest.creditRecipientIdentifier.email}")
	private String		creditRequestEmail;

	/** ExecuteBatch Test data */

	/** GetBatchStatus Test data */

	/** PayRequestRecurring Test data */

	@Value("${payPort.payRequestRecurring.amount.amount}")
	private BigDecimal	payRequestRecurringAmount;

	@Value("${payPort.payRequestRecurring.amount.currency}")
	private String		payRequestRecurringCurrency;

	@Value("${payPort.payRequestRecurring.paymentAuthorizationID}")
	private Long		payRequestRecurringPaymentAuthorizationID;

	/** PayRequest Test data */

	@Value("${payPort.payRequest.amount.amout}")
	private BigDecimal	payRequestAmount;

	@Value("${payPort.payRequest.amount.currency}")
	private String		payRequestCurrency;

	@Value("${payPort.payRequest.orderDetails.text}")
	private String		payRequestText;

	@Value("${payPort.payRequest.basketRisk}")
	private int			payRequestBasketRisk;

	@Value("${payPort.payRequest.clientRisk}")
	private int			payRequestClientRisk;

	@Value("${payPort.payRequest.authExpiration}")
	private int			payRequestAuthExpiration;

	@Value("${payPort.payRequest.confirmExpiration}")
	private int			payRequestConfirmExpiration;

	@Value("${payPort.payRequest.successExpiration}")
	private int			payRequestSuccessExpiration;

	@Value("${payPort.payRequest.successURI}")
	private String		payRequestSuccessURI;

	@Value("${payPort.payRequest.failureURI}")
	private String		payRequestFailureURI;

	@Value("${payPort.payRequest.consumerIPAddress}")
	private String		payRequestConsumerIPAddress;

	@Value("${payPort.payRequest.consumerLanguage}")
	private String		payRequestConsumerLanguage;

	@Value("${payPort.payRequest.consumerNation}")
	private String		payRequestConsumerNation;

	@Value("${payPort.payRequest.createRecurring.description}")
	private String		payRequestCreateRecurringDescription;

	@Value("${payPort.payRequest.createRecurring.expireDate}")
	private String		payRequestCreateRecurringExpireDate;

	/** RefundRequest Test data */
	@Value("${payPort.refundRequest.transactionID}")
	private Long		refundRequestTransactionID;

	/** Status Request Test data */

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
	 * @return the cancelRequestCancelMode
	 */
	public CancelMode getCancelRequestCancelMode() {
		return cancelRequestCancelMode;
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
	 * @return the creditRequestCrn
	 */
	public Long getCreditRequestCrn() {
		return creditRequestCrn;
	}

	/**
	 * @return the creditRequestEmail
	 */
	public String getCreditRequestEmail() {
		return creditRequestEmail;
	}

	/**
	 * @return the refundRequestTransactionID
	 */
	public Long getRefundRequestTransactionID() {
		return refundRequestTransactionID;
	}

	/**
	 * @return the payRequestRecurringPaymentAuthorizationID
	 */
	public Long getPayRequestRecurringPaymentAuthorizationID() {
		return payRequestRecurringPaymentAuthorizationID;
	}

}
