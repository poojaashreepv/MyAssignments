package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends BaseClassLeafTaps{
	String[][] data;
	@Test(priority=1,dataProvider="EditLead")
	public void editTc(String phno,String cname) throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.name("submitButton")).click();
	}
	
	@DataProvider(name="EditLead")
	public String[][] sendData() {	
		data=new String[2][2];
		
		
		data[0][0]="99";
		data[0][1]="TCS";
		
		data[1][0]="98";
		data[1][1]="TL";
		
		
		return data;
	}
}
