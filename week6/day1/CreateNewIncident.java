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

public class CreateNewIncident extends BaseClassServiceNow {

	    @Test
		public void createTc() throws InterruptedException {
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		String incidentNumber = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println("Incident Number is " +incidentNumber);
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("ServiceNow",Keys.ENTER);
		driver.findElement(By.xpath("(//button[@class='form_action_button  action_context btn btn-default'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys(incidentNumber,Keys.ENTER);
        Thread.sleep(2000);
        String incidentNumCheck = driver.findElement(By.xpath("//table[@id='incident_table']/tbody/tr[1]/td[3]")).getText();
        if(incidentNumber.equals(incidentNumCheck)) {
        	System.out.println("Incident is Created ");
        	System.out.println("Incident Number is " +incidentNumber);
        }
        else {
        	System.out.println("Incident is not Created");
        }
		
    }

}
