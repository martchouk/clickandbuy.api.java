/**
 * 
 */
package clickandbuy.api.soap.cxf.payport.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import clickandbuy.api.soap.cxf.payport.tests.AddBathItemTest;
import clickandbuy.api.soap.cxf.payport.tests.CancelBatchTest;
import clickandbuy.api.soap.cxf.payport.tests.CancelRequestTest;
import clickandbuy.api.soap.cxf.payport.tests.CreateBatchTest;
import clickandbuy.api.soap.cxf.payport.tests.CreditRequestTest;
import clickandbuy.api.soap.cxf.payport.tests.ExecuteBatchTest;
import clickandbuy.api.soap.cxf.payport.tests.GetBatchStatusTest;
import clickandbuy.api.soap.cxf.payport.tests.PayRequestRecurringTest;
import clickandbuy.api.soap.cxf.payport.tests.PayRequestTest;
import clickandbuy.api.soap.cxf.payport.tests.RefundRequestTest;
import clickandbuy.api.soap.cxf.payport.tests.StatusRequestTest;

/**
 * Test suite for PayPort related tests
 * 
 * @author Ciprian I. Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	AddBathItemTest.class,
	CancelBatchTest.class,
	CancelRequestTest.class,
	CreateBatchTest.class,
	CreditRequestTest.class,
	ExecuteBatchTest.class,
	GetBatchStatusTest.class,
	PayRequestRecurringTest.class,
	PayRequestTest.class,
	RefundRequestTest.class,
	StatusRequestTest.class
})
public class PayPortTestSuite {
}
