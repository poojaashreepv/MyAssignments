package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClassLeafTaps;

public class DuplicateLeadPage extends BaseClassLeafTaps {
	public DuplicateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public DuplicateLeadPage clickOnDuplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return this;
	}
	public ViewLeadPage clickOnCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
    }

}
