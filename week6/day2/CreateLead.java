package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClassLeafTaps {

	String[][] data;
	@Test(dataProvider="CreateLead")
    public void createTc(String cname,String fname,String lname,String phno) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();

	}
	
	@DataProvider(name="CreateLead")
	public String[][] sendData() {	
		data=new String[2][4];
		
		data[0][0]="TestLeaf";
		data[0][1]="Hari";
		data[0][2]="R";
		data[0][3]="99";
		
		
		data[1][0]="TCS";
		data[1][1]="Sri";
		data[1][2]="A";
		data[1][3]="98";
		
		
		return data;
		
	}

}
