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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FeeCalculatorPortTestDataSupplier [getFeeCardAverageTicketSizesRequestCurrency=" + getFeeCardAverageTicketSizesRequestCurrency + ", getFeeCardAverageTicketSizesRequestCategory=" + getFeeCardAverageTicketSizesRequestCategory
				+ ", getFeeCardInvoicingCyclesRequestCurrency=" + getFeeCardInvoicingCyclesRequestCurrency + ", getFeeCardInvoicingCyclesRequestCategory=" + getFeeCardInvoicingCyclesRequestCategory
				+ ", getFeeCardSettlementDelaysRequestCurrency=" + getFeeCardSettlementDelaysRequestCurrency + ", getFeeCardSettlementDelaysRequestCategory=" + getFeeCardSettlementDelaysRequestCategory
				+ ", getFeeCardRequestInvoicingCycle=" + getFeeCardRequestInvoicingCycle + ", getFeeCardRequestAmount=" + getFeeCardRequestAmount + ", getFeeCardRequestSettlementDelay=" + getFeeCardRequestSettlementDelay
				+ ", getFeeCardRequestCurrency=" + getFeeCardRequestCurrency + ", getFeeCardRequestCategory=" + getFeeCardRequestCategory + "]";
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
		result = prime * result + ((getFeeCardAverageTicketSizesRequestCategory == null) ? 0 : getFeeCardAverageTicketSizesRequestCategory.hashCode());
		result = prime * result + ((getFeeCardAverageTicketSizesRequestCurrency == null) ? 0 : getFeeCardAverageTicketSizesRequestCurrency.hashCode());
		result = prime * result + ((getFeeCardInvoicingCyclesRequestCategory == null) ? 0 : getFeeCardInvoicingCyclesRequestCategory.hashCode());
		result = prime * result + ((getFeeCardInvoicingCyclesRequestCurrency == null) ? 0 : getFeeCardInvoicingCyclesRequestCurrency.hashCode());
		result = prime * result + (int) (getFeeCardRequestAmount ^ (getFeeCardRequestAmount >>> 32));
		result = prime * result + ((getFeeCardRequestCategory == null) ? 0 : getFeeCardRequestCategory.hashCode());
		result = prime * result + ((getFeeCardRequestCurrency == null) ? 0 : getFeeCardRequestCurrency.hashCode());
		result = prime * result + getFeeCardRequestInvoicingCycle;
		result = prime * result + getFeeCardRequestSettlementDelay;
		result = prime * result + ((getFeeCardSettlementDelaysRequestCategory == null) ? 0 : getFeeCardSettlementDelaysRequestCategory.hashCode());
		result = prime * result + ((getFeeCardSettlementDelaysRequestCurrency == null) ? 0 : getFeeCardSettlementDelaysRequestCurrency.hashCode());
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
		FeeCalculatorPortTestDataSupplier other = (FeeCalculatorPortTestDataSupplier) obj;
		if (getFeeCardAverageTicketSizesRequestCategory == null) {
			if (other.getFeeCardAverageTicketSizesRequestCategory != null) {
				return false;
			}
		} else if (!getFeeCardAverageTicketSizesRequestCategory.equals(other.getFeeCardAverageTicketSizesRequestCategory)) {
			return false;
		}
		if (getFeeCardAverageTicketSizesRequestCurrency == null) {
			if (other.getFeeCardAverageTicketSizesRequestCurrency != null) {
				return false;
			}
		} else if (!getFeeCardAverageTicketSizesRequestCurrency.equals(other.getFeeCardAverageTicketSizesRequestCurrency)) {
			return false;
		}
		if (getFeeCardInvoicingCyclesRequestCategory == null) {
			if (other.getFeeCardInvoicingCyclesRequestCategory != null) {
				return false;
			}
		} else if (!getFeeCardInvoicingCyclesRequestCategory.equals(other.getFeeCardInvoicingCyclesRequestCategory)) {
			return false;
		}
		if (getFeeCardInvoicingCyclesRequestCurrency == null) {
			if (other.getFeeCardInvoicingCyclesRequestCurrency != null) {
				return false;
			}
		} else if (!getFeeCardInvoicingCyclesRequestCurrency.equals(other.getFeeCardInvoicingCyclesRequestCurrency)) {
			return false;
		}
		if (getFeeCardRequestAmount != other.getFeeCardRequestAmount) {
			return false;
		}
		if (getFeeCardRequestCategory == null) {
			if (other.getFeeCardRequestCategory != null) {
				return false;
			}
		} else if (!getFeeCardRequestCategory.equals(other.getFeeCardRequestCategory)) {
			return false;
		}
		if (getFeeCardRequestCurrency == null) {
			if (other.getFeeCardRequestCurrency != null) {
				return false;
			}
		} else if (!getFeeCardRequestCurrency.equals(other.getFeeCardRequestCurrency)) {
			return false;
		}
		if (getFeeCardRequestInvoicingCycle != other.getFeeCardRequestInvoicingCycle) {
			return false;
		}
		if (getFeeCardRequestSettlementDelay != other.getFeeCardRequestSettlementDelay) {
			return false;
		}
		if (getFeeCardSettlementDelaysRequestCategory == null) {
			if (other.getFeeCardSettlementDelaysRequestCategory != null) {
				return false;
			}
		} else if (!getFeeCardSettlementDelaysRequestCategory.equals(other.getFeeCardSettlementDelaysRequestCategory)) {
			return false;
		}
		if (getFeeCardSettlementDelaysRequestCurrency == null) {
			if (other.getFeeCardSettlementDelaysRequestCurrency != null) {
				return false;
			}
		} else if (!getFeeCardSettlementDelaysRequestCurrency.equals(other.getFeeCardSettlementDelaysRequestCurrency)) {
			return false;
		}
		return true;
	}

}
