package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		//Day2 Assignment 4
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
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("poojaashreepv@gamil.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement text = driver.findElement(By.linkText("Poojaashree"));
		System.out.println(text.getText());
		driver.findElement(By.linkText("Poojaashree")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
        String title = driver.getTitle();
		System.out.println(title);
        driver.findElement(By.className("smallSubmit")).click();
		driver.close();

	}

}
