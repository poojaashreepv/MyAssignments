package week6.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewProposal extends BaseClassServiceNow  {
	  @Test(enabled=true)
	  public void createNewProposalTc() throws InterruptedException {
		    Shadow shadow = new Shadow(driver);
		    shadow.findElementByXPath("//input[@id='filter']").sendKeys("Proposal",Keys.ENTER);
			shadow.findElementByXPath("//span[text()='My Proposals']").click();
			WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
			driver.switchTo().frame(frame1);
		    driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	        Thread.sleep(2000);
	        String number = driver.findElement(By.xpath("(//input[@type='text'])[1]")).getAttribute("value");
	        System.out.println("The Proposal Number is " +number);
	        driver.findElement(By.xpath("//input[@id='std_change_proposal.short_description']")).sendKeys("ServiceNow",Keys.ENTER);
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//button[@class='form_action_button  action_context btn btn-default'])[1]")).click();
	        Thread.sleep(2000);
	        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='std_change_proposal_table']/tbody/tr")); // //table[@id='std_change_proposal_table']/tbody/tr/td[3]/a
			int rsize = rowData.size();
			List<String> numbersList=new ArrayList<String>();
			System.out.println("List of Proposal Numbers : ");
			for(int i=1;i<=rsize;i++) {
				String numbers = driver.findElement(By.xpath("//table[@id='std_change_proposal_table']/tbody/tr["+i+"]/td[3]")).getText();
				System.out.println(numbers);
				numbersList.add(numbers);
			}
			if(numbersList.contains(number)){
				System.out.println("New Proposal is Created");
			}
			else {
				System.out.println("New Proposal is Not Created");
			}
		
		
	
        
        

	}

}
