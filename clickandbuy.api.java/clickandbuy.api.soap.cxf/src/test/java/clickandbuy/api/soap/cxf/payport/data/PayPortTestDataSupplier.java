/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.data;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Value;

import com.clickandbuy.api.soap.cxf.CancelMode;

/**
 * Holds all necessary test data for PayPort related tests.
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class PayPortTestDataSupplier {

	/** CancelRequest Test data */

	@Value("${payPort.cancelRequest.cancelMode}")
	private CancelMode	cancelRequestCancelMode;

	/** CreditRequest Test data */

	@Value("${payPort.creditRequest.money.amount}")
	private BigDecimal	creditRequestMoneyAmount;

	@Value("${payPort.creditRequest.money.currency}")
	private String		creditRequestMoneyCurrency;

	@Value("${payPort.creditRequest.creditRecipientIdentifier.email}")
	private String		creditRequestEmail;

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

	/**
	 * @return the cancelRequestCancelMode
	 */
	public CancelMode getCancelRequestCancelMode() {
		return cancelRequestCancelMode;
	}

	/**
	 * @param cancelRequestCancelMode
	 *            the cancelRequestCancelMode to set
	 */
	public void setCancelRequestCancelMode(CancelMode cancelRequestCancelMode) {
		this.cancelRequestCancelMode = cancelRequestCancelMode;
	}

	/**
	 * @return the creditRequestMoneyAmount
	 */
	public BigDecimal getCreditRequestMoneyAmount() {
		return creditRequestMoneyAmount;
	}

	/**
	 * @param creditRequestMoneyAmount
	 *            the creditRequestMoneyAmount to set
	 */
	public void setCreditRequestMoneyAmount(BigDecimal creditRequestMoneyAmount) {
		this.creditRequestMoneyAmount = creditRequestMoneyAmount;
	}

	/**
	 * @return the creditRequestMoneyCurrency
	 */
	public String getCreditRequestMoneyCurrency() {
		return creditRequestMoneyCurrency;
	}

	/**
	 * @param creditRequestMoneyCurrency
	 *            the creditRequestMoneyCurrency to set
	 */
	public void setCreditRequestMoneyCurrency(String creditRequestMoneyCurrency) {
		this.creditRequestMoneyCurrency = creditRequestMoneyCurrency;
	}

	/**
	 * @return the creditRequestEmail
	 */
	public String getCreditRequestEmail() {
		return creditRequestEmail;
	}

	/**
	 * @param creditRequestEmail
	 *            the creditRequestEmail to set
	 */
	public void setCreditRequestEmail(String creditRequestEmail) {
		this.creditRequestEmail = creditRequestEmail;
	}

	/**
	 * @return the payRequestRecurringAmount
	 */
	public BigDecimal getPayRequestRecurringAmount() {
		return payRequestRecurringAmount;
	}

	/**
	 * @param payRequestRecurringAmount
	 *            the payRequestRecurringAmount to set
	 */
	public void setPayRequestRecurringAmount(BigDecimal payRequestRecurringAmount) {
		this.payRequestRecurringAmount = payRequestRecurringAmount;
	}

	/**
	 * @return the payRequestRecurringCurrency
	 */
	public String getPayRequestRecurringCurrency() {
		return payRequestRecurringCurrency;
	}

	/**
	 * @param payRequestRecurringCurrency
	 *            the payRequestRecurringCurrency to set
	 */
	public void setPayRequestRecurringCurrency(String payRequestRecurringCurrency) {
		this.payRequestRecurringCurrency = payRequestRecurringCurrency;
	}

	/**
	 * @return the payRequestRecurringPaymentAuthorizationID
	 */
	public Long getPayRequestRecurringPaymentAuthorizationID() {
		return payRequestRecurringPaymentAuthorizationID;
	}

	/**
	 * @param payRequestRecurringPaymentAuthorizationID
	 *            the payRequestRecurringPaymentAuthorizationID to set
	 */
	public void setPayRequestRecurringPaymentAuthorizationID(Long payRequestRecurringPaymentAuthorizationID) {
		this.payRequestRecurringPaymentAuthorizationID = payRequestRecurringPaymentAuthorizationID;
	}

	/**
	 * @return the payRequestAmount
	 */
	public BigDecimal getPayRequestAmount() {
		return payRequestAmount;
	}

	/**
	 * @param payRequestAmount
	 *            the payRequestAmount to set
	 */
	public void setPayRequestAmount(BigDecimal payRequestAmount) {
		this.payRequestAmount = payRequestAmount;
	}

	/**
	 * @return the payRequestCurrency
	 */
	public String getPayRequestCurrency() {
		return payRequestCurrency;
	}

	/**
	 * @param payRequestCurrency
	 *            the payRequestCurrency to set
	 */
	public void setPayRequestCurrency(String payRequestCurrency) {
		this.payRequestCurrency = payRequestCurrency;
	}

	/**
	 * @return the payRequestText
	 */
	public String getPayRequestText() {
		return payRequestText;
	}

	/**
	 * @param payRequestText
	 *            the payRequestText to set
	 */
	public void setPayRequestText(String payRequestText) {
		this.payRequestText = payRequestText;
	}

	/**
	 * @return the payRequestBasketRisk
	 */
	public int getPayRequestBasketRisk() {
		return payRequestBasketRisk;
	}

	/**
	 * @param payRequestBasketRisk
	 *            the payRequestBasketRisk to set
	 */
	public void setPayRequestBasketRisk(int payRequestBasketRisk) {
		this.payRequestBasketRisk = payRequestBasketRisk;
	}

	/**
	 * @return the payRequestClientRisk
	 */
	public int getPayRequestClientRisk() {
		return payRequestClientRisk;
	}

	/**
	 * @param payRequestClientRisk
	 *            the payRequestClientRisk to set
	 */
	public void setPayRequestClientRisk(int payRequestClientRisk) {
		this.payRequestClientRisk = payRequestClientRisk;
	}

	/**
	 * @return the payRequestAuthExpiration
	 */
	public int getPayRequestAuthExpiration() {
		return payRequestAuthExpiration;
	}

	/**
	 * @param payRequestAuthExpiration
	 *            the payRequestAuthExpiration to set
	 */
	public void setPayRequestAuthExpiration(int payRequestAuthExpiration) {
		this.payRequestAuthExpiration = payRequestAuthExpiration;
	}

	/**
	 * @return the payRequestConfirmExpiration
	 */
	public int getPayRequestConfirmExpiration() {
		return payRequestConfirmExpiration;
	}

	/**
	 * @param payRequestConfirmExpiration
	 *            the payRequestConfirmExpiration to set
	 */
	public void setPayRequestConfirmExpiration(int payRequestConfirmExpiration) {
		this.payRequestConfirmExpiration = payRequestConfirmExpiration;
	}

	/**
	 * @return the payRequestSuccessExpiration
	 */
	public int getPayRequestSuccessExpiration() {
		return payRequestSuccessExpiration;
	}

	/**
	 * @param payRequestSuccessExpiration
	 *            the payRequestSuccessExpiration to set
	 */
	public void setPayRequestSuccessExpiration(int payRequestSuccessExpiration) {
		this.payRequestSuccessExpiration = payRequestSuccessExpiration;
	}

	/**
	 * @return the payRequestSuccessURI
	 */
	public String getPayRequestSuccessURI() {
		return payRequestSuccessURI;
	}

	/**
	 * @param payRequestSuccessURI
	 *            the payRequestSuccessURI to set
	 */
	public void setPayRequestSuccessURI(String payRequestSuccessURI) {
		this.payRequestSuccessURI = payRequestSuccessURI;
	}

	/**
	 * @return the payRequestFailureURI
	 */
	public String getPayRequestFailureURI() {
		return payRequestFailureURI;
	}

	/**
	 * @param payRequestFailureURI
	 *            the payRequestFailureURI to set
	 */
	public void setPayRequestFailureURI(String payRequestFailureURI) {
		this.payRequestFailureURI = payRequestFailureURI;
	}

	/**
	 * @return the payRequestConsumerIPAddress
	 */
	public String getPayRequestConsumerIPAddress() {
		return payRequestConsumerIPAddress;
	}

	/**
	 * @param payRequestConsumerIPAddress
	 *            the payRequestConsumerIPAddress to set
	 */
	public void setPayRequestConsumerIPAddress(String payRequestConsumerIPAddress) {
		this.payRequestConsumerIPAddress = payRequestConsumerIPAddress;
	}

	/**
	 * @return the payRequestConsumerLanguage
	 */
	public String getPayRequestConsumerLanguage() {
		return payRequestConsumerLanguage;
	}

	/**
	 * @param payRequestConsumerLanguage
	 *            the payRequestConsumerLanguage to set
	 */
	public void setPayRequestConsumerLanguage(String payRequestConsumerLanguage) {
		this.payRequestConsumerLanguage = payRequestConsumerLanguage;
	}

	/**
	 * @return the payRequestConsumerNation
	 */
	public String getPayRequestConsumerNation() {
		return payRequestConsumerNation;
	}

	/**
	 * @param payRequestConsumerNation
	 *            the payRequestConsumerNation to set
	 */
	public void setPayRequestConsumerNation(String payRequestConsumerNation) {
		this.payRequestConsumerNation = payRequestConsumerNation;
	}

	/**
	 * @return the payRequestCreateRecurringDescription
	 */
	public String getPayRequestCreateRecurringDescription() {
		return payRequestCreateRecurringDescription;
	}

	/**
	 * @param payRequestCreateRecurringDescription
	 *            the payRequestCreateRecurringDescription to set
	 */
	public void setPayRequestCreateRecurringDescription(String payRequestCreateRecurringDescription) {
		this.payRequestCreateRecurringDescription = payRequestCreateRecurringDescription;
	}

	/**
	 * @return the payRequestCreateRecurringExpireDate
	 */
	public String getPayRequestCreateRecurringExpireDate() {
		return payRequestCreateRecurringExpireDate;
	}

	/**
	 * @param payRequestCreateRecurringExpireDate
	 *            the payRequestCreateRecurringExpireDate to set
	 */
	public void setPayRequestCreateRecurringExpireDate(String payRequestCreateRecurringExpireDate) {
		this.payRequestCreateRecurringExpireDate = payRequestCreateRecurringExpireDate;
	}

	/**
	 * @return the refundRequestTransactionID
	 */
	public Long getRefundRequestTransactionID() {
		return refundRequestTransactionID;
	}

	/**
	 * @param refundRequestTransactionID
	 *            the refundRequestTransactionID to set
	 */
	public void setRefundRequestTransactionID(Long refundRequestTransactionID) {
		this.refundRequestTransactionID = refundRequestTransactionID;
	}

}
