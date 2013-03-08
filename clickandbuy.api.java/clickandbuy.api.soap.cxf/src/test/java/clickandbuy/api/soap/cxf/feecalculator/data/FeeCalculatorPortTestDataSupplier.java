/**
 * 
 */
package clickandbuy.api.soap.cxf.feecalculator.data;

import org.springframework.beans.factory.annotation.Value;

import com.clickandbuy.api.soap.cxf.FeeCalculatorPortType;

/**
 * Holds all necessary test data for {@link FeeCalculatorPortType} related tests.
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class FeeCalculatorPortTestDataSupplier {

	/**
	 * GetFeeCardAverageTicketSizes Test data
	 */
	/** The currency for get fee card average ticket size request */
	@Value("${feePort.getFeeCardAverageTicketSizesRequest.currency}")
	private String	getFeeCardAverageTicketSizesRequestCurrency;

	/** The category for get fee card average ticket size request */
	@Value("${feePort.getFeeCardAverageTicketSizesRequest.category}")
	private String	getFeeCardAverageTicketSizesRequestCategory;

	/**
	 * GetFeeCardInvoicingCycles Test data
	 */

	/** The money currency for get fee card invoicing cycles request */
	@Value("${feePort.getFeeCardInvoicingCyclesRequest.currency}")
	private String	getFeeCardInvoicingCyclesRequestCurrency;

	/** The category for get fee card invoicing cycles request */
	@Value("${feePort.getFeeCardInvoicingCyclesRequest.category}")
	private String	getFeeCardInvoicingCyclesRequestCategory;

	/**
	 * GetFeeCardSettlement Test data
	 */

	/** The money currency for get fee card settlement delays request */
	@Value("${feePort.getFeeCardSettlementDelaysRequest.currency}")
	private String	getFeeCardSettlementDelaysRequestCurrency;

	/** The category for get fee card settlement delays request */
	@Value("${feePort.getFeeCardSettlementDelaysRequest.category}")
	private String	getFeeCardSettlementDelaysRequestCategory;

	/**
	 * GetFeeCard Test data
	 */

	/** Invoicing cycle for get fee card request */
	@Value("${feePort.getFeeCardRequest.invoicingCycle}")
	private int		getFeeCardRequestInvoicingCycle;

	/** The money amount for get fee card request */
	@Value("${feePort.getFeeCardRequest.amount}")
	private long	getFeeCardRequestAmount;

	/** The settlement delay for get fee card request */
	@Value("${feePort.getFeeCardRequest.settlementDelay}")
	private int		getFeeCardRequestSettlementDelay;

	/** The money currency for get fee card request */
	@Value("${feePort.getFeeCardRequest.currency}")
	private String	getFeeCardRequestCurrency;

	/** The category for fee get card request */
	@Value("${feePort.getFeeCardRequest.category}")
	private String	getFeeCardRequestCategory;

	/**
	 * @return the getFeeCardRequestAmount
	 */
	public long getGetFeeCardRequestAmount() {
		return getFeeCardRequestAmount;
	}

	/**
	 * @return the getFeeCardAverageTicketSizesRequestCurrency
	 */
	public final String getGetFeeCardAverageTicketSizesRequestCurrency() {
		return getFeeCardAverageTicketSizesRequestCurrency;
	}

	/**
	 * @return the getFeeCardAverageTicketSizesRequestCategory
	 */
	public final String getGetFeeCardAverageTicketSizesRequestCategory() {
		return getFeeCardAverageTicketSizesRequestCategory;
	}

	/**
	 * @return the getFeeCardInvoicingCyclesRequestCurrency
	 */
	public final String getGetFeeCardInvoicingCyclesRequestCurrency() {
		return getFeeCardInvoicingCyclesRequestCurrency;
	}

	/**
	 * @return the getFeeCardInvoicingCyclesRequestCategory
	 */
	public final String getGetFeeCardInvoicingCyclesRequestCategory() {
		return getFeeCardInvoicingCyclesRequestCategory;
	}

	/**
	 * @return the getFeeCardSettlementDelaysRequestCurrency
	 */
	public final String getGetFeeCardSettlementDelaysRequestCurrency() {
		return getFeeCardSettlementDelaysRequestCurrency;
	}

	/**
	 * @return the getFeeCardSettlementDelaysRequestCategory
	 */
	public final String getGetFeeCardSettlementDelaysRequestCategory() {
		return getFeeCardSettlementDelaysRequestCategory;
	}

	/**
	 * @return the getFeeCardRequestInvoicingCycle
	 */
	public final int getGetFeeCardRequestInvoicingCycle() {
		return getFeeCardRequestInvoicingCycle;
	}

	/**
	 * @return the getFeeCardRequestSettlementDelay
	 */
	public final int getGetFeeCardRequestSettlementDelay() {
		return getFeeCardRequestSettlementDelay;
	}

	/**
	 * @return the getFeeCardRequestCurrency
	 */
	public final String getGetFeeCardRequestCurrency() {
		return getFeeCardRequestCurrency;
	}

	/**
	 * @return the getFeeCardRequestCategory
	 */
	public final String getGetFeeCardRequestCategory() {
		return getFeeCardRequestCategory;
	}

}
