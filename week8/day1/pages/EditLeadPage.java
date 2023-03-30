package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClassLeafTaps;

public class EditLeadPage extends BaseClassLeafTaps {
	    public EditLeadPage(ChromeDriver driver) {
		this.driver=driver;
	    }
	    public EditLeadPage clickOnEdit() { 
	    	driver.findElement(By.linkText("Edit")).click();
	    	return this;
		}
	    public EditLeadPage enterCompanyName(String cname) { 
	    	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
	    	return this;
	    }
	    public ViewLeadPage clickOnUpdate() { 
	    	driver.findElement(By.name("submitButton")).click();
	    	return new ViewLeadPage(driver);
	    }

}
