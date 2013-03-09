/**
 * 
 */
package clickandbuy.api.soap.cxf.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.util.Assert;

import com.clickandbuy.api.soap.cxf.CancelIdentifier;
import com.clickandbuy.api.soap.cxf.CancelMode;
import com.clickandbuy.api.soap.cxf.CancelRequestDetails;
import com.clickandbuy.api.soap.cxf.CreditRecipientIdentifier;
import com.clickandbuy.api.soap.cxf.CreditRequestDetails;
import com.clickandbuy.api.soap.cxf.FeeCardCategory;
import com.clickandbuy.api.soap.cxf.Money;
import com.clickandbuy.api.soap.cxf.OrderDetailItem;
import com.clickandbuy.api.soap.cxf.OrderDetailItemList;
import com.clickandbuy.api.soap.cxf.OrderDetailItemType;
import com.clickandbuy.api.soap.cxf.OrderDetails;
import com.clickandbuy.api.util.auth.CabApiUniqueDateFormat;

/**
 * Collection of various utils methods used across tests
 * 
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

	/**
	 * Creates an instance of {@link XMLGregorianCalendar} based on the received date representation as string. The date as string in first parsed using {@link CabApiUniqueDateFormat}.
	 * 
	 * @param dateAsString
	 * @return
	 * @throws ParseException
	 * @throws DatatypeConfigurationException
	 */
	public static XMLGregorianCalendar toXMLGregorianCalendar(final String dateAsString) throws ParseException, DatatypeConfigurationException {
		final long date = CabApiUniqueDateFormat.getDayYYYYMMdd().parse(dateAsString.trim()).getTime();

		return toXMLGregorianCalendar(date);
	}

	/**
	 * Creates an instance of {@link XMLGregorianCalendar} based on the received data representation in milliseconds. The date as string in first parsed using {@link CabApiUniqueDateFormat}.
	 * 
	 * @param dateAsMillis
	 * @return
	 * @throws DatatypeConfigurationException
	 */
	public static XMLGregorianCalendar toXMLGregorianCalendar(final long dateAsMillis) throws DatatypeConfigurationException {
		final GregorianCalendar gregory = new GregorianCalendar();
		gregory.setTime(new Date(dateAsMillis));
		final XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);

		return xmlGregorianCalendar;
	}

	public static CreditRequestDetails prepareCreditRequestDetails(final Money amount, final String consumerLanguage, final String externalId, final OrderDetails orderDetails, final CreditRecipientIdentifier creditRecipientIdentifier) {
		final CreditRequestDetails creditRequestDetails = new CreditRequestDetails();

		creditRequestDetails.setAmount(amount);
		creditRequestDetails.setConsumerLanguage(consumerLanguage);
		creditRequestDetails.setExternalID(externalId);
		creditRequestDetails.setOrderDetails(orderDetails);
		creditRequestDetails.setRecipient(creditRecipientIdentifier);

		return creditRequestDetails;
	}

	public static OrderDetails prepareOrderDetails(final OrderDetailItemList orderDetailItemList, final String text) {
		final OrderDetails orderDetails = new OrderDetails();

		orderDetails.setItemList(orderDetailItemList);
		orderDetails.setText(text);

		return orderDetails;
	}

	public static OrderDetailItemList prepareOrderDetailItemList(final OrderDetailItem orderDetailItem) {
		final OrderDetailItemList orderDetailItemList = new OrderDetailItemList();

		orderDetailItemList.getItem().add(orderDetailItem);

		return orderDetailItemList;
	}

	public static OrderDetailItem prepareOrderDetailItem(final String description, final OrderDetailItemType orderDetailItemType, final Integer quantiry, final Money totalPrice, final Money unitPrice) {
		final OrderDetailItem orderDetailItem = new OrderDetailItem();

		orderDetailItem.setDescription(description);
		orderDetailItem.setItemType(orderDetailItemType);
		orderDetailItem.setQuantity(quantiry);
		orderDetailItem.setTotalPrice(totalPrice);
		orderDetailItem.setUnitPrice(unitPrice);

		return orderDetailItem;
	}

	public static CreditRecipientIdentifier prepareCreditRecipientIdentifier(final Long crn, final String email) {
		final CreditRecipientIdentifier creditRecipientIdentifier = new CreditRecipientIdentifier();

		creditRecipientIdentifier.setCrn(crn);
		creditRecipientIdentifier.setEmailAddress(email);

		return creditRecipientIdentifier;
	}

	public static CancelRequestDetails prepareCancelRequestDetails(final CancelIdentifier cancelIdentifier, final CancelMode cancelMode) {
		final CancelRequestDetails cancelRequestDetails = new CancelRequestDetails();

		cancelRequestDetails.setCancelIdentifier(cancelIdentifier);
		cancelRequestDetails.setCancelMode(cancelMode);

		return cancelRequestDetails;
	}

	public static CancelRequestDetails prepareCancelRequestDetails(final Long recurringPaymentAuthorizationID, final Long transactionID, final CancelMode cancelMode) {
		final CancelRequestDetails cancelRequestDetails = new CancelRequestDetails();

		cancelRequestDetails.setCancelIdentifier(prepareCancelIdentifier(recurringPaymentAuthorizationID, transactionID));
		cancelRequestDetails.setCancelMode(cancelMode);

		return cancelRequestDetails;
	}

	public static CancelIdentifier prepareCancelIdentifier(final Long recurringPaymentAuthorizationID, final Long transactionID) {
		final CancelIdentifier cancelIdentifier = new CancelIdentifier();

		if (recurringPaymentAuthorizationID != null) {
			cancelIdentifier.setRecurringPaymentAuthorizationID(recurringPaymentAuthorizationID);
		} else {
			cancelIdentifier.setTransactionID(transactionID);
		}

		return cancelIdentifier;
	}

	/**
	 * Prepares an {@link Money} based on the received parameters.
	 * 
	 * @return the ${@link Money}
	 * @throws IllegalArgumentException
	 *             : in case any of the 2 parameters are null or currency is empty
	 */
	public static Money prepareMoney(final BigDecimal amount, final String currency) {
		// amount cannot be null
		Assert.notNull(amount);

		// currency cannot be null nor empty
		Assert.notNull(currency);
		Assert.isTrue(!currency.trim().isEmpty());

		final Money money = new Money();

		money.setAmount(amount);
		money.setCurrency(currency);

		return money;
	}

	/**
	 * Extract the categoryId from the provided category list , based on the category name.
	 * 
	 * @param categoryList
	 * @param categoryName
	 * @return
	 * @throws IllegalArgumentException
	 *             : in case any of the 2 parameters are null or empty.
	 */
	public static long getCategoryFromList(final List<FeeCardCategory> categoryList, final String categoryName) {
		// category name cannot be either null or empty
		Assert.notNull(categoryName);
		Assert.isTrue(!categoryName.trim().isEmpty());

		// categoryList cannot be neither null nor empty
		Assert.notNull(categoryList);
		Assert.isTrue(categoryList.size() > 0);

		long categoryId = -1;
		for (final FeeCardCategory category : categoryList) {
			if (category.getCategoryName().trim().equalsIgnoreCase(categoryName.trim())) {
				categoryId = category.getCategoryID();
			}
		}
		return categoryId;
	}
}
