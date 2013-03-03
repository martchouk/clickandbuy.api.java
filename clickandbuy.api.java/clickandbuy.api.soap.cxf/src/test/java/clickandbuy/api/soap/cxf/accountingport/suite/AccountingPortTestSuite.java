package clickandbuy.api.soap.cxf.accountingport.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import clickandbuy.api.soap.cxf.accountingport.tests.GetAccountingDocumentsTest;

/**
 * Test suite for AccountingPort related tests
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	GetAccountingDocumentsTest.class
})
public class AccountingPortTestSuite {
}
