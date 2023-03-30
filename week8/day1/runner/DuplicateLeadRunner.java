package runner;

import org.testng.annotations.Test;

import baseclass.BaseClassLeafTaps;
import pages.LoginPage;

public class DuplicateLeadRunner extends BaseClassLeafTaps {
	@Test
	public void duplicateLead() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName("demoSalesManager").enterPassword("crmsfa").clickOnLoginButton()
		.clickOnCrmsfa().clickOnLeads().clickOnFindLeads().clickOnPhone().enterPhoneNumber("99")
		.clickOnFindLeads().clickOnFirstLead1().clickOnDuplicateLead().clickOnCreateLeadButton().verifyDuplicateLeadPhoneNumber();
	}

}
