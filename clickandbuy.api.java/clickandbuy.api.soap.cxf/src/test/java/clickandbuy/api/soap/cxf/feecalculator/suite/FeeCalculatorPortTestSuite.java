package clickandbuy.api.soap.cxf.feecalculator.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import clickandbuy.api.soap.cxf.feecalculator.tests.GetFeeCardAverageTicketSizesTest;
import clickandbuy.api.soap.cxf.feecalculator.tests.GetFeeCardCategoriesTest;
import clickandbuy.api.soap.cxf.feecalculator.tests.GetFeeCardCurrenciesTest;
import clickandbuy.api.soap.cxf.feecalculator.tests.GetFeeCardInvoicingCyclesTest;
import clickandbuy.api.soap.cxf.feecalculator.tests.GetFeeCardSettlementDelaysTest;
import clickandbuy.api.soap.cxf.feecalculator.tests.GetFeeCardTest;

/**
 * Test Suite for FeeCalculatorPort related tests
 * 
 * @author Ciprian.Ileana
 * @author Nicolae Petridean
 * 
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	GetFeeCardAverageTicketSizesTest.class,
	GetFeeCardCategoriesTest.class,
	GetFeeCardCurrenciesTest.class,
	GetFeeCardInvoicingCyclesTest.class,
	GetFeeCardSettlementDelaysTest.class,
	GetFeeCardTest.class
})
public class FeeCalculatorPortTestSuite {
}
