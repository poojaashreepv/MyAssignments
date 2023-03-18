package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClassLeafTaps {
	String[][] data;
	@Test(priority=2,dataProvider="DuplicateLead")
	public void duplicateTc(String phno) throws InterruptedException {
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.name("submitButton")).click();
	}
	
	@DataProvider(name="DuplicateLead")
	public String[][] sendData() {	
		data=new String[2][1];
		
		
		data[0][0]="99";
		
		
		data[1][0]="98";
		
		
		
		return data;
	}

}
