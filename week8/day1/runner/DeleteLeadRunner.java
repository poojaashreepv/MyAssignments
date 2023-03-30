package runner;

import org.testng.annotations.Test;

import baseclass.BaseClassLeafTaps;
import pages.LoginPage;

public class DeleteLeadRunner extends BaseClassLeafTaps {
	@Test
	public void deleteLead() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName("demoSalesManager").enterPassword("crmsfa").clickOnLoginButton()
		.clickOnCrmsfa().clickOnLeads().clickOnFindLeads().clickOnPhone().enterPhoneNumber("99")
		.clickOnFindLeads1().getLeadId().clickOnFirstLead2().clickOnDelete().clickOnFindLeads3()
		.enterFirstLeadId2().clickOnFindLeads4().verifyLeadDeletedOrNot();

    }

}
