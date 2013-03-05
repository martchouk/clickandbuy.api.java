/**
 * 
 */
package clickandbuy.api.soap.cxf.util;

import java.math.BigDecimal;

import com.clickandbuy.api.soap.cxf.CancelIdentifier;
import com.clickandbuy.api.soap.cxf.CancelMode;
import com.clickandbuy.api.soap.cxf.CancelRequestDetails;
import com.clickandbuy.api.soap.cxf.CreditRecipientIdentifier;
import com.clickandbuy.api.soap.cxf.CreditRequestDetails;
import com.clickandbuy.api.soap.cxf.Money;
import com.clickandbuy.api.soap.cxf.OrderDetailItem;
import com.clickandbuy.api.soap.cxf.OrderDetailItemList;
import com.clickandbuy.api.soap.cxf.OrderDetailItemType;
import com.clickandbuy.api.soap.cxf.OrderDetails;

/**
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class TestUtil {

	/**
	 * Prevent instantiation of utils class
	 */
	private TestUtil() {
	}

	public static CreditRequestDetails prepareCreditRequestDetails(Money amount, String consumerLanguage, String externalId, OrderDetails orderDetails, CreditRecipientIdentifier creditRecipientIdentifier) {
		CreditRequestDetails creditRequestDetails = new CreditRequestDetails();

		// TODO fill in necessary test data

		creditRequestDetails.setAmount(amount);
		creditRequestDetails.setConsumerLanguage(consumerLanguage);
		creditRequestDetails.setExternalID(externalId);
		creditRequestDetails.setOrderDetails(orderDetails);
		creditRequestDetails.setRecipient(creditRecipientIdentifier);

		return creditRequestDetails;
	}

	public static Money prepareMoney(BigDecimal amount, String currency) {
		Money money = new Money();

		money.setAmount(amount);
		money.setCurrency(currency);

		return money;
	}

	public static OrderDetails prepareOrderDetails(OrderDetailItemList orderDetailItemList, String text) {
		OrderDetails orderDetails = new OrderDetails();

		orderDetails.setItemList(orderDetailItemList);
		orderDetails.setText(text);

		return orderDetails;
	}

	public static OrderDetailItemList prepareOrderDetailItemList(OrderDetailItem orderDetailItem) {
		OrderDetailItemList orderDetailItemList = new OrderDetailItemList();

		orderDetailItemList.getItem().add(orderDetailItem);

		return orderDetailItemList;
	}

	public static OrderDetailItem prepareOrderDetailItem(String description, OrderDetailItemType orderDetailItemType, Integer quantiry, Money totalPrice, Money unitPrice) {
		OrderDetailItem orderDetailItem = new OrderDetailItem();

		orderDetailItem.setDescription(description);
		orderDetailItem.setItemType(orderDetailItemType);
		orderDetailItem.setQuantity(quantiry);
		orderDetailItem.setTotalPrice(totalPrice);
		orderDetailItem.setUnitPrice(unitPrice);

		return orderDetailItem;
	}

	public static CreditRecipientIdentifier prepareCreditRecipientIdentifier(Long crn, String email) {
		CreditRecipientIdentifier creditRecipientIdentifier = new CreditRecipientIdentifier();

		creditRecipientIdentifier.setCrn(crn);
		creditRecipientIdentifier.setEmailAddress(email);

		return creditRecipientIdentifier;
	}

	public static CancelRequestDetails prepareCancelRequestDetails(CancelIdentifier cancelIdentifier, CancelMode cancelMode) {
		CancelRequestDetails cancelRequestDetails = new CancelRequestDetails();

		cancelRequestDetails.setCancelIdentifier(cancelIdentifier);
		cancelRequestDetails.setCancelMode(cancelMode);

		return cancelRequestDetails;
	}

	public static CancelRequestDetails prepareCancelRequestDetails(Long recurringPaymentAuthorizationID, Long transactionID, CancelMode cancelMode) {
		CancelRequestDetails cancelRequestDetails = new CancelRequestDetails();

		cancelRequestDetails.setCancelIdentifier(prepareCancelIdentifier(recurringPaymentAuthorizationID, transactionID));
		cancelRequestDetails.setCancelMode(cancelMode);

		return cancelRequestDetails;
	}

	public static CancelIdentifier prepareCancelIdentifier(Long recurringPaymentAuthorizationID, Long transactionID) {
		CancelIdentifier cancelIdentifier = new CancelIdentifier();

		if (recurringPaymentAuthorizationID != null) {
			cancelIdentifier.setRecurringPaymentAuthorizationID(recurringPaymentAuthorizationID);
		} else {
			cancelIdentifier.setTransactionID(transactionID);
		}

		return cancelIdentifier;
	}
}
