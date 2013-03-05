/**
 * 
 */
package clickandbuy.api.soap.cxf.accountingport.data;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
public class AccountingPortTestDataSupplier {

	/** Test data */
	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.dateRange.after}")
	private String	dateRangeAfter;

	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.dateRange.before}")
	private String	dateRangeBefore;

	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.inteRange.from}")
	private Integer	intRangeFrom;

	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.intRange.until}")
	private Integer	intRangeUntil;

	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.documentType}")
	private String	accountingDocumentType;

	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.fileName}")
	private String	fileName;

	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.fileType}")
	private String	accountingFileType;

	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.pagingSetting.maxResults}")
	private Integer	maxResults;

	@Value("${getAccountingDocuments.getAccountingDocumentsDetails.pagingSetting.skip}")
	private Integer	skip;

	/**
	 * @return the dateRangeAfter
	 */
	public String getDateRangeAfter() {
		return dateRangeAfter;
	}

	/**
	 * @param dateRangeAfter the dateRangeAfter to set
	 */
	public void setDateRangeAfter(String dateRangeAfter) {
		this.dateRangeAfter = dateRangeAfter;
	}

	/**
	 * @return the dateRangeBefore
	 */
	public String getDateRangeBefore() {
		return dateRangeBefore;
	}

	/**
	 * @param dateRangeBefore the dateRangeBefore to set
	 */
	public void setDateRangeBefore(String dateRangeBefore) {
		this.dateRangeBefore = dateRangeBefore;
	}

	/**
	 * @return the intRangeFrom
	 */
	public Integer getIntRangeFrom() {
		return intRangeFrom;
	}

	/**
	 * @param intRangeFrom the intRangeFrom to set
	 */
	public void setIntRangeFrom(Integer intRangeFrom) {
		this.intRangeFrom = intRangeFrom;
	}

	/**
	 * @return the intRangeUntil
	 */
	public Integer getIntRangeUntil() {
		return intRangeUntil;
	}

	/**
	 * @param intRangeUntil the intRangeUntil to set
	 */
	public void setIntRangeUntil(Integer intRangeUntil) {
		this.intRangeUntil = intRangeUntil;
	}

	/**
	 * @return the accountingDocumentType
	 */
	public String getAccountingDocumentType() {
		return accountingDocumentType;
	}

	/**
	 * @param accountingDocumentType the accountingDocumentType to set
	 */
	public void setAccountingDocumentType(String accountingDocumentType) {
		this.accountingDocumentType = accountingDocumentType;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the accountingFileType
	 */
	public String getAccountingFileType() {
		return accountingFileType;
	}

	/**
	 * @param accountingFileType the accountingFileType to set
	 */
	public void setAccountingFileType(String accountingFileType) {
		this.accountingFileType = accountingFileType;
	}

	/**
	 * @return the maxResults
	 */
	public Integer getMaxResults() {
		return maxResults;
	}

	/**
	 * @param maxResults the maxResults to set
	 */
	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	/**
	 * @return the skip
	 */
	public Integer getSkip() {
		return skip;
	}

	/**
	 * @param skip the skip to set
	 */
	public void setSkip(Integer skip) {
		this.skip = skip;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccountingPortTestDataSupplier [dateRangeAfter="
				+ dateRangeAfter + ", dateRangeBefore=" + dateRangeBefore
				+ ", intRangeFrom=" + intRangeFrom + ", intRangeUntil="
				+ intRangeUntil + ", accountingDocumentType="
				+ accountingDocumentType + ", fileName=" + fileName
				+ ", accountingFileType=" + accountingFileType
				+ ", maxResults=" + maxResults + ", skip=" + skip + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((accountingDocumentType == null) ? 0
						: accountingDocumentType.hashCode());
		result = prime
				* result
				+ ((accountingFileType == null) ? 0 : accountingFileType
						.hashCode());
		result = prime * result
				+ ((dateRangeAfter == null) ? 0 : dateRangeAfter.hashCode());
		result = prime * result
				+ ((dateRangeBefore == null) ? 0 : dateRangeBefore.hashCode());
		result = prime * result
				+ ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result
				+ ((intRangeFrom == null) ? 0 : intRangeFrom.hashCode());
		result = prime * result
				+ ((intRangeUntil == null) ? 0 : intRangeUntil.hashCode());
		result = prime * result
				+ ((maxResults == null) ? 0 : maxResults.hashCode());
		result = prime * result + ((skip == null) ? 0 : skip.hashCode());
		return result;
	}

	/* (non-Javadoc)
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
		AccountingPortTestDataSupplier other = (AccountingPortTestDataSupplier) obj;
		if (accountingDocumentType == null) {
			if (other.accountingDocumentType != null) {
				return false;
			}
		} else if (!accountingDocumentType.equals(other.accountingDocumentType)) {
			return false;
		}
		if (accountingFileType == null) {
			if (other.accountingFileType != null) {
				return false;
			}
		} else if (!accountingFileType.equals(other.accountingFileType)) {
			return false;
		}
		if (dateRangeAfter == null) {
			if (other.dateRangeAfter != null) {
				return false;
			}
		} else if (!dateRangeAfter.equals(other.dateRangeAfter)) {
			return false;
		}
		if (dateRangeBefore == null) {
			if (other.dateRangeBefore != null) {
				return false;
			}
		} else if (!dateRangeBefore.equals(other.dateRangeBefore)) {
			return false;
		}
		if (fileName == null) {
			if (other.fileName != null) {
				return false;
			}
		} else if (!fileName.equals(other.fileName)) {
			return false;
		}
		if (intRangeFrom == null) {
			if (other.intRangeFrom != null) {
				return false;
			}
		} else if (!intRangeFrom.equals(other.intRangeFrom)) {
			return false;
		}
		if (intRangeUntil == null) {
			if (other.intRangeUntil != null) {
				return false;
			}
		} else if (!intRangeUntil.equals(other.intRangeUntil)) {
			return false;
		}
		if (maxResults == null) {
			if (other.maxResults != null) {
				return false;
			}
		} else if (!maxResults.equals(other.maxResults)) {
			return false;
		}
		if (skip == null) {
			if (other.skip != null) {
				return false;
			}
		} else if (!skip.equals(other.skip)) {
			return false;
		}
		return true;
	}
}
