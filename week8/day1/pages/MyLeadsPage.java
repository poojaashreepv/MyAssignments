package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClassLeafTaps;

public class MyLeadsPage extends BaseClassLeafTaps {
	
	public MyLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadPage clickOnCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	public FindLeadsPage clickOnFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
		
	}
	public MergeLeadsPage clickOnMergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadsPage(driver);
	}
	
}
