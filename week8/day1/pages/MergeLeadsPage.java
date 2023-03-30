package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClassLeafTaps;

public class MergeLeadsPage extends BaseClassLeafTaps {
	 public String leadID;
	 public MergeLeadsPage(ChromeDriver driver) {
			this.driver=driver;
	}
     public MergeLeadsPage cickOnFromLeadWidget() {
    	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
    	return this;
     }
     public MergeLeadsPage switchToFindLeadsWindow() {
    	Set<String> allWindows = driver.getWindowHandles();
  		List<String> allhandles = new ArrayList<String>(allWindows);
  		driver.switchTo().window(allhandles.get(1));
  		return this;
     }
     public MergeLeadsPage enterFirstName(String fname) {
    	 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
    	 return this;
     }
     public MergeLeadsPage clickOnFindLeads1() {
    	 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    	 return this;
    	 
     }
     public MergeLeadsPage getFirstLeadIdText() throws InterruptedException {
    	 Thread.sleep(2000);
    	 leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).getText();
    	 return this;
     }
     public MergeLeadsPage clickOnFirstLeadId() throws InterruptedException {
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
    	 return this;
     }
     public MergeLeadsPage switchToMergeLeadsWindow() {
    	 Set<String> allWindows = driver.getWindowHandles();
   		 List<String> allhandles = new ArrayList<String>(allWindows);
   		 driver.switchTo().window(allhandles.get(0));
   		return this;
     }
     public MergeLeadsPage cickOnToLeadWidget() {
    	 driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
    	 return this;
     }
     public MergeLeadsPage switchToFindLeadsWindow1() {
    	 Set<String> allWindows2 = driver.getWindowHandles();
 		 List<String> allhandles2 = new ArrayList<String>(allWindows2);
 		 driver.switchTo().window(allhandles2.get(1));
 		 return this;
     }
     public MergeLeadsPage enterFirstName1(String fname1) {
    	 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname1);
    	 return this;
     }
     public MergeLeadsPage clickOnFindLeads2() {
    	 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    	 return this;
     }
     public MergeLeadsPage clickOnFirstLeadId1() throws InterruptedException {
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
    	 return this;
     }
     public MergeLeadsPage switchToMergeLeadsWindow1() {
    	 Set<String> allWindows2 = driver.getWindowHandles();
 		 List<String> allhandles2 = new ArrayList<String>(allWindows2);
    	 driver.switchTo().window(allhandles2.get(0));
    	 return this;
     }
     public MergeLeadsPage clickOnMerge() {
    	 driver.findElement(By.xpath("//a[text()='Merge']")).click();
    	 return this;
     }
     public MergeLeadsPage acceptAlert() {
    	 driver.switchTo().alert().accept();
    	 return this;
     }
     public MergeLeadsPage verifyLeadPresentOrNot() {
    	driver.findElement(By.linkText("Find Leads")).click();
 		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
 		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
 		String text = driver.findElement(By.className("x-paging-info")).getText();
 		if (text.equals("No records to display")) {
 			System.out.println("Text matched");
 		} else {
 			System.out.println("Text not matched");
 		}
 		return this;
     }
     
     
}
     