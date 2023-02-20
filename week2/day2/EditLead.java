package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		//Day2 Assignment 5
		ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click(); 
		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']/input[@name='firstName']")).sendKeys("Poojaashree");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.linkText("11131")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("ABC Software Solutions");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		driver.close();
		
	}

}
