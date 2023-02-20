package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		//Day2 Assignment 3
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("12");
		driver.findElement(By.name("phoneNumber")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement leadid = driver.findElement(By.linkText("11135"));
		System.out.println(leadid.getText());
        driver.findElement(By.linkText("11135")).click();
		driver.findElement(By.linkText("Delete")).click(); 
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys("11135");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.close();	
		

	}

}
