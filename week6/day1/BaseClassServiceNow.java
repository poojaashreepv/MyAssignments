package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.sukgu.Shadow;

public class BaseClassServiceNow {
	public ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url,String username,String password) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//label[@for='user_name']")).click();
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//label[@for='user_password']")).click();
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Incidents",Keys.ENTER);
		shadow.findElementByXPath("//span[text()='Incidents']").click();
		WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	    driver.switchTo().frame(frame1);
		
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
