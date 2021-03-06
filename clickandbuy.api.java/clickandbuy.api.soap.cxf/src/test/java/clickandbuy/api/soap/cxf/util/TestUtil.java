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

import com.clickandbuy.api.soap.cxf.FeeCardCategory;
import com.clickandbuy.api.soap.cxf.Money;
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
