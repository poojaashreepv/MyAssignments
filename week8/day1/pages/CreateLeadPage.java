package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClassLeafTaps;

public class CreateLeadPage extends BaseClassLeafTaps {
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
    public CreateLeadPage enterCompanyName(String cname) {
    	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
    	return this;
	}
	public CreateLeadPage enterFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
    public CreateLeadPage enterLastName(String lname) {
    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
    	return this;
	}
    public CreateLeadPage enterPhoneNumber(String phno) {
    	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
    	return this;
    }
    public ViewLeadPage clickOnCreateLeadButton() {
    	driver.findElement(By.name("submitButton")).click();
    	return new ViewLeadPage(driver);
	}

}
