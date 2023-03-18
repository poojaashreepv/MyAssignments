package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class UpdateExistingIncident extends BaseClassServiceNow {
    @Test(priority=1)
	public void updateTc() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys("INC0010066",Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table[@id='incident_table']/tbody/tr[1]/td[3]/a")).click();
        Thread.sleep(2000);
        WebElement urgencyDropdown = driver.findElement(By.name("incident.urgency"));
		Select urgencydd=new Select(urgencyDropdown);
		Thread.sleep(2000);
		urgencydd.selectByVisibleText("1 - High");
		Thread.sleep(2000);
		String urgency = driver.findElement(By.xpath("(//option[@selected='SELECTED'])[1]")).getText();
		System.out.println("The Urgency is " +urgency);
		Thread.sleep(2000);
	    WebElement stateDropdown = driver.findElement(By.name("incident.state"));
		Select statedd=new Select(stateDropdown);
		Thread.sleep(2000);
		statedd.selectByVisibleText("In Progress");
		Thread.sleep(2000);
		String state = driver.findElement(By.xpath("(//option[@selected='SELECTED'])[2]")).getText();
		System.out.println("The State is " +state);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(2000);
		//6. Verify the priority and state 
		if(urgency.contains("High")) {
			if(state.contains("In Progress")) {
				System.out.println("The Priority is Updated as High and State is Updated as In Progress");
			}
			else {
				System.out.println("The Priority is Updated as High and State is Not Updated as In Progress");
			}
		
		}
		else {
			System.out.println("Both Priority and State is Not Updated");
		}
		
	}

}
