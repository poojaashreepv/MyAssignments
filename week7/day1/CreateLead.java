package week7.day1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateLead extends BaseClassLeafTaps {
	String[][] data;

	@BeforeClass
	public void setfileName() {
		filename="CreateLead";
	}
	
	@Test(dataProvider = "fetchData", threadPoolSize = 6)
	public void runCreate(String cname, String fname, String lname, String phno) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();

	}

} 
