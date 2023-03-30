package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClassLeafTaps;

public class DeleteLeadPage extends BaseClassLeafTaps {
	public String leadID;
	public DeleteLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public DeleteLeadPage getLeadId() throws InterruptedException {
		Thread.sleep(2000);
    	leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).getText();
    	return this;
    }
    public DeleteLeadPage clickOnFirstLead2() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
    	return this;
    }
	public DeleteLeadPage clickOnDelete() {
		driver.findElement(By.linkText("Delete")).click();
		return this;
	}
	public DeleteLeadPage clickOnFindLeads3() {
		driver.findElement(By.linkText("Find Leads")).click();
		return this;
	}
	public DeleteLeadPage enterFirstLeadId2() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
	public DeleteLeadPage clickOnFindLeads4() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public void verifyLeadDeletedOrNot() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		
	}

}
