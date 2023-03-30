package runner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.BaseClassLeafTaps;
import pages.LoginPage;

public class CreateLeadRunner extends BaseClassLeafTaps{

	@Test
	public void createLead()
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName("demoSalesManager").enterPassword("crmsfa").clickOnLoginButton()
		.clickOnCrmsfa().clickOnLeads().clickOnCreateLead().enterCompanyName("TestLeaf")
		.enterFirstName("Hari").enterLastName("R").enterPhoneNumber("99").clickOnCreateLeadButton().verifyCreatedLeadFirstName();
		
	}

}
