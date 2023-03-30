package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClassLeafTaps;

public class HomePage extends BaseClassLeafTaps {
	
	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
     public MyHomePage clickOnCrmsfa() {
    	 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
    	 return new MyHomePage(driver);
     }
}
