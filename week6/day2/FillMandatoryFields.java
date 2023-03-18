package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class FillMandatoryFields extends BaseClassServiceNow {
	@Test(priority=3,invocationCount=2,threadPoolSize=1)
	public void fillManFieldsTc() throws InterruptedException {
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Knowledge",Keys.ENTER);
		shadow.findElementByXPath("//span[text()='Knowledge']").click();
		WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//span[text()='Create an Article']")).click();
		Thread.sleep(2000);
		String number = driver.findElement(By.xpath("//input[@class='form-control disabled ']")).getAttribute("value");
		System.out.println("Number is " +number);
		driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys("IT",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Java",Keys.ENTER);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Automation Testing",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		System.out.println("New Article is Created");


	}

}
