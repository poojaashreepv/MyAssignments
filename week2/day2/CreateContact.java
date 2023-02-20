package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Poojaashree");
		driver.findElement(By.id("lastNameField")).sendKeys("Palanisamy");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Poojaashree");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Palanisamy");
		driver.findElement(By.name("departmentName")).sendKeys("Software Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Testing the product");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("poojaashreepv@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd=new Select(state);
		dd.selectByVisibleText("New York");
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Notes");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();  

	}

}
