package week6.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class AssignTheIncident extends BaseClassServiceNow{

	    @Test(priority=2)
		public void assignTc() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys("INC0010064",Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table[@id='incident_table']/tbody/tr[1]/td[3]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[@class='form_header navbar-title navbar-title-twoline']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Default view']")).click();
        driver.findElement(By.xpath("//input[@id='sys_display.incident.assignment_group']")).clear();
        driver.findElement(By.xpath("//input[@id='sys_display.incident.assignment_group']")).sendKeys("Software",Keys.ENTER);
        Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Notes']")).click();
		driver.findElement(By.xpath("(//span[text()='Work notes'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='sn-stream-textarea-container'])[3]/textarea[@id='activity-stream-textarea']")).click();
		driver.findElement(By.xpath("(//div[@class='sn-stream-textarea-container'])[3]/textarea[@id='activity-stream-textarea']")).sendKeys("Automation Testing",Keys.ENTER);
		driver.findElement(By.xpath("(//button[text()='Update'])[2]")).click();
		Thread.sleep(2000);
		String workNotes = driver.findElement(By.xpath("(//div[@class='sn-widget sn-widget-textblock state-expanded'])[1]")).getText();
		System.out.println("Work Notes : " +workNotes);
		driver.findElement(By.xpath("//h1[@class='form_header navbar-title navbar-title-twoline']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Default view']")).click();
        String assignmentGroup = driver.findElement(By.xpath("//input[@id='sys_display.incident.assignment_group']")).getAttribute("value");
        System.out.println("Assignment Group : " +assignmentGroup);
        Thread.sleep(2000);
        
		if((workNotes.contains("Automation Testing")) && (assignmentGroup.contains("Software"))) {
        	System.out.println("Assignment Group and Work Notes is Updated");
        }
        else {
        System.out.println("Assignment Group and Work Notes is Not Updated");
        }
	}

}
