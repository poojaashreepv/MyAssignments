package week7.day1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClassLeafTaps {
	String[][] data;

	@BeforeClass
	public void setfileName() {
		filename="DuplicateLead";
	}
	
	@Test(priority=2,dataProvider = "fetchData", threadPoolSize = 6)
	public void duplicateTc(String phno) throws InterruptedException {
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.name("submitButton")).click();
	}

}
