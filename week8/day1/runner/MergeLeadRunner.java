package runner;

import org.testng.annotations.Test;

import baseclass.BaseClassLeafTaps;
import pages.LoginPage;

public class MergeLeadRunner extends BaseClassLeafTaps {
	@Test
	public void mergeLead() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName("demoSalesManager").enterPassword("crmsfa").clickOnLoginButton()
		.clickOnCrmsfa().clickOnLeads().clickOnMergeLeads().cickOnFromLeadWidget()
		.switchToFindLeadsWindow().enterFirstName("Hari").clickOnFindLeads1().getFirstLeadIdText()
		.clickOnFirstLeadId().switchToMergeLeadsWindow().cickOnToLeadWidget().switchToFindLeadsWindow1()
		.enterFirstName1("Sri").clickOnFindLeads2().clickOnFirstLeadId1().switchToMergeLeadsWindow1()
		.clickOnMerge().acceptAlert().verifyLeadPresentOrNot();

    }
}
