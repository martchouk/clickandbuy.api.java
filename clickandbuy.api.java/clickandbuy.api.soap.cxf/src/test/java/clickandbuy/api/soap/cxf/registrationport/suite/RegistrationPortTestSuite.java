package clickandbuy.api.soap.cxf.registrationport.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import clickandbuy.api.soap.cxf.registrationport.tests.CreateMerchantRegistrationTest;
import clickandbuy.api.soap.cxf.registrationport.tests.GetMerchantRegistrationStatusTest;

/**
 * Test Suite for RegistrationPort related tests
 * 
 * @author Ciprian I. Ileana
 * @author Nicole Petridean
 * 
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	CreateMerchantRegistrationTest.class,
	GetMerchantRegistrationStatusTest.class
})
public class RegistrationPortTestSuite {
}
