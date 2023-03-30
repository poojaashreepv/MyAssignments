package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClassLeafTaps;

public class LoginPage extends BaseClassLeafTaps {
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage enterUserName(String username) {
	driver.findElement(By.id("username")).sendKeys(username);
	return this;
	}
	public LoginPage enterPassword(String password) {
	driver.findElement(By.id("password")).sendKeys(password);
	return this;
	}
	public HomePage clickOnLoginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new HomePage(driver);
	}
}
