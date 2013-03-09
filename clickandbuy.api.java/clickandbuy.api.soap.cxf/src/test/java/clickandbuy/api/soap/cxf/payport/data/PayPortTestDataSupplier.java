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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PayPortTestDataSupplier [cancelRequestCancelMode=" + cancelRequestCancelMode + ", creditRequestMoneyAmount=" + creditRequestMoneyAmount + ", creditRequestMoneyCurrency=" + creditRequestMoneyCurrency
				+ ", creditRequestEmail=" + creditRequestEmail + ", payRequestRecurringAmount=" + payRequestRecurringAmount + ", payRequestRecurringCurrency=" + payRequestRecurringCurrency + ", payRequestRecurringPaymentAuthorizationID="
				+ payRequestRecurringPaymentAuthorizationID + ", payRequestAmount=" + payRequestAmount + ", payRequestCurrency=" + payRequestCurrency + ", payRequestText=" + payRequestText + ", payRequestBasketRisk=" + payRequestBasketRisk
				+ ", payRequestClientRisk=" + payRequestClientRisk + ", payRequestAuthExpiration=" + payRequestAuthExpiration + ", payRequestConfirmExpiration=" + payRequestConfirmExpiration + ", payRequestSuccessExpiration="
				+ payRequestSuccessExpiration + ", payRequestSuccessURI=" + payRequestSuccessURI + ", payRequestFailureURI=" + payRequestFailureURI + ", payRequestConsumerIPAddress=" + payRequestConsumerIPAddress
				+ ", payRequestConsumerLanguage=" + payRequestConsumerLanguage + ", payRequestConsumerNation=" + payRequestConsumerNation + ", payRequestCreateRecurringDescription=" + payRequestCreateRecurringDescription
				+ ", payRequestCreateRecurringExpireDate=" + payRequestCreateRecurringExpireDate + ", refundRequestTransactionID=" + refundRequestTransactionID + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cancelRequestCancelMode == null) ? 0 : cancelRequestCancelMode.hashCode());
		result = prime * result + ((creditRequestEmail == null) ? 0 : creditRequestEmail.hashCode());
		result = prime * result + ((creditRequestMoneyAmount == null) ? 0 : creditRequestMoneyAmount.hashCode());
		result = prime * result + ((creditRequestMoneyCurrency == null) ? 0 : creditRequestMoneyCurrency.hashCode());
		result = prime * result + ((payRequestAmount == null) ? 0 : payRequestAmount.hashCode());
		result = prime * result + payRequestAuthExpiration;
		result = prime * result + payRequestBasketRisk;
		result = prime * result + payRequestClientRisk;
		result = prime * result + payRequestConfirmExpiration;
		result = prime * result + ((payRequestConsumerIPAddress == null) ? 0 : payRequestConsumerIPAddress.hashCode());
		result = prime * result + ((payRequestConsumerLanguage == null) ? 0 : payRequestConsumerLanguage.hashCode());
		result = prime * result + ((payRequestConsumerNation == null) ? 0 : payRequestConsumerNation.hashCode());
		result = prime * result + ((payRequestCreateRecurringDescription == null) ? 0 : payRequestCreateRecurringDescription.hashCode());
		result = prime * result + ((payRequestCreateRecurringExpireDate == null) ? 0 : payRequestCreateRecurringExpireDate.hashCode());
		result = prime * result + ((payRequestCurrency == null) ? 0 : payRequestCurrency.hashCode());
		result = prime * result + ((payRequestFailureURI == null) ? 0 : payRequestFailureURI.hashCode());
		result = prime * result + ((payRequestRecurringAmount == null) ? 0 : payRequestRecurringAmount.hashCode());
		result = prime * result + ((payRequestRecurringCurrency == null) ? 0 : payRequestRecurringCurrency.hashCode());
		result = prime * result + ((payRequestRecurringPaymentAuthorizationID == null) ? 0 : payRequestRecurringPaymentAuthorizationID.hashCode());
		result = prime * result + payRequestSuccessExpiration;
		result = prime * result + ((payRequestSuccessURI == null) ? 0 : payRequestSuccessURI.hashCode());
		result = prime * result + ((payRequestText == null) ? 0 : payRequestText.hashCode());
		result = prime * result + ((refundRequestTransactionID == null) ? 0 : refundRequestTransactionID.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		PayPortTestDataSupplier other = (PayPortTestDataSupplier) obj;
		if (cancelRequestCancelMode != other.cancelRequestCancelMode) {
			return false;
		}
		if (creditRequestEmail == null) {
			if (other.creditRequestEmail != null) {
				return false;
			}
		} else if (!creditRequestEmail.equals(other.creditRequestEmail)) {
			return false;
		}
		if (creditRequestMoneyAmount == null) {
			if (other.creditRequestMoneyAmount != null) {
				return false;
			}
		} else if (!creditRequestMoneyAmount.equals(other.creditRequestMoneyAmount)) {
			return false;
		}
		if (creditRequestMoneyCurrency == null) {
			if (other.creditRequestMoneyCurrency != null) {
				return false;
			}
		} else if (!creditRequestMoneyCurrency.equals(other.creditRequestMoneyCurrency)) {
			return false;
		}
		if (payRequestAmount == null) {
			if (other.payRequestAmount != null) {
				return false;
			}
		} else if (!payRequestAmount.equals(other.payRequestAmount)) {
			return false;
		}
		if (payRequestAuthExpiration != other.payRequestAuthExpiration) {
			return false;
		}
		if (payRequestBasketRisk != other.payRequestBasketRisk) {
			return false;
		}
		if (payRequestClientRisk != other.payRequestClientRisk) {
			return false;
		}
		if (payRequestConfirmExpiration != other.payRequestConfirmExpiration) {
			return false;
		}
		if (payRequestConsumerIPAddress == null) {
			if (other.payRequestConsumerIPAddress != null) {
				return false;
			}
		} else if (!payRequestConsumerIPAddress.equals(other.payRequestConsumerIPAddress)) {
			return false;
		}
		if (payRequestConsumerLanguage == null) {
			if (other.payRequestConsumerLanguage != null) {
				return false;
			}
		} else if (!payRequestConsumerLanguage.equals(other.payRequestConsumerLanguage)) {
			return false;
		}
		if (payRequestConsumerNation == null) {
			if (other.payRequestConsumerNation != null) {
				return false;
			}
		} else if (!payRequestConsumerNation.equals(other.payRequestConsumerNation)) {
			return false;
		}
		if (payRequestCreateRecurringDescription == null) {
			if (other.payRequestCreateRecurringDescription != null) {
				return false;
			}
		} else if (!payRequestCreateRecurringDescription.equals(other.payRequestCreateRecurringDescription)) {
			return false;
		}
		if (payRequestCreateRecurringExpireDate == null) {
			if (other.payRequestCreateRecurringExpireDate != null) {
				return false;
			}
		} else if (!payRequestCreateRecurringExpireDate.equals(other.payRequestCreateRecurringExpireDate)) {
			return false;
		}
		if (payRequestCurrency == null) {
			if (other.payRequestCurrency != null) {
				return false;
			}
		} else if (!payRequestCurrency.equals(other.payRequestCurrency)) {
			return false;
		}
		if (payRequestFailureURI == null) {
			if (other.payRequestFailureURI != null) {
				return false;
			}
		} else if (!payRequestFailureURI.equals(other.payRequestFailureURI)) {
			return false;
		}
		if (payRequestRecurringAmount == null) {
			if (other.payRequestRecurringAmount != null) {
				return false;
			}
		} else if (!payRequestRecurringAmount.equals(other.payRequestRecurringAmount)) {
			return false;
		}
		if (payRequestRecurringCurrency == null) {
			if (other.payRequestRecurringCurrency != null) {
				return false;
			}
		} else if (!payRequestRecurringCurrency.equals(other.payRequestRecurringCurrency)) {
			return false;
		}
		if (payRequestRecurringPaymentAuthorizationID == null) {
			if (other.payRequestRecurringPaymentAuthorizationID != null) {
				return false;
			}
		} else if (!payRequestRecurringPaymentAuthorizationID.equals(other.payRequestRecurringPaymentAuthorizationID)) {
			return false;
		}
		if (payRequestSuccessExpiration != other.payRequestSuccessExpiration) {
			return false;
		}
		if (payRequestSuccessURI == null) {
			if (other.payRequestSuccessURI != null) {
				return false;
			}
		} else if (!payRequestSuccessURI.equals(other.payRequestSuccessURI)) {
			return false;
		}
		if (payRequestText == null) {
			if (other.payRequestText != null) {
				return false;
			}
		} else if (!payRequestText.equals(other.payRequestText)) {
			return false;
		}
		if (refundRequestTransactionID == null) {
			if (other.refundRequestTransactionID != null) {
				return false;
			}
		} else if (!refundRequestTransactionID.equals(other.refundRequestTransactionID)) {
			return false;
		}
		return true;
	}

}
