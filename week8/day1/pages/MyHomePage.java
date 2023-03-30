package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClassLeafTaps;

public class MyHomePage extends BaseClassLeafTaps {
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyLeadsPage clickOnLeads() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		return new MyLeadsPage(driver);
	}

}
