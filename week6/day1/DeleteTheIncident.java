package week6.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class DeleteTheIncident extends BaseClassServiceNow {

	    @Test(priority=3)
		public void deleteTc() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys("INC0010065",Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table[@id='incident_table']/tbody/tr[1]/td[3]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[text()='Delete'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[text()='Delete'])[3]")).click();
        Thread.sleep(2000);
        String msg = driver.findElement(By.xpath("//div[@class='list2_empty-state-list']")).getText();
        if(msg.contains("No records to display")) {
        	System.out.println("The Incident is Deleted");
        }
        else {
        	System.out.println("The Incident is Not Deleted");
        }
        
		
	}

}
