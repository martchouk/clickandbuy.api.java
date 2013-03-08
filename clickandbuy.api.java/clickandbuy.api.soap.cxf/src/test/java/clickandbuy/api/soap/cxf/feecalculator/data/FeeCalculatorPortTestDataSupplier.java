/**
 * 
 */
package clickandbuy.api.soap.cxf.feecalculator.data;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
public class FeeCalculatorPortTestDataSupplier {

	/**
	 * 
	 * GetFeeCardAverageTicketSizes Test data
	 * 
	 */
	@Value("${feePort.getFeeCardAverageTicketSizesRequest.currency}")
	private String	getFeeCardAverageTicketSizesRequestCurrency;

	@Value("${feePort.getFeeCardAverageTicketSizesRequest.category}")
	private String	getFeeCardAverageTicketSizesRequestCategory;

	/**
	 * 
	 * GetFeeCardInvoicingCycles Test data
	 * 
	 */

	/** GetFeeCardAverageTicketSizes Test data */
	@Value("${feePort.getFeeCardInvoicingCyclesRequest.currency}")
	private String	getFeeCardInvoicingCyclesRequestCurrency;

	@Value("${feePort.getFeeCardInvoicingCyclesRequest.category}")
	private String	getFeeCardInvoicingCyclesRequestCategory;

	/**
	 * 
	 * GetFeeCardSettlement Test data
	 * 
	 */

	/** GetFeeCardAverageTicketSizes Test data */
	@Value("${feePort.getFeeCardSettlementDelaysRequest.currency}")
	private String	getFeeCardSettlementDelaysRequestCurrency;

	@Value("${feePort.getFeeCardSettlementDelaysRequest.category}")
	private String	getFeeCardSettlementDelaysRequestCategory;

	/**
	 * 
	 * GetFeeCard Test data
	 * 
	 */

	@Value("${feePort.getFeeCardRequest.invoicingCycle}")
	private int		getFeeCardRequestInvoicingCycle;

	@Value("${feePort.getFeeCardRequest.amount}")
	private long	getFeeCardRequestAmount;

	@Value("${feePort.getFeeCardRequest.settlementDelay}")
	private int		getFeeCardRequestSettlementDelay;

	@Value("${feePort.getFeeCardRequest.currency}")
	private String	getFeeCardRequestCurrency;

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
