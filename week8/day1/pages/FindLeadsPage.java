package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClassLeafTaps;

public class FindLeadsPage extends BaseClassLeafTaps {
	public String leadID;
	public FindLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public FindLeadsPage clickOnPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public FindLeadsPage enterPhoneNumber(String phno) { 
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		return this;
	}
	public FindLeadsPage clickOnFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
    public EditLeadPage clickOnFirstLead() throws InterruptedException { 
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
    	return new EditLeadPage(driver);
	}
    public DuplicateLeadPage clickOnFirstLead1() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
    	return new DuplicateLeadPage(driver);
	}
    public DeleteLeadPage clickOnFindLeads1() { 
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return new DeleteLeadPage(driver);
	}

    
	
	
}


