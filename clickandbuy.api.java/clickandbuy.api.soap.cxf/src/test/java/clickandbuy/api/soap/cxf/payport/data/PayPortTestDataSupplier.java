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
	// @Value("${payPort.cancelRequest.cancelIdentifier.recurringPaymentAuthorizationID}")
	// normally will be determined at runtime by running a PayRequestRecurring
	// private Long cancelRequestRecurringPaymentAuthorizationID;

	// @Value("${payPort.cancelRequest.cancelIdentifier.transactionID}")
	// normally will be determined at runtime by running a PayRequest
	// private Long cancelRequestTransactionID;

	@Value("${payPort.cancelRequest.cancelMode}")
	private CancelMode	cancelRequestCancelMode;

	/** CreditRequest Test data */

	/** ExecuteBatch Test data */

	/** GetBatchStatus Test data */

	/** PayRequestRecurring Test data */

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

	/** RefundRequest Test data */

	/** Status Request Test data */

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
}
