package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClassLeafTaps;

public class ViewLeadPage extends BaseClassLeafTaps {
	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public void verifyCreatedLeadFirstName() {
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(firstName.equals(firstName)) {
			System.out.println("Lead is Created");
		}
		else {
			System.out.println("Lead is Not Created");
		}
	}
	public void verifyEditLeadCompanyName() {
		String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(companyName.equals(companyName)) {
			System.out.println("Lead is Edited");
		}
		else {
			System.out.println("Lead is Not Edited");
		}
	}
	public void verifyDuplicateLeadPhoneNumber() {
		String phoneNumber = driver.findElement(By.xpath("//table[@class='contactTable']/tbody/tr[2]/td[2]/div")).getText();
		if(phoneNumber.contains("99")) {
			System.out.println("Duplicate Lead is Created");
		}
		else {
			System.out.println("Duplicate Lead is Not Created");
		}
	}

}
