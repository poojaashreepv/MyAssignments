package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewCaller extends BaseClassServiceNow {
    @Test(priority=1)
	public void createNewCallerTc() throws InterruptedException {
    	 Shadow shadow = new Shadow(driver);
    	 shadow.findElementByXPath("//input[@id='filter']").sendKeys("Callers",Keys.ENTER);
		 shadow.findElementByXPath("//span[text()='Callers']").click();
		 WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		 driver.switchTo().frame(frame1);
	     driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	     driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Poojaashree",Keys.ENTER);
	     driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("P V",Keys.ENTER);
	     driver.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys("ServiceNow",Keys.ENTER);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("poojaashree250@example.com",Keys.ENTER);
	     driver.findElement(By.xpath("//input[@id='sys_user.phone']")).sendKeys("123456789",Keys.ENTER);
	     driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("1234567890",Keys.ENTER);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
	     Thread.sleep(2000);
    }
         @Test(priority=2,dependsOnMethods={"createNewCallerTc"},alwaysRun=true)
	     public void verificationTc()  throws InterruptedException {
         Shadow shadow = new Shadow(driver);
     	 shadow.findElementByXPath("//input[@id='filter']").sendKeys("Callers",Keys.ENTER);
  		 shadow.findElementByXPath("//span[text()='Callers']").click();
    	 WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
    	 driver.switchTo().frame(frame1);
    	 Thread.sleep(2000);
	     driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Poojaashree",Keys.ENTER);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//table[@id='sys_user_table']/tbody/tr[1]/td[3]/a")).click();
	     Thread.sleep(2000);
	     String firstName = driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).getAttribute("value");
	     System.out.println("First Name is " +firstName);
	     String lastName = driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).getAttribute("value");
	     System.out.println("Last Name is " +lastName);
	     String title = driver.findElement(By.xpath("//input[@id='sys_user.title']")).getAttribute("value");
	     System.out.println("Title is " +title);
	     String email = driver.findElement(By.xpath("//input[@id='sys_user.email']")).getAttribute("value");
	     System.out.println("Email is " +email);
	     String businessPhone = driver.findElement(By.xpath("//input[@id='sys_user.phone']")).getAttribute("value");
	     System.out.println("Business Phone is " +businessPhone);
	     String mobilePhone = driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).getAttribute("value");
	     System.out.println("Mobile Phone is " +mobilePhone);
	     Thread.sleep(2000);
	     if((firstName.contains("Poojaashree") )&& (lastName.contains("P V")) && (title.contains("ServiceNow")) && (email.contains("poojaashree250@example.com")) && (businessPhone.contains("123456789")) && (mobilePhone.contains("1234567890"))) {
	    	 System.out.println("New Caller is Created ");
	     }
	     else {
	    	 System.out.println("New Caller is Not Created");
	     }

	     

	}

}
