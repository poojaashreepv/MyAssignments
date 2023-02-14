package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Poojaashree");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Palanisamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Poojaa");
		driver.findElement(By.name("departmentName")).sendKeys("Software Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing the Product");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("poojaashreepv@gmail.com");
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd = new Select(state);
		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		companyname.clear();
		companyname.sendKeys("ABC Software Solutions");
		WebElement firstname=driver.findElement(By.id("createLeadForm_firstName"));
		firstname.clear();
		firstname.sendKeys("Poojaashree P V");
		driver.findElement(By.className("smallSubmit")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.close();
	}

}
